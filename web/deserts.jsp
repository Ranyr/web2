<%-- 
    Document   : deserts
    Created on : 4 Jun, 2020, 8:26:19 PM
    Author     : radhika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
       #div1{
            height:38px;
            width:355px;
            margin-left:494px;
            margin-top:60px;
            background-color:rgb(202,174,183);
            cellpadding:25;
             }
             #table1{
            background-color:rgb(255,250,250);
             border-bottom:1px solid palevioletred;
              
            margin-left:494px;
            width:355px;
        }                      
         #img{
            margin-left:494px;
            width:355px;
            height:270px;
        }
        
        </style>
       </head> 
       
       <script>
           
           function submitForm(clickedButton){
               if(clickedButton.name==="button1")
{

alert("button1");

document.myfm.action="desert1_order.jsp";

}
		
else if(clickedButton.name==="button2")
				
{

alert("button2");
				
document.myfm.action="desert4_order.jsp";
	
}
				
else if(clickedButton.name==="button3")
				
{

alert("button3");
				
document.myfm.action="desert5_order.jsp";
	
}

document.myfm.submit();
				
}

               
               
           }
           </script>
    
    <body>
           <form name="myfm">
      <div id="div1">
    <table border="0" align="Center"><tr><th><font color="white">DESERTS</th></tr></table>
</div>
<table style="border:1"  align="Center" cellspacing="20" id="table1">
     <tr style="align:Center"><img src="gulabjamun.jpg" align="Center" id="img"></tr>
<tr align="Center"><th><b><u><font color="#A378B">HOT DESERTS</u></b></th></tr>
            
<tr><td><i><input type="text" name="s1" value="Gazar Halwa(kg)"></i></td>
    <td><input type="text"  name="t1" size="3" value="150"></td>
    <td><input type="button" name="button1" value= "go" onClick=submitForm(this) /></td></tr>
    
   
    <tr align="Center"><th><b><u><font color="#A378B">COLD DESERTS</u></b></th> </tr>
           
    
      
    <tr><td><i><input type="text" name="s2" value="Ice Cream"></i></td>
        <td><input type="text"  name="t2" size="3" value="35"></td>
        <td><input type="button" name="button2" value= "go" onClick=submitForm(this) /></td></tr>
            
        <tr><td><i><input type="text" name="s3" value="Chocolate cake"></i></td>
            <td><input type="text"  name="t3" size="3" value="350"></td>
            <td><input type="button" name="button3" value= "go" onClick=submitForm(this) /></td></tr> 
        </form>
</body>
    
</html>
