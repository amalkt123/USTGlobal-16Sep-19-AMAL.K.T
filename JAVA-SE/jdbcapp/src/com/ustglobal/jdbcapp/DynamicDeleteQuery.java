package com.ustglobal.jdbcapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.jdbc.Driver;


public class DynamicDeleteQuery {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//step1 load the driver
			//Driver driver=new Driver();
			//DriverManager.registerDriver(driver);
			
			//getting the connection
			
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=mysql";
			conn=DriverManager.getConnection(url);
			
			
			//step3 issue sql query
			String qry="delete from employee_info where id=?";
			pstmt=conn.prepareStatement(qry);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			int count=pstmt.executeUpdate();
			
			
			//step4 read the result
			
			System.out.println(count+" row is deleted ");
					
			
			
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

