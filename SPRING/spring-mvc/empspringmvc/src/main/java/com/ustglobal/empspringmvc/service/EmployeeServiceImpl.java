package com.ustglobal.empspringmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ustglobal.empspringmvc.dao.EmployeeDAO;
import com.ustglobal.empspringmvc.dao.EmployeeDaoImpl;
import com.ustglobal.empspringmvc.dto.EmployeeBean;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO dao;

	@Override
	public EmployeeBean login(int id, String password) {
		// TODO Auto-generated method stub
		return dao.login(id, password);
	}

	@Override
	public int register(EmployeeBean bean) {
		// logic to check email and password
		return dao.register(bean);
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(id);
	}

	@Override
	public EmployeeBean searchEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.searchEmployee(id);
	}

	@Override
	public boolean updateEmployee(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(bean);
	}

	@Override
	public boolean changePassword(int id, String password) {
		// TODO Auto-generated method stub
		return dao.changePassword(id, password);
	}
	

}
