package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class success_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/admin_header.html");
    _jspx_dependants.add("/footer1.html");
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Add User Success</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("  margin: 0;\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav {\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: black;\n");
      out.write("  color:#f2f2f2;\n");
      out.write("   font-size: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav-left{float:left; margian-left:5;}\n");
      out.write(".topnav a {\n");
      out.write("  float:right;\n");
      out.write("  align:right;\n");
      out.write("  color: #f2f2f2;\n");
      out.write("  text-align: right;\n");
      out.write("  padding: 10px 14px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 16px;\n");
      out.write("  height:13px;\n");
      out.write("  margin-top: 5px;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav a:hover {\n");
      out.write("  background-color: #ddd;\n");
      out.write("  color: red;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("    \n");
      out.write("\n");
      out.write("<div class=\"topnav\">\n");
      out.write("     <p class=\"topnav-left\">Online Food Delivery</p>\n");
      out.write("  \n");
      out.write("  <a href=\"index.jsp\">Home</a>\n");
      out.write(" <a href=\"cust_feed.jsp\">customers feedbacks</a>\n");
      out.write(" <a href=\"contact_feed.jsp\">contact  request's</a>\n");
      out.write(" <a href=\"viewusers.jsp\">manage items</a>\n");
      out.write("  <a href=\"userform.jsp\">Add items</a>\n");
      out.write("  <a href=\"admin_orderview.jsp\"> orders</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\r\n");
      out.write("    <h1><center>Record successfully saved!</center></h1>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "userform1.html", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write(".footer {\n");
      out.write("   position: fixed;\n");
      out.write("   left: 0;\n");
      out.write("   bottom: 0;\n");
      out.write("   width: 100%;\n");
      out.write("   background-color:black;\n");
      out.write("   color: white;\n");
      out.write("   text-align: center;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"footer\">\n");
      out.write("  <p>Welcome to Food Ordering System</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html> \n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
