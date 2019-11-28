package com.ustglobal.empapp.utill;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;

public class EmployeeManager {
//class EmployeeFactory
	private EmployeeManager() {
		// TODO Auto-generated constructor stub
	}
	
	public static EmployeeDAO getEmployeeDAO(){
		return new EmployeeDAOImpl();
		
	}
}
