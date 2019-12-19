package com.ustglobal.springrest.service;

import java.util.List;

import com.ustglobal.springrest.dto.EmployeeBean;

public interface EmployeeService {
	boolean addEmployee(EmployeeBean bean);
	boolean modifyEmployee(EmployeeBean bean);
	boolean deleteEmployee(int id);
	EmployeeBean getEmployee(int id);
	List<EmployeeBean> getAllEmployee();


}
