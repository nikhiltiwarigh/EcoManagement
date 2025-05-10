
package model;

import db.DbConnector;
import dto.DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author nikhil
 */
public class RegistrationAuthenticator 
{
    public boolean isRegistration(DTO user)
    {
        try
        {
           Connection con = DbConnector.getConnection();
           PreparedStatement pst = con.prepareStatement("INSERT INTO user(username,name,password,contact,email,address) VALUES (?,?,?,?,?,?)");
           
           pst.setString(1, user.getUsername());
           pst.setString(2, user.getName());
           pst.setString(3, user.getPassword());
           pst.setString(4, user.getContact());
           pst.setString(5, user.getEmail());
           pst.setString(6, user.getAddress());
           
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
