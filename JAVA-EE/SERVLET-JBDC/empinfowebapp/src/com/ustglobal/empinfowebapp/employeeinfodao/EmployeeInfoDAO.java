package com.ustglobal.empinfowebapp.employeeinfodao;

import com.ustglobal.empinfowebapp.employeedto.Employee;

public interface EmployeeInfoDAO {
	Employee auth(int id,String password);
	Employee searchEmployee(int id);
	boolean changePassword(int id,String password);
	boolean registerEmployee(Employee info);
	

}
