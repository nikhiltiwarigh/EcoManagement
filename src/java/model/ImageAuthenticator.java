
package model;

import db.DbConnector;
import dto.DTO;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author nikhil
 */
public class ImageAuthenticator 
{
 public boolean isVerify(DTO user)
 {
     String image_path=user.getImage_path();
      try
        {
           Connection con = DbConnector.getConnection();
           PreparedStatement pst = con.prepareStatement("INSERT INTO request(username,Image,RequestType,Location,Status) VALUES (?,?,?,?,?)");
          
           FileInputStream fileInputStream = new FileInputStream(image_path);    //pass value on constructor
           byte[] image = new byte[fileInputStream.available()];                 //store value in byte form
           fileInputStream.read(image);   //It reads the contents of an image file and stores the data in a byte array.
           
           pst.setString(1, user.getUsername());
           pst.setBytes(2, image );
           pst.setString(3, "Garbage");
           pst.setString(4, user.getLocation());
           pst.setString(5, "Pending");
           
           int i = pst.executeUpdate();
           if(i>0)
           {
               return true;
           } 
        }
        catch (SQLException ex) 
        {
            System.out.println(ex);   
        } catch (IOException ex) 
        {
             System.out.println(ex);  
     }
        return false;
 }
}
