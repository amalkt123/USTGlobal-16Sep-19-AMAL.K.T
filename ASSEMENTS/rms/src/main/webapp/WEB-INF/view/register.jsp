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
		<legend>register</legend>


		<form action="./register" method="post">
			<table>

				<tr>
					<td>NAME</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>EMAIL</td>
					<td><input type="email" name="email"></td>
				</tr>
								<tr>
					<td>PASSWORD</td>
					<td><input type="password" name="password"></td>
				</tr>
								<tr>
					<td><input type="submit" value="Register"></td>
					<td><input type="reset" value="reset"></td>
				</tr>

			</table>

		</form>
		<a href="./login">Login</a>

	</fieldset>
</body>
</html>