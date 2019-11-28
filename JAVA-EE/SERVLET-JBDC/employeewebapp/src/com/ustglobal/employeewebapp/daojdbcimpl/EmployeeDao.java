package com.ustglobal.employeewebapp.daojdbcimpl;

import com.ustglobal.employeewebapp.dto.Employee;

public interface EmployeeDao {
	Employee auth(int id,String password);
	Employee search(int id);
	boolean changePassword(int id,String password);
	boolean registerEmployee(Employee employee);

}
