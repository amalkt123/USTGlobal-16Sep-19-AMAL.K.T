<%@page import="com.ustglobal.rms.dto.OrderBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%
	OrderBean bean = (OrderBean) session.getAttribute("bean");
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
			<span> <a href="./home">Home</a>
					profile</a> <a href="./logout">logout</a>
			</span> <span>
						</div>
	</fieldset>
	<h2>${msg}</h2>
	<fieldset>


		<legend>search</legend>
		
	</fieldset>


<% if(bean!=null){ %>

<table>
				<tr>
					<th>Order Id</th>
					<th>ProductName</th>
					<th>Price per Unit</th>
					<th>Quantity</th>
					<th>Amount Payble</th>
					</tr>
					<tr>
					<td><%=bean.getOrderid() %></td>
					<td><%=bean.getPname()%></td>
					<td><%=bean.getQty() %></td>
					<td><%=bean.getAmount() %></td>
					</tr>
					
			</table>
	<% }else{ %>
	<h3>${msg}</h3>
	<%} %>
			







	</span>



	</fieldset>
</body>
</html>