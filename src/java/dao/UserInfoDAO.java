/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DbConnector;
import dto.DTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nikhi
 */
public class UserInfoDAO 
{
    
 public DTO usersData(int id)
  {
       
   DTO user=new DTO(); 
   try
   {
      Statement st=DbConnector.getStatement();
     
      String query="SELECT * FROM user WHERE userid ="+id+"";
       System.out.println("query="+query);
       
       ResultSet rs=st.executeQuery(query);
       if(rs.next())
       {
           user.setUserid(rs.getInt(1));
           user.setUsername(rs.getString(2));
           user.setName(rs.getString(3));
           user.setContact(rs.getString(5));
           user.setEmail(rs.getString(6));
           user.setAddress(rs.getString(7));
           
           return user;
       }
   }
       catch(SQLException e)
       {
         System.out.println(e);      
       }
   return null;
  }
}
