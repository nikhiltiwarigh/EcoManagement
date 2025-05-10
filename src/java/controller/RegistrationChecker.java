package controller;

import dto.DTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.RegistrationAuthenticator;


public class RegistrationChecker extends HttpServlet 
{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
          resp.sendRedirect("registraion.html");
    }
    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
      String name=req.getParameter("name");
      String username=req.getParameter("username");
      String password=req.getParameter("password");
      String contact=req.getParameter("contact");
      String email=req.getParameter("email");
      String address=req.getParameter("address");
           
      DTO user = new DTO();
      
      user.setName(name);
      user.setUsername(username);
      user.setPassword(password);
      user.setContact(contact);
      user.setEmail(email);
      user.setAddress(address);
      
        RegistrationAuthenticator authenticator= new RegistrationAuthenticator();
        boolean registration = authenticator.isRegistration(user);
        
      if(registration)
      {
         resp.sendRedirect("login.html");
      }
      else
      {
          resp.sendRedirect("registration.html");
      }
      
    }   

}
