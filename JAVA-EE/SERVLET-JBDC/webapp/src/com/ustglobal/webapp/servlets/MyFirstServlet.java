package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	
	
	
	Object obj2=req.getAttribute("obj");
	
	
	ServletContext context=req.getServletContext();
	String companyname=context.getInitParameter("company-name");
	
	
	ServletConfig config=getServletConfig();
	String batchName=config.getInitParameter("batch-name");
	
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	out.println("<html>");
	out.println("<body>");
	Date date=new Date();
	out.println("<h1 style='color:red'> date and time is :");
	out.println(date.toString());
	out.println("</h1>");
	
	String url=req.getRequestURI();
	String method =req.getMethod();
	out.println("url is :"+url+"<br>");
	out.println("http method is :"+method);
	
	out.println("<br> <h2>company  name : "+companyname+" <br>");
	out.println("<br> <h2>batch name : "+batchName+" <br>");
	
	out.println("<h1> request object forwoard from forword servlet "+obj2+" </h1>");
	out.println("<body>");
	out.println("</html>");
}
}
