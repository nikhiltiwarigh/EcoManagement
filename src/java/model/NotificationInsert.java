
package model;

import db.DbConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author nikhil
 */
public class NotificationInsert 
{
    public boolean insertNotification(int requestid,String username,String msg)
    {
        try
        {
           Connection con = DbConnector.getConnection();
           PreparedStatement pst = con.prepareStatement("INSERT INTO notifications(requestid,username,message) VALUES (?,?,?)");
           
           pst.setInt(1, requestid);
           pst.setString(2, username);
           pst.setString(3, msg);
           
           int i = pst.executeUpdate();
           if(i>0)
           {
               return true;
           } 
        }
        catch (SQLException ex) 
        {
            System.out.println(ex);   
        }
        return false;
    }
}
