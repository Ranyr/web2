<%-- 
    Document   : bill
    Created on : 4 Jun, 2020, 2:07:24 PM
    Author     : radhika
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <%@ include file="header.html"%>
      <form action="order_msg.jsp">
          <body bgcolor="#FEE1E8">
       
        <%      
  
 
  session=request.getSession(false);
  
  

   
            String a1=(String)session.getAttribute("n16");
                String a2=(String)session.getAttribute("n3333");
                   String a3=(String)session.getAttribute("n4444");
                      String a4=(String)session.getAttribute("n5555");
                         String a5=(String)session.getAttribute("n6666");
                            String a6=(String)session.getAttribute("n8888");
                               String a7=(String)session.getAttribute("n9999");
                                       String a8=(String)session.getAttribute("n1000");
                                                String a9=(String)session.getAttribute("x2");


 
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
        PreparedStatement stat=con.prepareStatement("Insert into uorder values(?,?,?,?,?,?,?,?,?)");
       
        stat.setString(1,a1);        
        stat.setString(2,a2);    
        stat.setString(3,a3);    
        stat.setString(4,a4);    
        stat.setString(5,a5);        
        stat.setString(6,a6);    
        stat.setString(7,a7); 
        stat.setString(8,a8);
        stat.setString(9,a9);//total
         stat.executeUpdate();
                
    %>
        <h1><center>our service supports cash on delivery</center></h1><br>
        
        <h3><center>you have to pay <%=a9%> while receiving an order</center></h3>
        <p> <center>   <input type="submit" value="ok"></center></p>
        
    </body>
    </form>
     <%@ include file="footer1.html"%>
</html>

