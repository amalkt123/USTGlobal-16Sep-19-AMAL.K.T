package com.ustglobal.webapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.webapp.dao.Employee;
@WebServlet("/req-attr")
public class SetAttributeServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
				Employee e=new Employee();
				e.setId(1);
				e.setName("ram");
				e.setSalary(100000);
				req.setAttribute("emp", e);
				
				RequestDispatcher dispatcher=req.getRequestDispatcher("/get-bean.jsp");
				dispatcher.forward(req, resp);
				
	}

}
