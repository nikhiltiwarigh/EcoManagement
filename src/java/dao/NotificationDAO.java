
package dao;

import db.DbConnector;
import dto.Notification;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nikhi
 */
public class NotificationDAO
{
     public List<Notification> getNotifications(String username)
  {
       
      List<Notification> list = new ArrayList<>();
   try
   {
      Statement st=DbConnector.getStatement();
     
      String query="SELECT * FROM notifications WHERE username ='"+username+"'";
      System.out.println("query="+query);
       
       ResultSet rs=st.executeQuery(query);
       while(rs.next())
       {
                Notification n = new Notification();
                
                n.setId(rs.getInt("requestid"));
                n.setUsername(rs.getString("username"));
                n.setMessage(rs.getString("message"));
                n.setIsRead(rs.getBoolean("is_read"));
                n.setCreatedAt(rs.getTimestamp("created_at"));
                
                list.add(n);
       }
   }
       catch(SQLException e)
       {
         System.out.println(e);      
       }
   return list;
  }
}
