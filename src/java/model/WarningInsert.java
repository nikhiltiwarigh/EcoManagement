
package model;

import db.DbConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author nikhil
 */
public class WarningInsert 
{
    public boolean insertNotification(String username,String msg)
    {
        try
        {
           Connection con = DbConnector.getConnection();
           PreparedStatement pst = con.prepareStatement("INSERT INTO notifications(username,message) VALUES (?,?)");
           
           pst.setString(1, username);
           pst.setString(2, msg);
           
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
