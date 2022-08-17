

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


public class signupwithajax extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
         response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String phoneno = request.getParameter("phoneno");

        try {
            
             Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/project","root","root");

             Statement st=con.createStatement();
  // ResultSet rs=st.executeQuery("SELECT username,password FROM acc WHERE username='"+a1+"'AND password='"+a2+"'");
            
            
            ResultSet rs = st.executeQuery("select * from users2 where username='" + username + "'");
            if (rs.next()) {
                out.println("fail");
            } else {

                Part filepart = request.getPart("photo");
                String absolutepath = request.getServletContext().getRealPath("/uploads");
                String newname = System.currentTimeMillis() + "";
                String filename = FileUploader.savefileonserver(filepart, absolutepath, newname);
                String filepath = "uploads/" + filename;

                rs.moveToInsertRow();
                rs.updateString("username", username);
                rs.updateString("password", password);
                rs.updateString("email", email);
                rs.updateString("phoneno", phoneno);
                rs.updateString("photo", filepath);
                rs.insertRow();

                out.println("success");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
      
    }

}
