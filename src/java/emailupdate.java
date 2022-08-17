

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class emailupdate extends HttpServlet {
 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         response.setContentType("text/html;charset=UTF-8");
         PrintWriter out = response.getWriter();
       
       final String fromuser="radhunayyar@gmail.com";
       final String password="hikehike13";//username
       String emailto,subject,msg; //email
     
       emailto=request.getParameter("t1"); 
       subject="confirmation email";
       msg="hello radhu you are done with verfication";
       
       
       
       Properties props=new Properties();
       props.put("mail.smtp.auth",true);
       props.put("mail.smtp.starttls.enable",true);
       props.put("mail.smtp.host","smtp.gmail.com");
       props.put("mail.smtp.port","587");
       
     
       
       Session ses=Session.getInstance( props,new javax.mail.Authenticator() 
       {
          protected PasswordAuthentication getPasswordAuthentication()
          {return new PasswordAuthentication(fromuser,password);}
       } );
       
       try
       {
          Message message=new MimeMessage(ses);
          message.setFrom(new InternetAddress(emailto));
          message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(emailto));
          MimeBodyPart textpart=new MimeBodyPart();
          Multipart multipart=new MimeMultipart();
          
          String final_text="emailto: "+emailto+" "+"subject: "+subject+" "+"message: "+message+"  ";
          textpart.setText(final_text);
          
          message.setSubject(subject);
          multipart.addBodyPart(textpart);
          message.setSubject("contact Details");
          
          Transport.send(message);
          out.println("<center><h2 style='color:green;'>email sent successfully</h2></center>");
          out.println("thankyou +"+emailto+" , your message has been submitted to us");
       }
       catch(Exception e){out.println(e);}
      
    }
}

