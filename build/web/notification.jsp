<%-- 
    Document   : home
    Created on : Jan 22, 2025, 11:49:04 PM
    Author     : nikhil
--%>

<%@page import="java.util.List"%>
<%@page import="dto.Notification"%>
<%@page import="dao.NotificationDAO"%>
<%@page import="dto.DTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Eco Management - Home</title>
    <style>
        /* General body styling */
        body {
            margin: 0;
            font-family: 'Arial', sans-serif;
            background-color: #f1f8e9; /* Light eco-friendly background */
            color: #2e7d32; /* Dark green text */
        }
        
        html{
             scroll-behavior: smooth;
        }

        /* Navigation Bar */
        nav {
            background-color: #2e7d32;
            color: white;
            display: flex;
            justify-content: space-between;
            padding: 10px 20px;
            align-items: center;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.2);
        }

        nav h1 {
            margin: 0;
            font-size: 1.5em;
        }

        nav ul {
            list-style: none;
            display: flex;
            margin: 0;
            padding: 0;
        }

        nav ul li {
            margin-left: 20px;
        }

        nav ul li a {
            cursor: pointer;
            text-decoration: none;
            color: white;
            font-weight: bold;
            transition: color 0.3s ease;
        }

        nav ul li a:hover {
            color: #c8e6c9; /* Light green hover effect */
        }

        nav ul li button {
            background-color: #2e7d32; /* Same green as About and Contact */
            color: white;
            border: none;
            padding: 10px 20px;
            cursor: pointer;
            font-weight: bold;
            transition: background 0.3s ease;
            border-radius: 5px;
        }

        nav ul li button:hover {
            background-color: #1b5e20; /* Darker green hover effect */
        }

        /* Hero Section with Nature Pattern Background */
        .hero {
            background-image: url('https://source.unsplash.com/1600x900/?forest,trees,green'); /* Nature image */
            background-size: cover;
            background-position: center;
            height: 60vh;
            display: flex;
            justify-content: center;
            align-items: center;
            text-align: center;
            color: white;
            text-shadow: 1px 1px 4px #000;
            position: relative;
        }

        /* Nature Pattern Behind Text */
        .hero::before {
            content: "";
            position: absolute;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
            background-color: rgba(0, 0, 0, 0.4); /* Semi-transparent black overlay */
            background-image: url('https://cdn.pixabay.com/photo/2017/06/14/16/10/leaf-2400147_960_720.png'); /* Leaf Pattern */
            background-repeat: no-repeat;
            background-size: 200px;
            opacity: 0.2;
        }

        .hero h2 {
            font-size: 2.5em;
            margin: 0 10px;
            color: black; /* Set the color of the heading text to black */
            position: relative;
        }

        .hero p {
            font-size: 1.2em;
        }

        /* Features Section */
        .features {
            padding: 30px 20px;
            background-color: white;
            display: flex;
            justify-content: center;
            flex-wrap: wrap;
        }
        
        .features a{
            text-decoration: none;
            color: green;
            cursor: pointer;
        }

        .feature-card {
            background-color: #f1f8e9;
            width: 250px;
            margin: 15px;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            text-align: center;
            transition: transform 0.3s ease, box-shadow 0.3s ease;
        }

        .feature-card:hover {
            transform: translateY(-5px);
            box-shadow: 0 6px 10px rgba(0, 0, 0, 0.2);
        }

        .feature-card img {
            width: 60px;
            margin-bottom: 15px;
        }

        .feature-card h3 {
            margin: 10px 0;
            color: #1b5e20;
        }

        .feature-card p {
            font-size: 0.9em;
            color: #555;
        }

        /* Call-to-Action Section */
        .cta {
            background-color: #2e7d32;
            color: white;
            padding: 30px 20px;
            text-align: center;
        }

        .cta h2 {
            margin: 0 0 15px;
            font-size: 2em;
        }

        .cta button {
            padding: 10px 20px;
            font-size: 1em;
            color: #2e7d32;
            background-color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background 0.3s ease;
        }

        .cta button:hover {
            background-color: #c8e6c9;
        }

        
        .contacts{
              padding: 3rem 2rem;
/*              background-color: rgb(51, 51, 51);*/
        }
        
        .card {
      color: black;
      margin-left: 450px;
      margin-top: 40px;
      margin-bottom: 40px;
      background-color: #f1f8e9;
      padding: 20px;
      border-radius: 10px;
      width: 500px;
      box-shadow: 0 3px 6px rgba(0,0,0,0.1);
      transition: transform 0.2s;
    }
    
    .card strong{
        margin-bottom: 20px;
    }
/*    .card:hover {
      transform: scale(1.05);
    }*/
        
        .contacts a{
            text-decoration: none;
              color: blue;
              cursor: pointer;
        }
        /* Footer */
        footer {
            background-color: #1b5e20;
            color: white;
            text-align: center;
            padding: 10px;
            font-size: 0.9em;
        }
    </style>
</head>
<body>
    <%
    String username = (String)session.getAttribute("username");
    String name = (String)session.getAttribute("name");
    
    if(username==null || username.trim().equals(""))
    {
        response.sendRedirect("login.html");
    }
    %>
    <!-- Navigation Bar -->
    <nav>
        <h1>Eco Management</h1>
        <ul>
            <li><a href="home.jsp">Home</a></li>
            <li><a href="notification.jsp">Notification</a></li>
            <li><a href="#contact">Contact</a></li>
            <li><a href="logout.jsp" onclick="alert('loging out... ')">Logout</a></li>
        </ul>
    </nav>
    
    <!-- Hero Section with Nature Pattern Background -->
   
<div class="card">
    <h3>Notifications :</h3>
     <%
         username = (String) session.getAttribute("username");
         NotificationDAO dao = new NotificationDAO();
         List<Notification> list = dao.getNotifications(username);
         int i =1;
         for(Notification n : list) {
%>
<div><h3><%= i %>. <%= n.getMessage() %> - <%= n.getCreatedAt() %> </h3></div><br>
<%
    i++;
}
%>
            
</div>   
            
    <section id="contact" class="contacts">
    <h2>Contact Us</h2>
    <P style="color:red ">“Before click the link to send us an email using your Gmail. You can switch accounts in Gmail if there is not option to switch account after the tab opens.”</P>
    <p>Email us : <a href="https://mail.google.com/mail/?view=cm&fs=1&to=nikhil143rtiwari@gmail.com&su=Complaint&body=Describe%20your%20problem%20here" target="_blank">
  nikhil143rtiwari@gmail.com
</a></p>
<!--    <p>Email: <a href="mailto:nikhil143rtiwari@gmail.com">nikhil143rtiwari@gmail.com</a></p>-->
    <p>Phone: +91-9876543210</p>

  </section>

    <!-- Call-to-Action Section -->
        <!-- Footer -->
    <footer>
        <p> © Designed for a Greener Future 🌱</p>
    </footer>
</body>
</html>
