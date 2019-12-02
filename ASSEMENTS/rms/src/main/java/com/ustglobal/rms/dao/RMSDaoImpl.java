package com.ustglobal.rms.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.rms.dto.OrderBean;
import com.ustglobal.rms.dto.ProductBean;
import com.ustglobal.rms.dto.RetailerBean;
@Repository
public class RMSDaoImpl implements RMSDAO {
	@PersistenceUnit
	private EntityManagerFactory factory;
	public RMSDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	final String SELECT_PRODUCT="from ProductBean where id=:name";
	final String SELECT_ORDER="from OrderBean where id=:name";
	final String LOGIN_JPQL="select * from RetailerBean where id=:id and binary password=:pass";
	

	EntityManager manager=factory.createEntityManager();

	@Override
	public RetailerBean login(int id, String password) {
		TypedQuery<RetailerBean> query=(TypedQuery<RetailerBean>) manager.createNativeQuery(LOGIN_JPQL,RetailerBean.class);
		query.setParameter("id",id);
		query.setParameter("pass",password);
		try {
			RetailerBean bean=query.getSingleResult();
			return bean;
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;		
		
	}

	@Override
	public boolean changePassword(int id,String password) {
		// TODO Auto-generated method stub
		EntityTransaction transaction=manager.getTransaction();
		try {
		transaction.begin();
		RetailerBean bean=manager.find(RetailerBean.class,id);
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
	

	@Override
	public int Register(RetailerBean bean) {
		// TODO Auto-generated method stub
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
	public ProductBean searchProduct(int id) {
		// TODO Auto-generated method stub
		TypedQuery<ProductBean> quuery=manager.createQuery(SELECT_PRODUCT,ProductBean.class);
	    quuery.setParameter("name", id);
	    try{
		ProductBean e=quuery.getSingleResult();
		return e;
	    }catch (Exception e) {
	    	
	    	e.printStackTrace();
	    	return null;
			// TODO: handle exception
		}
	}

	@Override
	public OrderBean displayOrder(int id) {
		// TODO Auto-generated method stub
		TypedQuery<OrderBean> query=manager.createQuery(SELECT_ORDER,OrderBean.class);
	    query.setParameter("name", id);
	    try{
		OrderBean e=query.getSingleResult();
		return e;
	    }catch (Exception e) {
	    	
	    	e.printStackTrace();
	    	return null;
			// TODO: handle exception
		}
	}
	
	

}
