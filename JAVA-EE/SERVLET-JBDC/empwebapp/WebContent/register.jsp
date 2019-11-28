<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>





<div style="background-color: black;color:blue;margin-top: 1cm "><center><h1>REGISTER HERE.....!</h1></center>
</div>
<div style="margin-left: 30%;margin-right: 20%;">
<form action="./register" method="post">



<div>
<span><label for="username">ID</label>&nbsp;

<center><input type="number" name="id" id="id"></center></span></div><div>&nbsp;</div>

<div><span><label for="username">NAME</label>&nbsp;

<center><input type="text" name="name" id="name"></center></span></div><div>&nbsp;</div>
<div><span><label for="username">EMAIL</label>&nbsp;

<center><input type="email" name="email" id="email"></center></span></div><div>&nbsp;</div>

<div><span><label for="password">PASSWORD</label>&nbsp;

<center><input type="password" name="password" id="password" class="tb"></center></span></div><div>&nbsp;</div>

<div><span><center><input type="submit" name="submit" value="register" style="margin-right: 1cm;">&nbsp;<input type="reset" name="reset" value="reset"></center></span></div>
</form>
</div>
    


</body>
</html>