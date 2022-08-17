<%-- 
    Document   : admin_orderview
    Created on : 2 Jun, 2020, 6:20:23 PM
    Author     : radhika
--%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title align="center">ADMIN VIEW</title>
</head>
<body>

<%@page import="com.userbeanfeed,com.*,java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="admin_header.html" %> 

<h1><center>CUSTOMERS orders</center></h1>

<%
List<userbeanorder> list=daoorder.getAllRecords();
request.setAttribute("list",list);
%>

<table border="1" width="90%">
<tr align="center"><th>food item</th><th>quantity</th><th>price</th><th>order date & time</th><th>customer name</th>
 <th>contact no</th><th>email address</th> <th>delivery address</th><th>total_price</th>
 </tr>

<c:forEach items="${list}" var="u">
  <tr><td >${u.getFood_item()}</td><td >${u.getQuantity()}</td><td >${u.getPrice()}</td>
  <td >${u.getOrderdate_time()}</td><td>${u.getCust_name()}</td><td>${u.getContact_no()}</td>
  <td>${u.getEmail_address()}</td><td>${u.getDelivery_address()}</td><td>${u.getTotal_price()}</td>
 </tr>
</c:forEach>
</table>
<br/>
<%@ include file="footer1.html"%>

</body>
</html>