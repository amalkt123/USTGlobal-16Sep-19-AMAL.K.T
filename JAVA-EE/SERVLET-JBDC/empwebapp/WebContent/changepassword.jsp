<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="msg" class="java.lang.String" scope="request"/>
<fieldset>
<legend>Change password</legend>
<a href="./home">HOME</a>
<h4><%=msg%>
<a style="float: right;" href="./logout">logout</a>
<form action="./changepassword" method="post">
<table align="center">

<tr> 
<td>New Password</td>
<td><input type="password" name="password"></td>
</tr>
<tr> 
<td>old Password</td>
<td><input type="password" name="confirmpassword"></td>
</tr>
<tr> 
<td><input type="reset" name="reset" value="reset"></td>
<td><input type="submit" name="reset" value="submit"></td>
</tr>






</table>



</form>






</body>
</html>