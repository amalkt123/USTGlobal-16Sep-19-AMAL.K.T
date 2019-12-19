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

<fieldset>
		<legend>update profile</legend>

<h2>${msg}</h2>
		<form action="./update" method="post">
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
					<td>DOJ</td>
					<td><input type="date" name="doj"></td>
				</tr>
				<tr>
					<td>GENDER</td>
					<td><select name="gender" required="required">
							<option value="">------select-----</option>
							<option value="M">MALE</option>
							<option value="M">FEMALE</option>
					</select></td>
				</tr>
				<tr>
					<td><input type="submit" value="update"></td>
					<td><input type="reset" value="reset"></td>
				</tr>

			</table>

		</form>
	</fieldset>

</body>
</html>