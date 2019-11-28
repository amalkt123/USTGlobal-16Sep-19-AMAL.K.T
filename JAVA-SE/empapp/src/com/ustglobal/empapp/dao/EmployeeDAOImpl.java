package com.ustglobal.empapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ustglobal.empapp.dto.EmployeeBean;

public class EmployeeDAOImpl implements EmployeeDAO {
	public List<EmployeeBean> getAllEmployeeData() {
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=mysql";
		String sql="select * from employee_info";
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			stmt=conn.createStatement();
				rs=stmt.executeQuery(sql);
				ArrayList<EmployeeBean> al=new ArrayList<EmployeeBean>();
				while(rs.next()) {
					EmployeeBean bean=new EmployeeBean();
					bean.setId(rs.getInt("id"));
					
					bean.setName(rs.getString("name"));
					bean.setSal(rs.getInt("salary"));
					bean.setGender(rs.getString("gender"));
					al.add(bean);
					
					
				}
				return al;
					
				
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		finally {
			try {
			if(rs!=null)
				rs.close();
			if(stmt!=null)
				rs.close();
			if(conn!=null)
				conn.close();
		     }
			catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}//end of getEmployeeData
	
	
	
	public EmployeeBean searchEmployeeData(int id) {
		String url="jdbc:mysql://localhost:3306/us_ty_db?user=root&password=mysql";
		String sql="select 8 from employee_info where id=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			pstmt=conn.prepareStatement(sql);
			
			
			pstmt.setInt(1,id);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				EmployeeBean bean=new EmployeeBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSal(rs.getInt("salary"));
				bean.setGender(rs.getString("gender"));
				return bean;
			}
			
			return null;
		}
		catch(Exception e) {
	
			e.printStackTrace();
			return null;
		
		}
		
	}
	
	
	
	
	
	
	public int deleteEmployeeData(int id) {
		String url="jdbc:mysql://localhost:3306/us_ty_db?user=root&password=mysql";
		String sql="delete from employee_info where id=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			pstmt=conn.prepareStatement(sql);
			
			
			pstmt.setInt(1,id);
			int count=pstmt.executeUpdate();
			
			
			return count;
		}
		catch(Exception e) {
	
			e.printStackTrace();
			return 0;
		
		}
		
	}
	
	
	
	
	public int insertEmployeeData(EmployeeBean bean) {
		String url="jdbc:mysql://localhost:3306/us_ty_db?user=root&password=mysql";
		String sql="insert into employee_info values(?,?,?,?)";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			pstmt=conn.prepareStatement(sql);
			
			
			pstmt.setInt(1,bean.getId());
			pstmt.setString(2,bean.getName());
			pstmt.setInt(3, bean.getSal());
			pstmt.setString(4, bean.getGender());
			int count=pstmt.executeUpdate();
			
			
			return count;
		}
		catch(Exception e) {
	
			e.printStackTrace();
			return 0;
		
		}
		
	}
	
	
	
	
	
	
	
	public int updateEmployeeData(EmployeeBean bean) {
		String url="jdbc:mysql://localhost:3306/us_ty_db?user=root&password=mysql";
		String sql="update employee_info set name=?,salary=?,gender=? where id=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			pstmt=conn.prepareStatement(sql);
			
			
			pstmt.setInt(4,bean.getId());
			pstmt.setString(1,bean.getName());
			pstmt.setInt(2, bean.getSal());
			pstmt.setString(3, bean.getGender());
			int count=pstmt.executeUpdate();
			
			
			return count;
		}
		catch(Exception e) {
	
			e.printStackTrace();
			return 0;
		
		}
		
	}



}
