
package model;

import db.DbConnector;
import dto.DTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nikhi
 */
public class TotalUser
{
 
    public int count()
  {
       
   DTO user=new DTO(); 
   try
   {
      Statement st=DbConnector.getStatement();
     
       String query = "SELECT COUNT(*) AS total FROM user";
       System.out.println("query="+query);
       
       ResultSet rs=st.executeQuery(query);
       if(rs.next())
       {
            int count = rs.getInt("total");
            System.out.println("Total users: " + count);
            return count;
       }
   }
       catch(SQLException e)
       {
         System.out.println(e);      
       }
   return 0;
  }
    
}
