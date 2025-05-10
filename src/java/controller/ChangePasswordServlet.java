
package controller;

import dto.DTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ChangePassword;
import model.LoginAuthenticator;

/**
 *
 * @author nikhil
 */
public class ChangePasswordServlet extends HttpServlet
{

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        resp.sendRedirect("admin_home.jsp");
    }
    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        String cpassword = req.getParameter("cpassword");
        String npassword = req.getParameter("npassword");
        
        HttpSession session = req.getSession(true);
        String username = (String)session.getAttribute("username");
        
       DTO user = new DTO();
       user.setUsername(username);
       user.setPassword(cpassword);
        
       LoginAuthenticator la = new LoginAuthenticator();
       boolean login = la.isLogin(user);
       
       if(login){
           user.setPassword(npassword);
           ChangePassword cp = new ChangePassword();
           boolean isChange = cp.changePassword(user);
           
           if(isChange){
               resp.sendRedirect("admin_home_ChangedP.jsp");
           }
           else{
               resp.sendRedirect("settingFailP.jsp");
           }
       }
       else{
            resp.sendRedirect("settingFailP.jsp");
       }
        
    }

}
