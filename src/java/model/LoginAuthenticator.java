package model;

import db.DbConnector;
import dto.DTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author nikhil
 */
public class LoginAuthenticator
{
   public boolean isLogin(DTO user)             //Because object ko reference hold karta hai
    {
     
        
        String tablePassword=null;
       
        String username = user.getUsername();
        String password = user.getPassword();
        
        Statement st=null;
        ResultSet rs=null;
        try
        {
            st=DbConnector.getStatement();
            String query = "SELECT password,name,role FROM user WHERE Username='"+username+"'";
            System.out.println("query = "+ query);
            rs=st.executeQuery(query);
            
            if(rs.next())
            {
                   tablePassword=rs.getString(1);
                   String name =rs.getString(2);                   
                   String role = rs.getString(3);
                   user.setName(name);
                   user.setRole(role);
//                   System.out.println(name);
//                   System.out.println(role);
            }
        }
        
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
     if(username!=null && password!=null && !username.trim().equals("") && password.equals(tablePassword))
     {
         return true;
     }
     return false;
    }
}
