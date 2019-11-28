package com.ustglobal.empwebapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ustglobal.empwebapp.dto.EmployeeInfo;

public class EmployeeDaojdbcimpl implements EmployeeDAO {

	private final String URL="jdbc:mysql://localhost:3306/ust_ty_web_db?user=root&password=mysql";
	private final static String DRIVER_CLASS_NAME="com.mysql.jdbc.Driver";
	private final static String SELECT_SQL="select * from employee_info where id=?";
	private final static String INSERT_SQL="insert into employee_info values(?,?,?,?)";
	private final static String UPDATE_SQL="update employee_info set password=? where 1d=?";

	@Override
	public EmployeeInfo auth(int id, String password) {
		EmployeeInfo info=searchEmployee(id);
		System.out.println(info);
		if(info!=null) {
			String pss=info.getPassword();
			System.out.println(pss.equals(password));
		    return pss.equals(password)?info:null;
		   		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeInfo searchEmployee(int id) {
		// TODO Auto-generated method stub
		try {
			Class.forName(DRIVER_CLASS_NAME);
			try(Connection conn=DriverManager.getConnection(URL);
					PreparedStatement pstmt=conn.prepareStatement(SELECT_SQL);){
				pstmt.setInt(1, id);
				try(ResultSet rs=pstmt.executeQuery()){
					if(rs.next()){
						EmployeeInfo info=new EmployeeInfo();
						info.setId(rs.getInt("id"));
						info.setName(rs.getString("name"));
						info.setEmail(rs.getString("email"));
						info.setPassword(rs.getString("password"));
						return info;
					}
					else return null;
				}
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean changePassword(int id, String password) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName(DRIVER_CLASS_NAME);
			try(Connection conn=DriverManager.getConnection(URL);
					PreparedStatement pstmt=conn.prepareStatement(UPDATE_SQL)){
				pstmt.setString(1, password);
				pstmt.setInt(2, id);
				int count=pstmt.executeUpdate();
				return count>0;
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public boolean registerEmployee(EmployeeInfo info) {
		// TODO Auto-generated method stub
		//Connection conn=null;
		//PreparedStatement pstmt=null;

		try {
			Class.forName(DRIVER_CLASS_NAME);
			try(Connection conn=DriverManager.getConnection(URL);
				PreparedStatement	pstmt=conn.prepareStatement(INSERT_SQL)){
				pstmt.setInt(1, info.getId());
				pstmt.setString(2, info.getName());
				pstmt.setString(3, info.getEmail());
				pstmt.setString(4, info.getPassword());
				int count=pstmt.executeUpdate();
				if(count==1)
					return true;
				else
					return false;
			}
		
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;

		}

	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
