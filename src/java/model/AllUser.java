
package model;

import db.DbConnector;
import dto.DTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author nikhil
 */
public class AllUser
{
  public ArrayList usersData()
  {
   ArrayList<Integer> userId = new ArrayList<>();
   DTO user=new DTO(); 
   try
   {
      Statement st=DbConnector.getStatement();
     
      String query="SELECT userid FROM user WHERE role='user'";
      System.out.println("query="+query);
       
       ResultSet rs=st.executeQuery(query);
       while(rs.next())
       {
           userId.add(rs.getInt("userid"));
       }
       System.out.println("Total complaints: "+userId);
   }
       catch(SQLException e)
       {
         System.out.println(e);      
       }
   return userId;
  }
}

