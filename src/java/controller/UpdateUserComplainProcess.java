
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UpdateComplainAuthenticator;
import model.UpdateComplainProcessAuthenticator;

/**
 *
 * @author nikhil
 */
public class UpdateUserComplainProcess extends HttpServlet
{
   
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
       resp.sendRedirect("login.html");
    }
    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
       String username = req.getParameter("username");
       String time = req.getParameter("time");
       UpdateComplainProcessAuthenticator ua = new UpdateComplainProcessAuthenticator();
       boolean update = ua.isUpdate(username,time);
       
       if(update){
           resp.sendRedirect("complains.jsp");
           System.out.println("Update successfully");
       }
       else{
           resp.sendRedirect("adimn_home.jsp");
           System.out.println("Database didn't updated");
       }
       
    }
    
    

    
}
