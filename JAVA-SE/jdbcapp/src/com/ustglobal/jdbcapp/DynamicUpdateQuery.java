package com.ustglobal.jdbcapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;


public class DynamicUpdateQuery {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		
		
		
		try {
			//step1 load the driver
			//Driver driver=new Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.driver");
			
			//step2 getting the connection
			
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=mysql";
			conn=DriverManager.getConnection(url);
			
			
			//step3 issue sql query
			String qry="update employee_info set name=?,salary=?,gender=? where id=?";
	         pstmt=conn.prepareStatement(qry);
//	         int id=Integer.parseInt(args[0]);
//	         String name=args[1];
//	         int salary =Integer.parseInt(args[2]);
//	         String gender =args[3];
//	         pstmt.setString(1, name);
//	         pstmt.setInt(4, id);
//	         pstmt.setInt(2, salary);
//	         pstmt.setString(3, gender);
//	         pstmt.executeUpdate();
	         pstmt.setString(1, args[1]);
	         pstmt.setInt(2, Integer.parseInt(args[2]));
	         pstmt.setString(3, args[3]);
	         pstmt.setInt(4,Integer.parseInt(args[0]));
	       int count=  pstmt.executeUpdate();
	         
	         
			
			
			//step4 read the result
			
			System.out.println(count+" rows is updated ");
					
			
			
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

