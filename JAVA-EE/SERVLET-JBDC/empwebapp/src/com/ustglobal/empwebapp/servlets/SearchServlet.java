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

import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustglobal.empwebapp.dto.EmployeeInfo;
import com.ustglobal.empwebapp.util.EmployeeDaoManager;
@WebServlet("/search")
public class SearchServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=req.getSession(false);
	

		
	if(session==null) {
		RequestDispatcher dispatcher=req.getRequestDispatcher("./login.jsp");
        dispatcher.forward(req, resp);
	}
	else {
		int id=Integer.parseInt(req.getParameter("id"));
		EmployeeDAO dao=EmployeeDaoManager.getEmployeeDAO();
		EmployeeInfo info=dao.searchEmployee(id);
		req.setAttribute("info", info);
	
			RequestDispatcher dispatcher=req.getRequestDispatcher("/search.jsp");
			dispatcher.forward(req, resp);
			
			
				
	//	RequestDispatcher dispatcher=req.getRequestDispatcher("./search.html");
	//	dispatcher.include(req, resp);
				
	}
	
	
	
	}

}
