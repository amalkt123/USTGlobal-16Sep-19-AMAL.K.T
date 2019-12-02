<%@page import="com.ustglobal.rms.dto.ProductBean"%>
<%@page import="com.ustglobal.rms.dto.RetailerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%
RetailerBean bean = (RetailerBean) session.getAttribute("bean");
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
			<span> <a href="./changepassword">change password</a> 
			 <a href="./order">Cart</a><a
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

<% ProductBean pBean=(ProductBean)request.getAttribute("bean"); %>
<% if(pBean!=null){ %>

<table>
				<tr>
					<th>Product Id</th>
					<th>Product Name</th>
					<th>Product Quantity</th>
					<th>Price</th>
					</tr>
					<tr>
					<td ><%=pBean.getPid() %></td>
					<td><%=pBean.getPname()%></td>
					<td><%=pBean.getPqty() %></td>
					<td><%=pBean.getPrice() %></td>
					</tr>
					
			</table>
	<% }else{ %>
	<h3>${msg}</h3>
	<%} %>
			







	</span>



	</fieldset>
</body>
</html>