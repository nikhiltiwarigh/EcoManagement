
package model;

import db.DbConnector;
import dto.DTO;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nikhil
 */
public class ChangePassword
{
    public boolean changePassword(DTO user)
   {
        try
        {
            Statement st = DbConnector.getStatement();
            String query = "UPDATE user SET Password ="+user.getPassword()+" where username='"+user.getUsername()+"'";
            System.out.println(" Query = "+query);
            int i = st.executeUpdate(query);
            if(i>0)
            {
                return true;
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return false;
    }
}
