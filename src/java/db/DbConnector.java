
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nikhil
 */
public class DbConnector 
{
    static Connection con=null;
    static Statement st=null;
   
    static
    {
       try
       {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded");
        
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomangement","root","Nitin@321");
        System.out.println("Connected");
        
        st=con.createStatement();
       }
       catch(ClassNotFoundException e)
       {
           System.out.println(e);
       }
       catch(SQLException e)
       {
           System.out.println(e);
       }
       
    }
    
    
    public static Connection getConnection()
    {
        return con;
    }
    
    public static Statement getStatement()
    {
        return st;
    }
    
    
    
}
