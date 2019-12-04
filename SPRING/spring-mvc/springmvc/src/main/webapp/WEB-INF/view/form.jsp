<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./form" method="post">

		<table border="1px"style="align-self: center;">
		
			<tr>
				<th>Id:</th>
				<td><input type="number" name="id"></td>
			<tr>
			<tr>
				<th>Name:</th>
				<td><input type="text" name="name"></td>
			<tr>
			<tr>
				<th>Password:</th>
				<td><input type="password" name="password"></td>
			<tr>
			<tr>
				<th>Gender:</th>
				<td><input type="radio" name="gender" value="male">Male<input type="radio" name="gender" value="female">Female</td>
				</tr>
			<tr>
			<tr>
				<th>DOJ:</th>
				<td><input type="date" name="doj"></td>
				</tr>
			<tr>
			<td>
			<input type="submit" value="submit">
			</td>
			<td>
			<input type="reset" value="reset">
			</td>
			</tr>
		</table>




	</form>
</body>
</html>