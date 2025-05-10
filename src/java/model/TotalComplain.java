/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DbConnector;
import dto.DTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nikhi
 */
public class TotalComplain 
{
 
    public int count()
  {
       
   DTO user=new DTO(); 
   try
   {
      Statement st=DbConnector.getStatement();
     
       String query = "SELECT COUNT(*) AS total FROM request";
       System.out.println("query="+query);
       
       ResultSet rs=st.executeQuery(query);
       if(rs.next())
       {
            int count = rs.getInt("total");
            System.out.println("Total complaints: " + count);
           return count;
       }
   }
       catch(SQLException e)
       {
         System.out.println(e);      
       }
   return 0;
  }
    
}
