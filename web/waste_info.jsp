<%-- 
    Document   : waste_info
    Created on : May 10, 2025, 7:40:12 PM
    Author     : nikhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Eco Management - Waste Recycling Information</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      line-height: 1.6;
      margin: 0;
      padding: 0;
      background-color: #f4fdf2;
      color: #333;
    }
    
      html{
             scroll-behavior: smooth;
        }
    
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

    .header {
        
      padding-top: 20px;
      text-align: center;
    }

    section {
      padding: 20px 40px;
    }

    h2 {
      color: #2f7d32;
      margin-top: 30px;
    }

    ul {
      padding-left: 20px;
    }

    .contacts{
              padding: 3rem 2rem;
/*              background-color: rgb(51, 51, 51);*/
        }
        
        .contacts a{
            text-decoration: none;
              color: blue;
              cursor: pointer;
        }

    
    footer {
      background-color: #145214;
      color: white;
      text-align: center;
      padding: 15px;
      position: relative;
      bottom: 0;
      width: 100%;
    }

    .highlight {
      background-color: #d2f8d2;
      padding: 10px;
      border-left: 5px solid #2f7d32;
      margin: 20px 0;
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
 <nav>
        <h1>Eco Management</h1>
        <ul>
            <li><a href="home.jsp">Home</a></li>
            <li><a href="notification.jsp">Notification</a></li>
            <li><a href="#contact">Contact</a></li>
            <li><a href="logout.jsp" onclick="alert('loging out... ')">Logout</a></li>
        </ul>
    </nav>
    
   
  
  <h1 class="header">Learn About Waste Segregation and Recycling</h1>

<section>
  <h2>Types of Waste</h2>
  <p>Proper waste segregation helps in better recycling. Waste can be broadly categorized as:</p>
  <ul>
    <li><strong>Organic Waste:</strong> Kitchen waste, food scraps, garden trimmings</li>
    <li><strong>Recyclable Waste:</strong> Paper, cardboard, plastics, metals, glass</li>
    <li><strong>Hazardous Waste:</strong> Batteries, chemicals, e-waste</li>
    <li><strong>Inert Waste:</strong> Construction debris, ashes</li>
  </ul>

  <h2>Recycling Process</h2>
  <p>Recycling reduces pollution, conserves resources, and lowers carbon emissions. Key recycling steps include:</p>
  <ul>
    <li><strong>Collection:</strong> Waste is collected from homes, bins, and industries</li>
    <li><strong>Sorting:</strong> Separated by type at recycling centers</li>
    <li><strong>Processing:</strong> Materials are cleaned and processed into raw form</li>
    <li><strong>Remanufacturing:</strong> New products are made from recycled materials</li>
  </ul>

  <div class="highlight">
    ♻️ Did you know? Recycling 1 ton of paper saves about 17 trees and 7,000 gallons of water!
  </div>

  <h2>How You Can Help</h2>
  <ul>
    <li>Always segregate your dry and wet waste at home</li>
    <li>Rinse containers before putting them in recycling bins</li>
    <li>Donate old clothes and electronics to NGOs or recycling centers</li>
    <li>Use reusable bags, bottles, and containers</li>
  </ul>

  <h2>Government Initiatives</h2>
  <p>The Indian Government's Swachh Bharat Abhiyan promotes cleanliness and effective waste management. Your participation matters!</p>

  <div class="highlight">
    🌱 A cleaner planet begins with a cleaner neighborhood. Let’s manage waste wisely.
  </div>
</section>
  
  <section id="contact" class="contacts">
    <h2>Contact Us</h2>
    <P style="color:red ">“Before click the link to send us an email using your Gmail. You can switch accounts in Gmail if there is not option to switch account after the tab opens.”</P>
    <p>Email us : <a href="https://mail.google.com/mail/?view=cm&fs=1&to=nikhil143rtiwari@gmail.com&su=Complaint&body=Describe%20your%20problem%20here" target="_blank">
  nikhil143rtiwari@gmail.com
</a></p>
<!--    <p>Email: <a href="mailto:nikhil143rtiwari@gmail.com">nikhil143rtiwari@gmail.com</a></p>-->
    <p>Phone: +91-9876543210</p>

  </section>

<footer>
        <p> © Designed for a Greener Future 🌱</p>
    </footer>

</body>
</html>
