<%-- 
    Document   : setting
    Created on : May 10, 2025, 11:57:51 PM
    Author     : nikhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Settings - Eco Management</title>
  <style>
    body {
      margin: 0;
      font-family: Arial, sans-serif;
      transition: background-color 0.3s, color 0.3s;
      background-color: #f5f5f5;
      color: #000;
    }

    header {
      background-color: #1b5e20;
      padding: 15px 20px;
      color: white;
      text-align: center;
    }

    .container {
      padding: 40px;
      max-width: 600px;
      margin: auto;
    }

    h2 {
      margin-bottom: 20px;
    }

    .section {
      margin-bottom: 40px;
    }

    label {
      display: block;
      margin: 10px 0 5px;
    }

    input[type="password"] {
      width: 100%;
      padding: 8px;
      border: 1px solid #ccc;
      border-radius: 5px;
    }

    button {
      margin-top: 10px;
      padding: 10px 20px;
      background-color: #2e7d32;
      color: white;
      border: none;
      border-radius: 5px;
      cursor: pointer;
    }

    .theme-toggle {
      margin-top: 10px;
    }

    .light-mode {
        background-color: #121212;
        color: #fff;
      
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
    <h1>Settings</h1>
  </header>

  <div class="container">
    <div class="section">
      <h2>Change Password</h2>
      <form action="ChangePasswordServlet" method="post">
        <label for="cpassword">Current Password:</label>
        <input type="password" name="cpassword" id="current" name="currentPassword" required>

        <label for="npassword">New Password:</label>
        <input type="password" name="npassword" id="new" name="newPassword" required>

        <button type="submit">Update Password</button>
      </form>
    </div>

    <div class="section">
      <h2>Theme Mode</h2>
      <button onclick="toggleTheme()">Toggle Dark/Light Mode</button>
    </div>
  </div>

  <script>
    function toggleTheme() {
      document.body.classList.toggle('light-mode');
    }

  </script>
</body>
</html>
