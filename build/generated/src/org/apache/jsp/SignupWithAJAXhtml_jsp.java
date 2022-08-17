package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignupWithAJAXhtml_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <script>\n");
      out.write("            function signup()\n");
      out.write("            {\n");
      out.write("                var username = document.getElementById(\"username\").value;\n");
      out.write("                var password = document.getElementById(\"password\").value;\n");
      out.write("                var email = document.getElementById(\"email\").value;\n");
      out.write("                var phoneno = document.getElementById(\"phoneno\").value;\n");
      out.write("                var photo = document.getElementById(\"photo\").files[0];\n");
      out.write("\n");
      out.write("                if (username == \"\" || password == \"\" || email == \"\" || phoneno == \"\" || photo == \"\")\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"errormessage\").innerHTML = \"Please fill all fields\";\n");
      out.write("                    document.getElementById(\"errormessage\").style.color = \"red\";\n");
      out.write("                } else\n");
      out.write("                {\n");
      out.write("                    var formdata = new FormData();\n");
      out.write("                    formdata.append(\"username\", username);\n");
      out.write("                    formdata.append(\"password\", password);\n");
      out.write("                    formdata.append(\"email\", email);\n");
      out.write("                    formdata.append(\"phoneno\", phoneno);\n");
      out.write("                    formdata.append(\"photo\", photo);\n");
      out.write("\n");
      out.write("                    var xml = new XMLHttpRequest();\n");
      out.write("                    xml.onreadystatechange = function () {\n");
      out.write("\n");
      out.write("                        if (xml.readyState == 4 && xml.status == 200)\n");
      out.write("                        {\n");
      out.write("                            var res = xml.responseText;\n");
      out.write("                            res = res.trim();\n");
      out.write("                            if (res == \"success\")\n");
      out.write("                            {\n");
      out.write("                                document.getElementById(\"errormessage\").innerHTML = \"Signup Successful <a href=\\\"LoginWithAJAX.html\\\" >Login?</a>\";\n");
      out.write("\n");
      out.write("                                document.getElementById(\"errormessage\").style.color = \"green\";\n");
      out.write("\n");
      out.write("                                document.getElementById(\"username\").value = \"\";\n");
      out.write("                                document.getElementById(\"password\").value = \"\";\n");
      out.write("                                document.getElementById(\"email\").value = \"\";\n");
      out.write("                                document.getElementById(\"phoneno\").value = \"\";\n");
      out.write("                                document.getElementById(\"photo\").value = \"\";\n");
      out.write("\n");
      out.write("\n");
      out.write("                            } else\n");
      out.write("                            {\n");
      out.write("                                document.getElementById(\"errormessage\").innerHTML = \"Username already exist\";\n");
      out.write("                                document.getElementById(\"errormessage\").style.color = \"red\";\n");
      out.write("\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                    };\n");
      out.write("                    xml.open(\"post\", \"signupwithajax\", true);\n");
      out.write("                    xml.send(formdata);\n");
      out.write("\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          <form >\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" id=\"username\" placeholder=\"Enter Username\" class=\"form-control\" />\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"password\" id=\"password\" placeholder=\"Enter Password\" class=\"form-control\" />\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"email\" id=\"email\" placeholder=\"Enter Email\" class=\"form-control\" />\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"number\" id=\"phoneno\" placeholder=\"Enter Phoneno\" class=\"form-control\" />\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Choose Photo: </label>\n");
      out.write("                            <input type=\"file\" id=\"photo\"  class=\"form-control\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"button\" class=\"btn btn-primary\" value=\"Signup\" onclick=\"signup()\"  />\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("           <h5 id=\"errormessage\"></h5>\n");
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
