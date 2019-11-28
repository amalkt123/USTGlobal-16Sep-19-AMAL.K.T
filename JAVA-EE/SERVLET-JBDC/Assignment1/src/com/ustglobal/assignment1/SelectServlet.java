package com.ustglobal.assignment1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SelectServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String sql="select * from employee_info where id=?";
			
			
			try(Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=mysql");
				PreparedStatement pstmt=conn.prepareStatement(sql)){
				pstmt.setInt(1, Integer.parseInt(req.getParameter("id")));
				ResultSet rs=pstmt.executeQuery();
				PrintWriter out=resp.getWriter();
				if(rs.next()) {
			   out.println("<html><body><table>");
			   out.println("<tr><th>id</th><th>name</th><th>salary</th><th>gender</th></td>");
			   out.println("<tr>");
			   out.println("<td>"+rs.getInt("id")+"</td>");
			   out.println("<td>"+rs.getInt("name")+"</td>");
			   out.println("<td>"+rs.getInt("salary")+"</td>");
			   out.println("<td>"+rs.getInt("gender")+"</td>");
			   out.println("</tr>");
			   out.println("</table></body></html>");
			   
				}
				else {
					out.println("<h1> no record found </h1>");
				}
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
