package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForwardServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		Object obj=new Object();
		req.setAttribute("obj", obj);
	
//		PrintWriter out=resp.getWriter();
//		out.println("<html><body>");
//		out.println("<h1> this is forword servlet </h1>");
//		out.println("</body></html>"); it not include  the respone come from first
		RequestDispatcher dispatcher=req.getRequestDispatcher("/first");
		dispatcher.forward(req, resp);
	}

}
