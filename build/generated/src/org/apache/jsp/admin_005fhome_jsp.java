package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\" />\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("  <title>Eco Management - Admin Dashboard</title>\n");
      out.write("  <style>\n");
      out.write("    body {\n");
      out.write("      margin: 0;\n");
      out.write("      font-family: Arial, sans-serif;\n");
      out.write("      background-color: #e4ecdd;\n");
      out.write("    }\n");
      out.write("    header {\n");
      out.write("      background-color: #2f7d32;\n");
      out.write("      color: white;\n");
      out.write("      padding: 15px 20px;\n");
      out.write("      display: flex;\n");
      out.write("      justify-content: space-between;\n");
      out.write("      align-items: center;\n");
      out.write("    }\n");
      out.write("    header h1 {\n");
      out.write("      margin: 0;\n");
      out.write("      font-size: 24px;\n");
      out.write("    }\n");
      out.write("    nav a {\n");
      out.write("      color: white;\n");
      out.write("      margin-left: 20px;\n");
      out.write("      text-decoration: none;\n");
      out.write("      font-weight: bold;\n");
      out.write("    }\n");
      out.write("    .main-section {\n");
      out.write("        margin-top: 30px;\n");
      out.write("      text-align: center;\n");
      out.write("      padding: 60px 20px 20px;\n");
      out.write("    }\n");
      out.write("    .main-section h2 {\n");
      out.write("      font-size: 32px;\n");
      out.write("      margin-bottom: 10px;\n");
      out.write("      color: #222;\n");
      out.write("    }\n");
      out.write("    .main-section p {\n");
      out.write("      font-size: 16px;\n");
      out.write("      color: #444;\n");
      out.write("    }\n");
      out.write("    .cards {\n");
      out.write("      display: flex;\n");
      out.write("      justify-content: center;\n");
      out.write("      gap: 30px;\n");
      out.write("      flex-wrap: wrap;\n");
      out.write("      margin-top: 60px;\n");
      out.write("      padding-bottom: 60px;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    .cards a{\n");
      out.write("        text-decoration: none;\n");
      out.write("        color: green;\n");
      out.write("        cursor: pointer;\n");
      out.write("    }\n");
      out.write("    .card {\n");
      out.write("      background-color: #f1f8e9;\n");
      out.write("      padding: 20px;\n");
      out.write("      border-radius: 10px;\n");
      out.write("      width: 250px;\n");
      out.write("      box-shadow: 0 3px 6px rgba(0,0,0,0.1);\n");
      out.write("      transition: transform 0.2s;\n");
      out.write("    }\n");
      out.write("    .card:hover {\n");
      out.write("      transform: scale(1.05);\n");
      out.write("    }\n");
      out.write("    .card h3 {\n");
      out.write("      color: #2f7d32;\n");
      out.write("    }\n");
      out.write("    .footer {\n");
      out.write("      margin-top: 92px;\n");
      out.write("      margin-bottom: 0px;\n");
      out.write("      background-color: #145214;\n");
      out.write("      color: white;\n");
      out.write("      text-align: center;\n");
      out.write("      padding: 15px 10px;\n");
      out.write("      font-size: 14px;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<header>\n");
      out.write("  <h1>Eco Management</h1>\n");
      out.write("  <nav>\n");
      out.write("    <a href=\"#\">Dashboard</a>\n");
      out.write("    <a href=\"#\">Settings</a>\n");
      out.write("    <a href=\"logout.jsp\">Logout</a>\n");
      out.write("  </nav>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<section class=\"main-section\">\n");
      out.write("  <h2>Welcome Admin</h2>\n");
      out.write("  <p>Manage reports, users, and system performance from one place.</p>\n");
      out.write("\n");
      out.write("  <div class=\"cards\">\n");
      out.write("      <a href=\"complains.jsp\">\n");
      out.write("    <div class=\"card\">\n");
      out.write("      <h3>View Reports</h3>\n");
      out.write("      <p>Check and verify reported environmental issues submitted by users.</p>\n");
      out.write("    </div>\n");
      out.write("      </a>\n");
      out.write("      <a href=\"allUsers.jsp\">\n");
      out.write("    <div class=\"card\">\n");
      out.write("      <h3>Manage Users</h3>\n");
      out.write("      <p>Control user access, permissions, and resolve user-related concerns.</p>\n");
      out.write("    </div>\n");
      out.write("      </a>\n");
      out.write("      <a>\n");
      out.write("    <div class=\"card\">\n");
      out.write("      <h3>Analytics</h3>\n");
      out.write("      <p>View stats on waste reports, resolution times, and regional trends.</p>\n");
      out.write("    </div>\n");
      out.write("      </a>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("    <div class=\"footer\">\n");
      out.write("<footer>\n");
      out.write("  Designed for a Greener Future 🌱 | Admin Panel\n");
      out.write("</footer>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
