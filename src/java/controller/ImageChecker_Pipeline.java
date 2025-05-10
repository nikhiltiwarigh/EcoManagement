
package controller;

import dto.DTO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ImageAuthenticator_Pipeline;


/**
 *
 * @author nikhil
 */
public class ImageChecker_Pipeline extends HttpServlet 
{

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
       resp.sendRedirect("login.html");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String image_path = "C:\\Users\\nikhi\\OneDrive\\Pictures\\"+req.getParameter("image");
        System.out.println("image path is : "+image_path);
        String requestType = "Pipeline";
        String location = req.getParameter("location");
        
        HttpSession session = req.getSession(true);
        String username = (String)session.getAttribute("username");
        DTO user = new DTO();
        user.setImage_path(image_path);
        user.setUsername(username);
        user.setLocation(location);
        
        ImageAuthenticator_Pipeline ia = new ImageAuthenticator_Pipeline();
        boolean image = ia.isVerify(user);
        
        if(image)
        {
        
            String message = "Your complaint has been registered!";
            req.setAttribute("message", message);
            RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
            dispatcher.forward(req, resp); 
            
           resp.sendRedirect("imageUploaded.jsp");
           System.out.println("image inserted");
        }
        else
        {
           resp.sendRedirect("upload.jsp");
            System.out.println("image not inserted");
        }
    }

}
