package controller;

import dto.DTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.LoginAuthenticator;

/**
 *
 * @author nikhil
 */
public class LoginChecker extends HttpServlet 
{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        resp.sendRedirect("login.html");
    }
    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
       String username = req.getParameter("username");
       String password = req.getParameter("password");
       
       DTO user = new DTO();
       user.setUsername(username);
       user.setPassword(password);
       
       LoginAuthenticator la = new LoginAuthenticator();
       boolean login = la.isLogin(user);
        
        if(login)
        {
            String name = user.getName();
            String role = user.getRole();
            HttpSession session = req.getSession(true);   //enable session
            session.setAttribute("username",username);
            session.setAttribute("name",name);
            session.setAttribute("role",role);
            if(role.equalsIgnoreCase("admin"))
            {
                resp.sendRedirect("admin_home.jsp");
            }
            else{
                resp.sendRedirect("home.jsp");
            }
            
        }
        else
        {
           resp.sendRedirect("loginFail.html");
        }
       
    }
}
