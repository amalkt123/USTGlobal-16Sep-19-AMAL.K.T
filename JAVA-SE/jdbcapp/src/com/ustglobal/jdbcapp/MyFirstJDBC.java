package com.ustglobal.jdbcapp;

import java.sql.*;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC {
	public static void main(String[] args) {
	
	Connection conn=null;Statement stmt=null;ResultSet rs=null;
	try{
		//step1 load the driver
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			//step2 get the connection
			//String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=mysql";
			//conn=DriverManager.getConnection(url);
			String url="jdbc:mysql://localhost:3306/ust_ty_db";
			conn=DriverManager.getConnection(url, "root", "mysql");
			
			
			
			//step3 issue sql query
			stmt=conn.createStatement();
			String sql="select * from employee_info";
			rs=stmt.executeQuery(sql);
			
			
			
			
			//step 4 read the result
			while(rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String gender=rs.getString("gender");
				
				System.out.println("id is "+id);
				System.out.println("name is "+name);
				System.out.println("gender is "+gender);
				System.out.println("********************************************");
				
				
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	finally {
		//close all jdbc connection
		if(rs!=null)
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(stmt!=null)
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(conn!=null)
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	}
		
	}
