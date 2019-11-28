package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.empwebapp.dto.EmployeeInfo;
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=req.getSession(false);
		System.out.println("home servlet "+session!=null);
		if(session!=null) {
			
		RequestDispatcher dispatcher=req.getRequestDispatcher("/home.jsp");
		dispatcher.forward(req, resp);
		}
		else
		{
			RequestDispatcher dispatcher=req.getRequestDispatcher("./login.jsp");
			dispatcher.forward(req, resp);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(req.getSession());
		
		doGet(req, resp);
	}

}
