<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
		<legend>change password</legend>
		<div>
			<span> <a href="./home">home</a>
					profile</a> <a href="./logout">logout</a>
			</span> <span>
				
		</div>
	</fieldset>

	<h3>${msg}</h3>
	<fieldset>
		<form action="./changepassword" method="post">
			<table>

				<tr>
					<td>New Password</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>Confirm Password</td>
					<td><input type="password" name="cpassword"></td>
				</tr>
				<tr>
					<td><input type="submit" value="change password"></td>
					<td><input type="reset" value="reset"></td>
				</tr>

			</table>




		</form>
	</fieldset>
	

</body>
</html>