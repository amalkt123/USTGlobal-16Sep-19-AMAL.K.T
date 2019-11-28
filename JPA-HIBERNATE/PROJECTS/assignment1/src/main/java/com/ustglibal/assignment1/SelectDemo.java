package com.ustglibal.assignment1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.assignment1.dto.Student;

public class SelectDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			
			entityManager=entityManagerFactory.createEntityManager();
			
			Student s=entityManager.find(Student.class, 1);
			if(s!=null) {
				System.out.println("id : "+s.getId());
				System.out.println("name : "+s.getName());
				System.out.println("age : "+s.getAge());
				System.out.println("grade : "+s.getGrade());
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}

}
