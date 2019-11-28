package com.ustglobal.webapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	String search=req.getParameter("search");
	String searchengine=req.getParameter("select");
	if(searchengine.equals("google"))
		resp.sendRedirect("https://www.google.com/search?q="+search);
	else if(searchengine.equals("yahoo"))
		resp.sendRedirect("https://in.search.yahoo.com/search?p="+search);
	else if(searchengine.equals("bing"))
		resp.sendRedirect("https://www.big.com/search?q="+search);
	
	
	//resp.sendRedirect("http://www."+searchengine+".com/search?q="+search);

}
}
