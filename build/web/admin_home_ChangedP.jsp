<%-- 
    Document   : admin_home
    Created on : May 5, 2025, 6:13:32 PM
    Author     : nikhil
--%>

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
      background-color: #f1f8e9;
      padding: 20px;
      border-radius: 10px;
      width: 250px;
      box-shadow: 0 3px 6px rgba(0,0,0,0.1);
      transition: transform 0.2s;
    }
    .card:hover {
      transform: scale(1.05);
    }
    .card h3 {
      color: #2f7d32;
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
  <h2>Welcome Admin</h2>
  <p>Manage reports, users, and system performance from one place.</p>

  <div class="cards">
      <a href="complains.jsp">
    <div class="card">
      <h3>View Reports</h3>
      <p>Check and verify reported environmental issues submitted by users.</p>
    </div>
      </a>
      <a href="allUsers.jsp">
    <div class="card">
      <h3>Manage Users</h3>
      <p>Control user access, permissions, and resolve user-related concerns.</p>
    </div>
      </a>
      <a href="history.jsp">
    <div class="card">
      <h3>History</h3>
      <p>View history of solved user reports, resolution times.</p>
    </div>
      </a>
  </div>
</section>

    <div class="footer">
<footer>
  © Designed for a Greener Future 🌱 | Admin Panel
</footer>
    </div>

<script>

window.onload = function() {
  alert("You Password has changed Successfully.");
};

</script>

</body>
</html>
