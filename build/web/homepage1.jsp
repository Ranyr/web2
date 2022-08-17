<%-- 
    Document   : homepage1
    Created on : 12 Jun, 2020, 12:45:50 AM
    Author     : radhika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
.container {
  position: relative;
  text-align: center;
  color: white;
}



.centered {
  position: absolute;
  top: 35%;
  left: 50%;
  transform: translate(-50%, -50%);
}
input[type=text]
{
    width:100%;
    padding:12px,20px;
    box-sizing:border-box;
    border-color:black;
    color:blue;
    border-radius:25px;
    height:25px;
    
}
input[type="text"]::placeholder{ text-align:center;
 color:blue;}
</style>
       </head>
    <body>
       
        <%@ include file="front_header1.html" %> 
        <form action="./rest">

<div class="container">
  <img src="blackbg4.jpg" alt="food" style="width:100%;">
  
  <div class="centered">
      <h1>Do you feel Hungry?</h1>
      <h3> Hurry up  place an Order, EAT GOOD FEEL GOOD </h3>
      <input type="text" name="t1" placeholder="Location" size="10">
      <input type="submit" value="go">
  </div>
   
</div>
            </form>
<%@ include file="footer1.html" %>
      
    </body>
</html>
