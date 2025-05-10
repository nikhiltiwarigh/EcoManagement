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
import java.util.ArrayList;

/**
 *
 * @author nikhi
 */
public class PendingComplain
{
     public ArrayList pendingComplain()
  {
       
   DTO user=new DTO(); 
   ArrayList<Integer> userID = new ArrayList<>();
   try
   {
      Statement st=DbConnector.getStatement();
     
       String query = "SELECT requestid FROM request where status ='pending' OR status ='process'";
       System.out.println("query="+query);
       
       ResultSet rs=st.executeQuery(query);
       while(rs.next())
       {
            userID.add(rs.getInt("requestid"));
           
       }
       System.out.println("Total complaints: "+userID);
       
   }
       catch(SQLException e)
       {
         System.out.println(e);      
       }
    return userID;
  }
}
