

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/SendMail"})
public class SendMail extends HttpServlet {


   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
      try{
      
      
   
      
    String to=request.getParameter("to");  
    String subject=request.getParameter("subject");  
    String msg=request.getParameter("msg");  
          
    Mailer.send(to, subject, msg);  
    out.print("message has been sent successfully"); 
      response.sendRedirect("placeordersuccess.jsp");
 
    out.close();  
      
      
      
      
      }
      catch(Exception e){out.println(e);}
    }

  
   

 

}
