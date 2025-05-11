<%-- 
    Document   : admin_home
    Created on : May 5, 2025, 6:13:32 PM
    Author     : nikhil
--%>

<%@page import="java.sql.Timestamp"%>
<%@page import="model.CompletedReportTime"%>
<%@page import="model.SolvedComplain"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dto.DTO"%>
<%@page import="dao.UserDAO"%>
<%@page import="model.TotalComplain"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Eco Management - Admin Dashboard</title>
  <style>
    body {
      margin: 0;
      font-family: Arial, sans-serif;
      background-color: #e4ecdd;
    }
    header {
      background-color: #2f7d32;
      color: white;
      padding: 15px 20px;
      display: flex;
      justify-content: space-between;
      align-items: center;
    }
    header h1 {
      margin: 0;
      font-size: 24px;
    }
    nav a {
      color: white;
      margin-left: 20px;
      text-decoration: none;
      font-weight: bold;
    }
    .main-section {
        margin-top: 30px;
      text-align: center;
      padding: 60px 20px 20px;
    }
    .main-section h2 {
      font-size: 32px;
      margin-bottom: 10px;
      color: #222;
    }
    .main-section p {
      font-size: 16px;
      color: #444;
    }
    .cards {
      display: flex;
      justify-content: center;
      gap: 30px;
      flex-wrap: wrap;
      margin-top: 60px;
      padding-bottom: 60px;
    }
    
    .cards a{
        text-decoration: none;
        color: green;
        cursor: pointer;
    }
    .card {
        margin-left: 450px;
      margin-top: 20px;
      background-color: #f1f8e9;
      padding: 20px;
      border-radius: 10px;
      width: 500px;
      box-shadow: 0 3px 6px rgba(0,0,0,0.1);
      transition: transform 0.2s;
    }
    .card:hover {
      transform: scale(1.05);
    }
    .card h3 {
      color: #2f7d32;
    }
    .processbtn{
        margin-top: 10px;
        margin-left: 200px;
        cursor: pointer;
    }
    
    .resolvedbtn{
        cursor: pointer;
    }
    
    .footer {
      margin-top: 92px;
      margin-bottom: 0px;
      background-color: #145214;
      color: white;
      text-align: center;
      padding: 15px 10px;
      font-size: 14px;
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
<header>
  <h1>Eco Management</h1>
  <nav>
    <a href="admin_home.jsp">Dashboard</a>
    <a href="setting.jsp">Settings</a>
    <a href="logout.jsp">Logout</a>
  </nav>
</header>

<section class="main-section">

  
  <h2 style="margin-left: 20px">History of Solved User Complain</h2>
    
    <%
        SolvedComplain total_data = new SolvedComplain();
        ArrayList<Integer> total = new ArrayList<>();
        total = total_data.solvedComplain();
        
        for (int i = 0; i < total.size(); i++) {
        UserDAO userinfo = new UserDAO();
        DTO user1  = userinfo.userData(total.get(i));
//        DTO user = new DTO();
         username = user1.getUsername();
        
        
        CompletedReportTime crt = new CompletedReportTime();
        Timestamp time = crt.completedReportTime(total.get(i));
        
        byte[] image = user1.getImage();
        
        String request_time = user1.getRequest_time();
        String request_type = user1.getRequest_type();
        String location = user1.getLocation();
        String status = user1.getStatus();
        
        %>
    <div class="card">
<!--      <form action="UpdateUserComplain" method="post">-->
     <strong>Request Id :</strong><%=total.get(i)%><br>
      <strong>Username :</strong> <%=username %> <br>
      <strong>Request Time :</strong> <%=request_time %><br>
      <strong>Request Type :</strong> <%=request_type%><br>
      <strong>Location :</strong> <%=location%><br>
      <strong>Status :</strong> <%=status %><br>
       <strong>Resolved Time :</strong> <%=time %><br>
      <img src="ImageServlet?username=<%=username%>&time=<%=request_time%>" width="200" height="200" alt="Complaint Image"/>

      <input type="hidden" name="username" value="<%=username%>" >
      <input type="hidden" name="time" value="<%=request_time%>" >
      
    </div>
    <%
        }
    %>

  
  
</section>

    <div class="footer">
<footer>
 © Designed for a Greener Future 🌱 | Admin Panel
</footer>
    </div>
</body>
</html>
