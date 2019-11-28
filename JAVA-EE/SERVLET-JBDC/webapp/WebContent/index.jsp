<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="/errorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%int d=10/0;%>
<%

Date date=new Date();
m();
%>
<%!

         public int i=10;
        public void m(){
        	System.out.println(i);
        }

%>
</head>
<%!
public void jspInit(){
	System.out.println("this is init phase");
}
%>

<%! 
public void jspDistory()
{
	System.out.println("this is distroy phase");
}
%>
<body>

<h1 style="color: red"><%=date %></h1>
</body>
</html>