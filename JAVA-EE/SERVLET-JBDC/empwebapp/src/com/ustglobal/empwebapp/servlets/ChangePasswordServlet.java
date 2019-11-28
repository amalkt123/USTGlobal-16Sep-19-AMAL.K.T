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
@WebServlet("/changepassword")
public class ChangePasswordServlet extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	HttpSession session=req.getSession();
	if(session==null) {
		resp.sendRedirect("/login.jsp");
	}
	else {
		String pass=req.getParameter("password");
		String confirmpassword=req.getParameter("confirmpassword");
		if(pass.equals(confirmpassword)) {
		
		EmployeeDAO dao=EmployeeDaoManager.getEmployeeDAO();
		EmployeeInfo info=(EmployeeInfo)session.getAttribute("info");
		boolean check=dao.changePassword(info.getId(), pass);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("/home");
		dispatcher.forward(req, resp);
		}else
		{
			String msg="password not matching";
			req.setAttribute("msg", msg);
			RequestDispatcher dispatcher=req.getRequestDispatcher("/changepassword.jsp");
			dispatcher.forward(req, resp);
			
			
		}
	}
}
}
