package com.ustglobal.jdbcapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;
import java.sql.PreparedStatement;


public class ExecuteDynamicInsertQuery {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		
		
		
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
					+ "values(?,?,?,?),(?,?,?,?,?)";
			pstmt=conn.prepareStatement(qry);
			int id=Integer.parseInt(args[0]);
			pstmt.setInt(1, id);
			
			pstmt.setString(2, args[1]);
			
			int salary= Integer.parseInt(args[2]);
			pstmt.setInt(3, salary);
			pstmt.setString(4, args[3]);
			int count=pstmt.executeUpdate();
			
			
			//step4 read the result
			
			System.out.println(count+" rows inserted ");
					
			
			
		}
		catch(SQLException|ClassNotFoundException e) {
			e.printStackTrace();

		}
		finally {
			
			try {
				if(pstmt!=null)
					pstmt.close();
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

