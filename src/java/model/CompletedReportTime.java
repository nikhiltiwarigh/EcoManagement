package model;

import java.sql.Timestamp;

import db.DbConnector;
import dto.Notification;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nikhil
 */
public class CompletedReportTime 
{
    public Timestamp completedReportTime(int requestid)
  {
   try
   {
      Statement st=DbConnector.getStatement();
     
      String query="SELECT created_at FROM notifications WHERE requestid ="+requestid+"";
      System.out.println("query="+query);
       
       ResultSet rs=st.executeQuery(query);
       if(rs.next())
       {
          Timestamp time = rs.getTimestamp("created_at");
            return time;   
       }
   }
       catch(SQLException e)
       {
         System.out.println(e);      
       }
   return null;
  } 
}
