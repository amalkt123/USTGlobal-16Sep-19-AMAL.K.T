package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login.html")
public class LoginPageServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id="";
		Cookie[] cookies=req.getCookies();
		if(cookies!=null) {
		for(Cookie cookie:cookies) {
			if(cookie.getName().equals("alwaysRemember"))
			{
				System.out.println(cookie);
			id=cookie.getValue();
			}
		}
		}
		System.out.println(id);
		// TODO Auto-generated method stu
		PrintWriter out=resp.getWriter();
		out.print("<html><body>");
		out.print("<div style='background-color: black;color:blue;margin-top: 1cm ;'><center><h1>LOGIN</h1></center></div>");
		out.print("<div  style='border-color: black;borde-width: 2;border-style: double;'>");
		out.print("<form action='./login' method='post'>");
		out.print("<div style='margin-left: 40%;margin-right: 30%;margin-top: 1cm;margin-bottom: 1cm;'>");
		out.print("<div><label for='username'>USER ID</label>&nbsp;");
		out.print("<input type='text' name='id' id='id' value=''></div><div>&nbsp;</div>");
		out.print("<div><label for='password'>PASSWORD</label>&nbsp;");
		out.print("<input type='password' name='password' id='password'></div><div>&nbsp;</div>");
		out.print("<div><input type='checkbox' name='rememberme'  value='checked'>&nbsp;<label for='remberme'>remember me....!</label></div>");
		out.print("<div>&nbsp;</div>");
		out.print("<div><input type='submit' name='submit' value='login'>&nbsp;<input type='reset' name='reset'></div>");
		out.print("<div>&nbsp;</div>");
		out.print("<div><a href='./register.html'>Register here.....</a></div></div>");
		out.print("</form></div>");
		out.print("</body></html>");
	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
