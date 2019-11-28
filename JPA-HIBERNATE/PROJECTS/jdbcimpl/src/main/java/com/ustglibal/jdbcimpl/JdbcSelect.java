package com.ustglibal.jdbcimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcSelect {
	public static void main(String[] args) {
		String sql="select * from employee_info where id=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ust_ty_web_db?user=roor&password=mysql");
				
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, 1);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String email=rs.getString("email");
				System.out.println(id+" "+name+" "+email);
			}
			
			}
		catch (Exception e) {
		     e.printStackTrace();
		}
	}

}
