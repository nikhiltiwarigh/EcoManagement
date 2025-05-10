package controller;

import dao.ComplainDAO;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import dao.UserDAO;
import dto.DTO;

public class ImageServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        System.out.println("Hello in image servlet");
        String username = request.getParameter("username");
        String time = request.getParameter("time");

        try {
            UserDAO dao = new UserDAO();
            DTO user = ComplainDAO.userDataByTime(username, time); // implement this method
            byte[] image = user.getImage();

            if (image != null) {
                response.setContentType("image/jpeg");
                OutputStream out = response.getOutputStream();
                out.write(image);
                out.flush();
                out.close();
            } else {
                response.getWriter().write("No image available.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
