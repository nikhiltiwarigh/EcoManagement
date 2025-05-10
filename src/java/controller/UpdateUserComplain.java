
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.NotificationInsert;
import model.UpdateComplainAuthenticator;

/**
 *
 * @author nikhil
 */
public class UpdateUserComplain extends HttpServlet
{
   
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
       resp.sendRedirect("login.html");
    }
    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
       String username = req.getParameter("username");
       String time = req.getParameter("time");
       UpdateComplainAuthenticator ua = new UpdateComplainAuthenticator();
       boolean update = ua.isUpdate(username,time);
       
       if(update){
           resp.sendRedirect("complains.jsp");
           System.out.println("Update successfully");
           
           int requestid = Integer.parseInt(req.getParameter("requestid"));
           // 2. Add notification
          String msg = "Your complaint registered at " + time + " has been resolved.";
          NotificationInsert ni = new NotificationInsert();
          boolean isNotify =ni.insertNotification(requestid,username, msg);
          
          if(isNotify){
              System.out.println("Notification added");
          }
          else{
              System.out.println("Notification didn't add on database");
          }
          
          
          
          
          
          
       }
       else{
           resp.sendRedirect("adimn_home.jsp");
           System.out.println("Database didn't updated");
       }
       
    }
    
    

    
}
