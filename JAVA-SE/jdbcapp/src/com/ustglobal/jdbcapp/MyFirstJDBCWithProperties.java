package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class MyFirstJDBCWithProperties {
public static void main(String[] args) {
	

	Connection conn=null;Statement stmt=null;ResultSet rs=null;
	FileReader reader=null;
	try{
		
		reader=new FileReader("db.properties");
		Properties properties=new Properties();
		properties.load(reader);
		
		//step1 load the driver
		
			//Driver driver=new Driver();
			//DriverManager.registerDriver(driver);
			//step2 get the connection
			//String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=mysql";
			//conn=DriverManager.getConnection(url);
		Class.forName(properties.getProperty("driver-class"));
			String url=properties.getProperty("url");
			conn=DriverManager.getConnection(url,properties);
			
			
			
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
		catch (Exception e) {
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
		if(reader!=null)
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
			
	}
	}

}
