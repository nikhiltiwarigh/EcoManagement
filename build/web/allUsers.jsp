<%-- 
    Document   : admin_home
    Created on : May 5, 2025, 6:13:32 PM
    Author     : nikhil
--%>

<%@page import="dao.UserInfoDAO"%>
<%@page import="model.AllUser"%>
<%@page import="model.TotalUser"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dto.DTO"%>
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
        margin-top: 0px;
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
    button{
        cursor: pointer;
    }
    .card a{
        text-decoration: none;
        color: red;
        cursor: pointer;
    }
    .card:hover {
      transform: scale(1.05);
    }
    .card h3 {
      color: #2f7d32;
    }
    
    .warningmsg{
        width: 350px;
        height: 30px;
        font-size: 15px;
        color: red;
        border: none;
        border-radius: 7px;
        padding: 5px;
    }
    
    .warnnig{
        color: red;
        margin-top: 10px;
    }
    
    .warnnig button{
        margin-top: 10px;
        padding: 10px;
        height: 40px;
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
    <a href="#">Settings</a>
    <a href="logout.jsp">Logout</a>
  </nav>
</header>

<section class="main-section">
  
  <h2 style="margin-left: 20px">Website Users</h2>
    
    <%
        AllUser total_data = new AllUser();
        ArrayList<Integer> total = new ArrayList<>();
        total = total_data.usersData();
        
        for (int i = 0; i < total.size(); i++) {
        UserInfoDAO userinfo = new UserInfoDAO();
        DTO user1  = userinfo.usersData(total.get(i));
//        DTO user = new DTO();
        int userid = user1.getUserid();
        username = user1.getUsername();
        name = user1.getName();
        String contact = user1.getContact();
        String email = user1.getEmail();
        String address = user1.getAddress();
        
        
        %>
    <div class="card">
      <form action="DeleteUserChecker" method="post">
      <strong>User Id :</strong> <%=userid %> <br>
      <strong>Name :</strong> <%=name %> <br>
      <strong>Username :</strong> <%=username %> <br>      
      <strong>Contact :</strong> <%=contact %> <br>
      <strong>Email :</strong> <%=email %> <br>
      <strong>Address :</strong> <%=address %> <br>
      <input type="hidden" name="id" value="<%=userid%>" >   <br>
      <button>Delete This User</button>
      
      </form>
      <form class="warnnig" action="WarningUser" method="post">
          <input class="warningmsg" type="text" name="msg" placeholder="Enter Warning Message">
          <input type="hidden" name="username" value="<%=username%>" >   <br>
          <button onclick="warning()">Warning to User</p></button>
      </form>
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
    <script>
        function warning(){
            alert("Your message send successfully to user");
        }
    </script>
</body>
</html>
