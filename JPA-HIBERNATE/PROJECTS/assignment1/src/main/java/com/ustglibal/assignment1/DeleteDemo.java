package com.ustglibal.assignment1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import com.ustglobal.assignment1.dto.Student;

public class DeleteDemo {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction  entityTransaction=null;
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			
			entityManager=entityManagerFactory.createEntityManager();
			
			Student s=entityManager.find(Student.class, 1);
			if(s!=null) {
				entityTransaction=entityManager.getTransaction();
			    entityTransaction.begin();
				entityManager.remove(s);
				s.setAge(15);
				s.setName("raman");
				s.setGrade("A");
				
			    entityManager.persist(s);
			    entityTransaction.commit();
			}
			
		}catch (Exception e) {
			entityTransaction.rollback();
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
