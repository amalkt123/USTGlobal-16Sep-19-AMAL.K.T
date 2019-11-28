<%@page import="com.ustglobal.empwebapp.dto.EmployeeInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="info" class="com.ustglobal.empwebapp.dto.EmployeeInfo" scope="session"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> welcome <%=info.getName() %> </h1>
<a href='./search.html' style="float: left;">search</a>&nbsp;
<a href='./changepassword.jsp' style="align-content: center; ">changepassword</a>
<a href='./logout' style="float: right;">logout</a>
</body>
</html>