package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DynamicSelectQuery {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=mysql";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			String sql="select * from employee_info where id=? ";
			Class.forName("com.mysql.jdbc.driver");
			//Driver driver=new Driver();
			//DriverManager.registerDriver(driver);
			conn=DriverManager.getConnection(url);
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			rs=pstmt.executeQuery();
			if(rs.next())
			{
				int id=rs.getInt("id");
				String name=rs.getString("name");
				int salary=rs.getInt("salary");
				String gender=rs.getString("gender");
				
				System.out.println("id is "+id);
				System.out.println("name is "+name);
				System.out.println("salary is "+salary);
				System.out.println("gender is "+gender);
				
				
			}
		}
		catch(SQLException|ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
			if(rs!=null)
				rs.close();
			if(pstmt!=null)
				pstmt.close();
			if(conn!=null)
				conn.close();
			}
			catch(SQLException e) { 
			e.printStackTrace();
			}
		}
	}

}
