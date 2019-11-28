package com.ustglibal.jdbcimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDelete {
public static void main(String[] args) {
	String sql="delete from employee_info where id=1";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ust_ty_web_db?user=root&password=mysql");
			
	
          Statement stmt=conn.createStatement();
		int count=stmt.executeUpdate(sql);
		
		if(count>0) {
			System.out.println(count+" row(s) is deleted");			}
		
		}
	catch (Exception e) {
	     e.printStackTrace();
	}
}
}
