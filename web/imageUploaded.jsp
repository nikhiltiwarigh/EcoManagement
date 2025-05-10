<%-- 
    Document   : upload
    Created on : Jan 23, 2025, 6:52:54 PM
    Author     : nikhil
--%>

<%@page import="dto.DTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Eco Management</title>
    <link rel="stylesheet" href="home.css">
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
        <img src="nature1rb.png" alt="Nature Image" class="fixed-image">
    <!-- Header Section -->
     <div id="showcase">
    <header>
        <div class="logo">Eco<span>Management</span></div>
        <nav>
            <ul>
                <li><a href="#home">Home</a></li>
                <li><a href="#about">About</a></li>
                <li><a href="#services">Services</a></li>
                <li><a href="#contact">Contact</a></li>
                <li><a href="#notifications">Report</a></li>
                <li><a href="logout.jsp">Signout</a></li>
            </ul>
        </nav>
    </header>
         
         <h3 id="welcomeuser">Welcome <%=name%>..!</h3>
      

    <!-- Hero Section -->
    <section id="home" class="hero">
        <div class="hero-content">
            <h1>Image Uploaded.</h1>
            
        </div>
    </section>

    <!-- About Section -->
    <section id="about" class="about">
        <h2>About Us</h2>
        <p>
            At EcoManagement, we focus on providing eco-friendly solutions for individuals, businesses, and communities. Our mission is to promote sustainable living and environmental preservation for a greener tomorrow.
        </p>
    </section>

    <!-- Services Section -->
    <section id="services" class="services">
        <h2>Our Services</h2>
        <div class="service-cards">
            <div class="card">
                <h3>Waste Management</h3>
                <p>Efficient solutions for waste collection, recycling, and disposal.</p>
            </div>
            <div class="card">
                <h3>Energy Solutions</h3>
                <p>Renewable energy solutions to reduce carbon footprints.</p>
            </div>
            <div class="card">
                <h3>Environmental Consulting</h3>
                <p>Expert advice to achieve environmental compliance.</p>
            </div>
        </div>
    </section>

    <!-- Contact Section -->
    <section id="contact" class="contact">
        <h2>Contact Us</h2>
        <p>Get in touch with our team to learn how we can help you.</p>
        <a href="mailto:info@ecomanagement.com" class="btn">Email Us</a>
    </section>

    <!-- Footer Section -->
    <footer>
        <p>&copy; 2024 EcoManagement. All rights reserved.</p>
    </footer>

 </div>
</body>
</html>

