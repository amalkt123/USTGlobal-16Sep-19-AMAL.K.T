package com.ustglobal.empwebapp.dao;

import com.ustglobal.empwebapp.dto.EmployeeInfo;

public interface EmployeeDAO {
	EmployeeInfo auth(int id,String password);
	EmployeeInfo searchEmployee(int id);
	boolean changePassword(int id,String password);
	boolean registerEmployee(EmployeeInfo info);

}
