package com.ustglibal.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicInsertDemo {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
	
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			Query query=entityManager.createNativeQuery("insert into  Product values(:pid,:pname,:pquantity)"); 
		   
	
			query.setParameter("pid", 102);
			query.setParameter("pname", "mobile");
		    query.setParameter("pquantity",10);
		      query.executeUpdate();
			
			//query.executeUpdate();
			entityTransaction.commit();
		}catch (Exception e) {
			//entityTransaction.rollback();
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
