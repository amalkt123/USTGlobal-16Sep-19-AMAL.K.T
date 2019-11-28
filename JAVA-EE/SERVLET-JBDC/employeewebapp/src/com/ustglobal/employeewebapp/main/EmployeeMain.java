package com.ustglobal.employeewebapp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ustglobal.employeewebapp.daojdbcimpl.EmployeeDao;
import com.ustglobal.employeewebapp.dto.Employee;

public class EmployeeMain implements EmployeeDao{
	final String DRIVER="com.mysql.jdbc.Driver";
	final String URL="dbc:mysql://localhost:3306/ust_ty_db_web?user=root&password=mysql";
	final String  SELECT_QUEREY="select * from employee_info where id=?";
	final String INSERT_QUERY="insert into values(?,?,?,?)";
	final String UPDATE_QUERY="update into employee_info set password=? where id=?";

	@Override
	public Employee auth(int id, String password) {
		Employee employee=search(id);
		if(employee!=null&&password.equals(employee.getPassword())) {
			return employee;
			
		}
			return null;	
	}
        
	@Override
	public Employee search(int id) {
		// TODO Auto-generated method stub
		try {
			Class.forName(DRIVER);
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		try(Connection conn=DriverManager.getConnection(URL);
				PreparedStatement pstmt=conn.prepareStatement(SELECT_QUEREY)){
			pstmt.setInt(1, id);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				Employee e=new Employee();
				e.setId(rs.getInt("id"));
				e.setEmail(rs.getString("email"));
				e.setName(rs.getString("name"));
				e.setPassword(rs.getString("password"));
				return e;
			
			}
			return null;
			
		 }catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
			 return null;
		
		}

		
	}

	@Override
	public boolean changePassword(int id, String password) {
		// TODO Auto-generated method stub
		try {
			Class.forName(DRIVER);
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		try(Connection conn=DriverManager.getConnection(URL);
				PreparedStatement pstmt=conn.prepareStatement(UPDATE_QUERY)){
			pstmt.setInt(2, id);
			pstmt.setString(1, password);
			int count=pstmt.executeUpdate();
			return (count>0)?true:false;
			
			}catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		return false;
	}

	@Override
	public boolean registerEmployee(Employee employee) {
		
		try {
			Class.forName(DRIVER);
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		try(Connection con=DriverManager.getConnection(URL);
				PreparedStatement pstmt=con.prepareStatement(INSERT_QUERY)){
			pstmt.setInt(1, employee.getId());
			pstmt.setString(2, employee.getName());
			pstmt.setString(3, employee.getPassword());
			pstmt.setString(4, employee.getPassword());
			int count=pstmt.executeUpdate();
			return (count>0)?true:false;
			
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		// TODO Auto-generated method stub
	
	}

}
