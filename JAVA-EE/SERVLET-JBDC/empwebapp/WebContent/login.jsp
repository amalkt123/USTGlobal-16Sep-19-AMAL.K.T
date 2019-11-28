<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
pageEncoding="ISO-8859-1"%>
<%@ page session="false" %>
<!DOCTYPE html>
<jsp:useBean id="msg" class="java.lang.String" scope="request"/>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%

String id="";
Cookie[] cookies=request.getCookies();
if(cookies!=null) {
for(Cookie cookie:cookies) {
	if(cookie.getName().equals("alwaysRemember"))
	{
		System.out.println(cookie);
	id=cookie.getValue();
	}
}
}



%>
<body>
<div style='background-color: black;color:blue;margin-top: 1cm ;'><center><h1>LOGIN</h1></center></div>
<div  style='border-color: black;borde-width: 2;border-style: double;'>
<h4><%=msg %></h4>
<form action='./login' method='post'>
<div style='margin-left: 40%;margin-right: 30%;margin-top: 1cm;margin-bottom: 1cm;'>
<div><label for='username'>USER ID</label>&nbsp;
<input type='text' name='id' id='id' value='<%=id%>'></div><div>&nbsp;</div>
<div><label for='password'>PASSWORD</label>&nbsp;
<input type='password' name='password' id='password'></div><div>&nbsp;</div>
<div><input type='checkbox' name='rememberme'  value='checked'>&nbsp;<label for='remberme'>remember me....!</label></div>
<div>&nbsp;</div>
<div><input type='submit' name='submit' value='login'>&nbsp;<input type='reset' name='reset'></div>
<div>&nbsp;</div>
<div><a href='./register.html'>Register here.....</a></div></div>
</form></div>





</body>
</html>