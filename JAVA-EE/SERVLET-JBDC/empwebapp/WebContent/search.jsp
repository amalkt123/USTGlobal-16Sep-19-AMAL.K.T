<%@page import="com.ustglobal.empwebapp.dto.EmployeeInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<%

EmployeeInfo info=(EmployeeInfo)request.getAttribute("info");

%>
<body>
<a href='./home' style="float: left;">home</a>&nbsp;
<a href='./logout' style='floar:right'>logout</a>
<%if(info!=null){ %>
<table align='center' border=1 style='margin-top:10%'>
<tr>
<th>id</th>
<th>name</th>
<th>email</th>
</tr>


<tr>
<td><%=info.getId() %></td>
<td><%=info.getName()%></td>
<td><%=info.getEmail()%></td>
</tr>
</table>
<%}else{ %>



<h1>no data found</h1>
<%} %>

</body>
</html>