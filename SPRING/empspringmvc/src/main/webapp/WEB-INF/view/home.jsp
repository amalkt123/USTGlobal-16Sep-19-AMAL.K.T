
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@  page import="com.ustglobal.empspringmvc.dto.EmployeeBean" %>
<!DOCTYPE html>
<%
	EmployeeBean bean = (EmployeeBean) session.getAttribute("bean");
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>home</legend>
		<div>
			<span> <a href="./changepassword">change password</a> <a
				href="./update">update profile</a> <a href="delete">delete
					profile</a> <a href="./logout">logout</a>
			</span> <span>
				<h2>
					welcome
					<%=bean.getName()%></h2>
		</div>
	</fieldset>
	<h2>${msg}</h2>
	<fieldset>


		<legend>search</legend>
		<form action="./search">
			<table>
				<tr>
					<td>ID:</td>
					<td><input type="number" value="number" name="id">
					<td><input type="submit" value="search">
			</table>




		</form>

	</fieldset>

<% EmployeeBean employeeBean=(EmployeeBean)request.getAttribute("bean"); %>
<% if(employeeBean!=null){ %>

<table>
				<tr>
					<th>Name</th>
					<th>Email</th>
					<th>Gender</th>
					<th>DOJ</th>
					</tr>
					<tr>
					<td><%=employeeBean.getName() %></td>
					<td><%=employeeBean.getEmail() %></td>
					<td><%=employeeBean.getGender() %></td>
					<td><%=employeeBean.getDoj() %></td>
					</tr>
					
			</table>
	<% }else{ %>
	<h3>${msg}</h3>
	<%} %>
			







	</span>



	</fieldset>
</body>
</html>