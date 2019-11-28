package com.ustglobal.jdbcapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;


public class ExecuteinsertQuery {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		
		
		
		
		try {
			//step1 load the driver
			//Driver driver=new Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.driver");
			
			//getting the connection
			
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=mysql";
			conn=DriverManager.getConnection(url);
			
			
			//step3 issue sql query
			String qry="insert into employee_info "
					+ "values(7,'gereder',10000,'m')";
			stmt=conn.createStatement();
			int count=stmt.executeUpdate(qry);
			
			
			//step4 read the result
			
			System.out.println(count+" rows inserted ");
					
			
			
		}
		catch(SQLException|ClassNotFoundException e) {
			e.printStackTrace();

		}
		finally {
			
			try {
				if(stmt!=null)
					stmt.close();
				if(conn!=null)
					conn.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			}
			
		}
	}

