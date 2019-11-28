package com.ustglobal.jdbcapp;

import java.sql.*;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

public class ExecuteDynamicSelectQuery {
	public static void main(String[] args) {
	
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	try{
		//step1 load the driver
			//Driver driver=new Driver();
			//DriverManager.registerDriver(driver);
		Class.forName("com.mysql.jdbc.driver");
			//step2 get the connection
			//String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=mysql";
			//conn=DriverManager.getConnection(url);
			String url="jdbc:mysql://localhost:3306/ust_ty_db";
			conn=DriverManager.getConnection(url, "root", "mysql");
			
			
			
			//step3 issue sql query
			String sql="select ? from employee_info";//error wecannot pass table field dynamically wecan pass only value dynamically
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, args[0]);///     error wecan only applicable in the case of value wecannot pass table field dynamically
			
			rs=pstmt.executeQuery();
			
			
			
			
			//step 4 read the result
			while(rs.next()) {
				System.out.println(rs.getInt("id"));
//				int id=rs.getInt("id");
//				String name=rs.getString("name");
//				String gender=rs.getString("gender");
//				
//				System.out.println("id is "+id);
//				System.out.println("name is "+name);
//				System.out.println("gender is "+gender);
//				System.out.println("********************************************");
//				
				
			}
			
		}
		catch (SQLException|ClassNotFoundException e) {
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
		if(pstmt!=null)
			try {
				pstmt.close();
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
