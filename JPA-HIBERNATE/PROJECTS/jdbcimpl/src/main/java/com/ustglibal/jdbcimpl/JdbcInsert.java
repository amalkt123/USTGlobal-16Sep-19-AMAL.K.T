package com.ustglibal.jdbcimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcInsert {
	public static void main(String[] args) {
		String sql="insert into employee_info values(?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ust_ty_web_db?user=roor&password=mysql");
				
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, 1);
			pstmt.setString(2, "ram");
			pstmt.setString(3,"ram@gmail.com");
			pstmt.setString(4, "12345");
			int count=pstmt.executeUpdate();
			if(count>0) {
				System.out.println(count+" row(s) is inserted");			}
			
			}
		catch (Exception e) {
		     e.printStackTrace();
		}
	}

}
