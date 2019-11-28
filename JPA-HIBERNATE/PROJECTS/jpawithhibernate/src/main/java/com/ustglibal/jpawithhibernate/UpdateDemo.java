package com.ustglibal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class UpdateDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		Product productInfo=null;
		try {
	 entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
	 entityManager=entityManagerFactory.createEntityManager();
	 productInfo=entityManager.find(Product.class, 101);
	 if(productInfo!=null) {
		 try {
		 entityTransaction.begin();
		 productInfo.setName("");
		 productInfo.setQuantity(1);
		 entityTransaction.commit();
		 System.out.println("Updated Record Successfully");
		 }
		 catch (Exception e) {
			 entityTransaction.rollback();
	        e.printStackTrace();
	        
		}
		 entityManager.close();
		 
	 }
	 
	 entityTransaction=entityManager.getTransaction();
	 
	 
		
	}catch (Exception e) {
		// TODO: handle exception
	}
	}

}
