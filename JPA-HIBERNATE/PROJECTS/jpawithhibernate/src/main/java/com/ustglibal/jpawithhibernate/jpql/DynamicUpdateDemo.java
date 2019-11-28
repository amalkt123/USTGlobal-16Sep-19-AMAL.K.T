package com.ustglibal.jpawithhibernate.jpql;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicUpdateDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction  entityTransaction=null;
		String jpql="update Product set name=:pname,quantity=:pquantity where id=:pid";
		try {
		entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
	     entityManager=entityManagerFactory.createEntityManager();
	     entityTransaction=entityManager.getTransaction();
	  
	     
		Query  query=entityManager.createQuery(jpql);
		query.setParameter("pname", "book");
		query.setParameter("pquantity", 10);
		query.setParameter("pid", 101);
		  entityTransaction.begin();
		int count=query.executeUpdate();
		entityTransaction.commit();
		System.out.println("Update "+count+" rows sucessfully");
		}
		catch (Exception e) {
			entityTransaction.rollback();
			e.printStackTrace();
			// TODO: handle exception
		}
		entityManager.close();
	}

}
