package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dto.DTO;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Eco Management</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"home.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");

    String username = (String)session.getAttribute("username");
    String name = (String)session.getAttribute("name");
    
    if(username==null || username.trim().equals(""))
    {
        response.sendRedirect("login.html");
    }
    
      out.write("\n");
      out.write("        <img src=\"images/natureImg.png\" alt=\"Nature Image\" class=\"fixed-image\">\n");
      out.write("    <!-- Header Section -->\n");
      out.write("     <div id=\"showcase\">\n");
      out.write("    <header>\n");
      out.write("        <div class=\"logo\">Eco<span>Management</span></div>\n");
      out.write("        <nav>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"#home\">Home</a></li>\n");
      out.write("                <li><a href=\"#about\">About</a></li>\n");
      out.write("                <li><a href=\"#services\">Services</a></li>\n");
      out.write("                <li><a href=\"#contact\">Contact</a></li>\n");
      out.write("                <li><a href=\"#notifications\">Report</a></li>\n");
      out.write("                <li><a href=\"#imagestatus\">Image Status</a></li> <!-- Pending or Non-Pending -->\n");
      out.write("                <li><a href=\"logout.jsp\">Signout</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("         \n");
      out.write("         <h3 id=\"welcomeuser\">Welcome ");
      out.print(name);
      out.write("..!</h3>\n");
      out.write("      \n");
      out.write("\n");
      out.write("    <!-- Hero Section -->\n");
      out.write("    <section id=\"home\" class=\"hero\">\n");
      out.write("        <div class=\"hero-content\">\n");
      out.write("            <h1>Eco-Friendly Solutions for a Sustainable Future</h1>\n");
      out.write("            <p>Your partner in environmental management and sustainability.</p>\n");
      out.write("            <a href=\"upload.jsp\" class=\"btn\">Upload image</a>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- About Section -->\n");
      out.write("    <section id=\"about\" class=\"about\">\n");
      out.write("        <h2>About Us</h2>\n");
      out.write("        <p>\n");
      out.write("            At EcoManagement, we focus on providing eco-friendly solutions for individuals, businesses, and communities. Our mission is to promote sustainable living and environmental preservation for a greener tomorrow.\n");
      out.write("        </p>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- Services Section -->\n");
      out.write("    <section id=\"services\" class=\"services\">\n");
      out.write("        <h2>Our Services</h2>\n");
      out.write("        <div class=\"service-cards\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <h3>Waste Management</h3>\n");
      out.write("                <p>Efficient solutions for waste collection, recycling, and disposal.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <h3>Energy Solutions</h3>\n");
      out.write("                <p>Renewable energy solutions to reduce carbon footprints.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <h3>Environmental Consulting</h3>\n");
      out.write("                <p>Expert advice to achieve environmental compliance.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- Contact Section -->\n");
      out.write("    <section id=\"contact\" class=\"contact\">\n");
      out.write("        <h2>Contact Us</h2>\n");
      out.write("        <p>Get in touch with our team to learn how we can help you.</p>\n");
      out.write("        <a href=\"mailto:info@ecomanagement.com\" class=\"btn\">Email Us</a>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- Footer Section -->\n");
      out.write("    <footer>\n");
      out.write("        <p>&copy; 2024 EcoManagement. All rights reserved.</p>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write(" </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
