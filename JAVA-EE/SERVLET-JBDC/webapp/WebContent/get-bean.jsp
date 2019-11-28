<%@page import="com.ustglobal.webapp.dao.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<jsp:useBean id="emp" class="com.ustglobal.webapp.dao.Employee" scope="request"></jsp:useBean>

<%=emp.getId() %>
<%=emp.getName() %>
</html>