<%-- 
    Document   : login
    Created on : 19 May, 2020, 9:08:42 PM
    Author     : radhika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <style>
         
        #table1{
            background-color:rgb(255,250,250);
             width:330px;
             margin-left:520px;
             
        }
        
        #btn{
            background-color:rgb(233,219,232);
              border-radius:15px;   
        }
        #div1{
            background-color:rgb(233,219,232);
            cellpadding:25;
             margin-top:130px;
             height:38px;
            width:330px;
            margin-left:520px;
        }
        input[type=text]::placeholder{
           text-align:center;
        }
        
    </style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    
    <body  bgcolor="#FEE1E8">
        <div><%@ include file="front_header.html" %></div>
   
    
     
       <form action="trial"> 
        <table id="div1">
        <div> <tr><td align="center" colspan="2" id="div1">Log IN</td></tr></div>
        </table>
     <table style="border:0" align="Center" cellspacing="16" id="table1" >
        
    <tr><td  align="center">Username</td></tr>
    <tr><td align="Center"><input type="text" name="t1" required></td></tr>
    <tr><td align="Center">Password</td></tr>
    <tr><td align="Center"><input type="password" name="t2" required></td></tr>
<tr ><td align="Center"><input type="submit" value="login" id="btn"></td></tr>
<tr><td><a href="account.jsp"><center>new user?</center></a></td></tr>
 
   </table>
    </form> 
 
   <div><%@ include file="footer1.html" %></div>
         </body>
</html>
