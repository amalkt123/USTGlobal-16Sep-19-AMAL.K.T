package com.ustglobal.empinfowebapp.employeeinfodao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ustglobal.empinfowebapp.employeedto.Employee;

public class EmployeeInfodaojdbcimpl implements EmployeeInfoDAO{
	private final String URL="jdbc:mysql//localhost:3306:/ust_ty_web_db?user=root&password=mysql";
	private final String DRIVER_CLASS="com.mysql.jdbc.Driver";
	private final String SELECT_QUERY="select * from emploee_info where id=?";
    private final String INSERT_QUERY="insert into employee_info values(?,?,?,?)";
    private final String UPDATE_QUERY="update employee_info set password=? where id=?";


	@Override
	public Employee auth(int id, String password) {
		Employee info=searchEmployee(id);
		if(info!=null) {
			String pass=info.getPassword();
			return pass.equals(password)?info:null;
			
		}else {
		return null;
		}
	}

	@Override
	public Employee searchEmployee(int id) {
		// TODO Auto-generated method stub
		try {
			Class.forName(DRIVER_CLASS);
			try(Connection conn=DriverManager.getConnection(URL);
					PreparedStatement pstmt=conn.prepareStatement(SELECT_QUERY)){
				pstmt.setInt(1,id);
				try(ResultSet rs=pstmt.executeQuery()){
					if(rs.next()) {
						Employee info=new Employee();
						info.setId(id);
						info.setName(rs.getString("name"));
						info.setEmail(rs.getString("email"));
						info.setPassword(rs.getString("password"));
						return info;
					}
					else {
						return null;
					}
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean changePassword(int id, String password) {
		try {
			Class.forName(DRIVER_CLASS);
			try(Connection conn=DriverManager.getConnection(URL);
					PreparedStatement pstmt=conn.prepareStatement(UPDATE_QUERY)){
				pstmt.setInt(2,id);
				pstmt.setString(1, password);
				
				int  count=pstmt.executeUpdate();
				return  count>0;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean registerEmployee(Employee info) {
		try {
			Class.forName(DRIVER_CLASS);
			try(Connection conn=DriverManager.getConnection(URL);
					PreparedStatement pstmt=conn.prepareStatement(INSERT_QUERY)){
				pstmt.setInt(1, info.getId());
				pstmt.setString(2, info.getName());
				pstmt.setString(3, info.getEmail());
				pstmt.setString(4, info.getPassword());
				int  count=pstmt.executeUpdate();
				return  count>0;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		// TODO Auto-generated method stub
	
	}

}
