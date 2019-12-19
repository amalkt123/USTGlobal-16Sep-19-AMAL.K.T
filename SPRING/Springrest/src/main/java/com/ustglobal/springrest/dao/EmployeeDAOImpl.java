package com.ustglobal.springrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.springrest.dto.EmployeeBean;
@Repository
public class EmployeeDAOImpl  implements EmployeeDAO{
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addEmployee(EmployeeBean bean) {
		EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	try {
		transaction.begin();
		manager.persist(bean);
		transaction.commit();
		return true;
	}
	catch (Exception e) {
		transaction.rollback();
		e.printStackTrace();
		return false;
		// TODO: handle exception
	}
		
	}

	@Override
	public boolean modifyEmployee(EmployeeBean bean) {
		
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
		EmployeeBean employeeBean=manager.find(EmployeeBean.class, bean.getId());
		transaction.begin();
		employeeBean=bean;
//		employeeBean.setName(bean.getName());
//		employeeBean.setPassword(bean.getPassword());
//		employeeBean.setDoj(bean.getDoj());
//		employeeBean.setGender(bean.getGender());
		transaction.commit();
		return true;
		}catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			return false;
			// TODO: handle exception
		}
		
		// TODO Auto-generated method stub
	}

	@Override
	public boolean deleteEmployee(int id) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
		EmployeeBean employeeBean=manager.find(EmployeeBean.class, id);
		transaction.begin();
		manager.remove(employeeBean);
		transaction.commit();
		return true;
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
	
	}

	@Override
	public EmployeeBean getEmployee(int id) {
		// TODO Auto-generated method stub
		
		EntityManager manager=factory.createEntityManager();
		try {
		EmployeeBean employeeBean=manager.find(EmployeeBean.class, id);
		return employeeBean;
		
		}catch (Exception e) {
			e.printStackTrace();
			return null;
			// TODO: handle exception
		}
		
	}

	@Override
	public List<EmployeeBean> getAllEmployee() {
		String jpql="from EmployeeBean";
		EntityManager entityManager=factory.createEntityManager();
		TypedQuery<EmployeeBean> query=entityManager.createQuery(jpql,EmployeeBean.class);
		List<EmployeeBean> employeeBeans=query.getResultList();
		return employeeBeans;
		// TODO Auto-generated method stub

	}

}
