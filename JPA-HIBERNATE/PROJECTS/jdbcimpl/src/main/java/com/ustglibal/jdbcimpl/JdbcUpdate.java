package com.ustglibal.jdbcimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcUpdate {
public static void main(String[] args) {
	String sql="update into employee_info set name='kumar',email='kumar@!gmail.com',password='2222' where id=3";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ust_ty_web_db?user=roor&password=mysql");
			Statement stmt=conn.createStatement();
			int count=stmt.executeUpdate(sql);
		if(count>0) {
			System.out.println(count+" row(s) is inserted");			}
		
		}
	catch (Exception e) {
	     e.printStackTrace();
	}
}
}
