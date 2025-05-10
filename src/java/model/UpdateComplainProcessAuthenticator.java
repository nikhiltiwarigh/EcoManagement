
package model;

import db.DbConnector;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nikhi
 */
public class UpdateComplainProcessAuthenticator
{
     public boolean isUpdate(String username,String time)
   {
        try
        {
            Statement st = DbConnector.getStatement();
            String query = "UPDATE request SET status = 'Process' where username='"+username+"' AND requesttime='"+time+"'";
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
