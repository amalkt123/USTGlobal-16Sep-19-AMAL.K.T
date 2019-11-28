package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		
		ServletContext context=req.getServletContext();
		String companyname=context.getInitParameter("company-name");
		
		
		ServletConfig config=getServletConfig();
		String batchName=config.getInitParameter("batch-name");
		
		
		
		
		
		String name =req.getParameter("ename");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<html><body><h1>");
		out.println(name);
		out.println(email);
		out.println(password);
		
		
		out.println("<br> <h2>company  name : "+companyname+" <br>");
		out.println("<br> <h2>batch name : "+batchName+" <br>");
		
		
		
		out.println("</h1></body></html>");
	}
	

}
