package com.ustglibal.jpawithhibernate.jpql;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicDeleteDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction  entityTransaction=null;
		try {
		entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
	     entityManager=entityManagerFactory.createEntityManager();
	     entityTransaction=entityManager.getTransaction();
	  
	     
		Query  query=entityManager.createQuery("delete from Product  where id=:pid");
		query.setParameter("pid",102);
		  entityTransaction.begin();
		int count=query.executeUpdate();
		entityTransaction.commit();
		System.out.println("Delete "+count+" rows sucessfully");
		}
		catch (Exception e) {
			entityTransaction.rollback();
			e.printStackTrace();
			// TODO: handle exception
		}
		entityManager.close();
	}

}
