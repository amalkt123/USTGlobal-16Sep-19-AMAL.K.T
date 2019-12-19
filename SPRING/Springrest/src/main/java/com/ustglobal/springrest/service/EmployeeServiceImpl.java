package com.ustglobal.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.springrest.dao.EmployeeDAO;
import com.ustglobal.springrest.dto.EmployeeBean;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO dao;

	@Override
	public boolean addEmployee(EmployeeBean bean) {
		// TODO Auto-generated method stub
		if(bean.getName()==null||bean.getPassword()==null) {
		return false;
		}
		else if(bean.getPassword().length()<8) {
			return false;
		}
		else {
			return dao.addEmployee(bean);
		}
	}

	@Override
	public boolean modifyEmployee(EmployeeBean bean) {
		// TODO Auto-generated method stub
		if(bean.getName()==null||bean.getPassword()==null) {
			return false;
			}
			else if(bean.getPassword().length()<8) {
				return false;
			}
			else {
				return dao.modifyEmployee(bean);
			}
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(id);
	}

	@Override
	public EmployeeBean getEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.getEmployee(id);
	}

	@Override
	public List<EmployeeBean> getAllEmployee() {
		// TODO Auto-generated method stub
		return dao.getAllEmployee();
	}

}
