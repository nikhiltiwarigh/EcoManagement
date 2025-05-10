
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.WarningInsert;

/**
 *
 * @author nikhil
 */
public class WarningUser extends HttpServlet
{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        resp.sendRedirect("admin_home.jsp");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
     String username = req.getParameter("username");
     
          // 2. Add notification
          String msg = req.getParameter("msg");
          WarningInsert wi = new WarningInsert();
          boolean isNotify =wi.insertNotification(username, msg);
          
          if(isNotify){
              System.out.println("Notification added");
              resp.sendRedirect("allUsers.jsp");
          }
          else{
              System.out.println("Notification didn't add on database");
              resp.sendRedirect("admin_home.jsp");
          }
    }
    
}
