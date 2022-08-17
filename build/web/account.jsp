<%-- 
    Document   : account
    Created on : 19 May, 2020, 9:19:50 PM
    Author     : radhika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <style>  
        #div1{
            height:38px;
            width:359px;
            margin-left:494px;
            margin-top:100px;
            background-color:#FFDDCC;
            cellpadding:25;
            align:"center";
            
        }
        #table1{
            background-color:#FFF;
            margin-left:494px;
            width:359px;
             border-bottom:1px #FFDDCC;
            align:"center";
        }                      

        #btn
        {background-color:#FFDDCC;
          border-radius:15px;
           
        }
         .container {
         position: relative;
        text-align: center;
        color: white;
                    }
   .centered {
  position: absolute;
  top: 35%;
  left: 50%;
  transform: translate(-70%, -45%);
  color:white;
}
        
        
        </style>
    <body bgcolor="#FEE1E8">
       <form action="uacc">
        
  <div> <%@ include file="header.html" %></div>
   
      <div><%@ include file="account.html"%></div>   
      
            
   <div> <%@ include file="footer.html" %></div>
    </form>
    </body>
</html>
