
package dao;

import db.DbConnector;
import dto.DTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nikhil
 */
public class UserDAO 
{
     public DTO userData(int id)
  {
       
   DTO user=new DTO(); 
   try
   {
      Statement st=DbConnector.getStatement();
     
      String query="SELECT * FROM request WHERE requestid ="+id+"";
      System.out.println("query="+query);
       
       ResultSet rs=st.executeQuery(query);
       if(rs.next())
       {
           user.setUsername(rs.getString(2));
           user.setImage(rs.getBytes(3));
           user.setRequest_time(rs.getString(4));
           user.setRequest_type(rs.getString(5));
           user.setLocation(rs.getString(6));
           user.setStatus(rs.getString(7));
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
