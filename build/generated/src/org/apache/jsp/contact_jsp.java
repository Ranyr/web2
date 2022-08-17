package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <style>\n");
      out.write("   #s1{\n");
      out.write("   background-color:rgb(255,250,250);\n");
      out.write("   width:310px;\n");
      out.write("   margin-left:520px;\n");
      out.write("   border-bottom:1px solid palevioletred;\n");
      out.write("   border-color:rgb(202,174,183);\n");
      out.write("   align:center;\n");
      out.write("   }\n");
      out.write("   #div1{\n");
      out.write("   background-color:rgb(202,174,183);\n");
      out.write("    width:310px;\n");
      out.write(" \n");
      out.write("     margin-left:520px;\n");
      out.write("    margin-top:130px;\n");
      out.write("      height:41px;\n");
      out.write("    align:center;\n");
      out.write("    text-align:\"center\";\n");
      out.write("   }\n");
      out.write("   #btn{\n");
      out.write("        background-color:rgb(233,219,232);\n");
      out.write("              border-radius:15px;   \n");
      out.write("       \n");
      out.write("       \n");
      out.write("   } \n");
      out.write("   #s2{\n");
      out.write("       width:250;\n");
      out.write("       \n");
      out.write("   }\n");
      out.write("    \n");
      out.write("    </style>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("     <body  bgcolor=\"#FEE1E8\">\n");
      out.write("      \n");
      out.write("        \n");
      out.write("        <form action=\"./contactform\">\n");
      out.write("         <table id=\"div1\" align=\"center\">   \n");
      out.write("        <div><th><td >CONTACT US</td></th></div>\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        <table style=\"align:center\"  id=\"s1\" cellspacing=\"11\">\n");
      out.write("            <tr ><td align=\"left\">Name</td></tr>\n");
      out.write("            <tr><td align=\"left\"><input size=\"33\" type=\"text\" name=\"t1\" placeholder=\"write your name here\" required></td></tr>\n");
      out.write("            <tr><td align=\"left\">Email</td></tr>\n");
      out.write("          <tr><td align=\"left\" id=\"s2\"><input  size=\"33\" type=\"text\" name=\"t2\" placeholder=\"enter your email address\" required></td></tr>\n");
      out.write("            <tr><td align=\"left\">Message</td></tr>\n");
      out.write("            <tr><td align=\"left\"><textarea   name=\"message\" placeholder=\"message\" rows=\"7\" cols=\"33\" maxlength=\"250\" required> </textarea></td></tr>\n");
      out.write("    \n");
      out.write("                   \n");
      out.write("            <tr><td align=\"Center\"><input type=\"submit\" value=\"SEND MESSAGE\" id=\"btn\"></td></tr>\n");
      out.write("       </table>\n");
      out.write("              \n");
      out.write("     \n");
      out.write("    </body>\n");
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
