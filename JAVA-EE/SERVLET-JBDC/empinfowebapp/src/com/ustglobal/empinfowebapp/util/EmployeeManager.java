package com.ustglobal.empinfowebapp.util;

import com.ustglobal.empinfowebapp.employeeinfodao.EmployeeInfoDAO;
import com.ustglobal.empinfowebapp.employeeinfodao.EmployeeInfodaojdbcimpl;

public class EmployeeManager {
	private EmployeeManager() {
		// TODO Auto-generated constructor stub
	}
	
	public static EmployeeInfoDAO getEmployeeDaoImpl() {
		return new EmployeeInfodaojdbcimpl();
	}

}
