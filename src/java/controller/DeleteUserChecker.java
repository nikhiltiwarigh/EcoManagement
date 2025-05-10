
package controller;

import dto.DTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DeleteUserAuthenticator;

/**
 *
 * @author nikhi
 */
public class DeleteUserChecker extends HttpServlet
{
     protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.sendRedirect("allUsers.jsp");
    } 
    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
       int userid =Integer.parseInt(req.getParameter("id"));
       DTO user = new DTO();
       user.setUserid(userid);
       
       DeleteUserAuthenticator dua = new DeleteUserAuthenticator();
       boolean isDelete = dua.deleteUser(user);
       
       if(isDelete)
       {
           resp.sendRedirect("allUsers.jsp");
       }
       else{
           resp.sendRedirect("admin_home.jsp");
       }
    }

}
