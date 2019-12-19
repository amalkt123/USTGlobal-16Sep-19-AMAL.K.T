package com.ustglobal.empspringmvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ustglobal.empspringmvc.dto.EmployeeBean;

import net.bytebuddy.dynamic.TypeResolutionStrategy.Passive;
@Repository
public class EmployeeDaoImpl implements EmployeeDAO {
	final String SELECT_JPQL="from EmployeeBean where id=:name";
	final String LOGIN_JPQL="select * from employee where id=:id and binary password=:pass";
@PersistenceUnit
	private EntityManagerFactory factory;	

	@Override
	public EmployeeBean login(int id, String password) {
	// TODO Auto-generated method stub
		
		EntityManager manager=factory.createEntityManager();
		TypedQuery<EmployeeBean> query=(TypedQuery<EmployeeBean>) manager.createNativeQuery(LOGIN_JPQL,EmployeeBean.class);
		query.setParameter("id",id);
		query.setParameter("pass",password);
		try {
			EmployeeBean bean=query.getSingleResult();
			return bean;
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}

	@Override
	public int register(EmployeeBean bean) {
		// TODO Auto-generated method stub

		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
	
		
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return bean.getId();
		}
		catch (Exception e) {
			// TODO: handle exception
			transaction.rollback();
		}
		return -1;
	}

	@Override
	public boolean deleteEmployee(int id) {

		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
		EmployeeBean bean=manager.find(EmployeeBean.class,id);
		
		
			transaction.begin();
			manager.remove(bean);
			transaction.commit();
			return true;
		}catch (Exception e) {

		transaction.rollback();
		e.printStackTrace();
		}
		return false;
	}

	@Override
	public EmployeeBean searchEmployee(int id) {
		EntityManager manager=factory.createEntityManager();
		TypedQuery<EmployeeBean> quuery=manager.createQuery(SELECT_JPQL,EmployeeBean.class);
	    quuery.setParameter("name", id);
	    try{
		EmployeeBean e=quuery.getSingleResult();
		return e;
	    }catch (Exception e) {
	    	
	    	e.printStackTrace();
	    	return null;
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
	
	}

	@Override
	public boolean updateEmployee(EmployeeBean bean) {

		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		EmployeeBean employeeBean=manager.find(EmployeeBean.class,bean.getId());
		try {
			transaction.begin();
			
			
		employeeBean.setName(bean.getName());
		employeeBean.setGender(bean.getGender());
		employeeBean.setDoj(bean.getDoj());
		transaction.commit();
		return true;
	
	}catch (Exception e) {
		e.printStackTrace();
		transaction.commit();
		// TODO: handle exception
	}
		return false;
	}

	@Override
	public boolean changePassword(int id,String password) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
		transaction.begin();
		EmployeeBean bean=manager.find(EmployeeBean.class,id);
		bean.setPassword(password);
		transaction.commit();
		return true;
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		return false;
	}

}
