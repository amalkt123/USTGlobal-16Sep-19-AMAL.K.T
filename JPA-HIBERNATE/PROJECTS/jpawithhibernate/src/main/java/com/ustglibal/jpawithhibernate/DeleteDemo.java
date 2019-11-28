package com.ustglibal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class DeleteDemo {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		Product product=null;
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction =entityManager.getTransaction();
			product=entityManager.find(Product.class, 101);
			if(product!=null) {
				entityManager.remove(product);;
				System.out.println("Delete Record Successfully");
			entityTransaction.commit();
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		entityManager.close();
	}

}
