package com.ustglobal.lms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.LibrarianBean;
import com.ustglobal.lms.dto.LoginBean;
import com.ustglobal.lms.dto.RegisterLibrarianBean;
import com.ustglobal.lms.dto.StudentBean;
@Repository
public class AdminDaoImpl implements AdminDAO {
	@PersistenceUnit
	EntityManagerFactory factory;
	
	public boolean addLibrarian(RegisterLibrarianBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
			transaction.begin();
			LibrarianBean bean2=new LibrarianBean();
			LoginBean loginBean=new LoginBean();
			loginBean.setUsername(bean.getUsername());
			loginBean.setPassword(bean.getPassword());
			loginBean.setStatus("enable");
			loginBean.setType("librarian");
			bean2.setMob(bean.getMob());
			bean2.setName(bean.getName());
			bean2.setBean(loginBean);
			loginBean.setLibrarianBean(bean2);
			manager.persist(bean2);
			transaction.commit();
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
			// TODO: handle exception
		}
	}
		//remove libararian
		public boolean removeLibararian(int lid) {
		// String jpql="delete from LibrarianBean where lid=:lid";
		 EntityManager  manager2=factory.createEntityManager();
		 EntityTransaction transaction2=manager2.getTransaction();
		 try {
			 transaction2.begin();
			 LibrarianBean librarianBean=manager2.find(LibrarianBean.class,lid);
			 LoginBean loginBean=manager2.find(LoginBean.class,librarianBean.getBean().getId());
			 loginBean.setStatus("removed");
			transaction2.commit();
			 return true;
		 }catch (Exception e) {
			 e.printStackTrace();
			 return false;
			// TODO: handle exception
		}
		
	}
		
		
		
		
		
		public boolean removeStudent(int sid) {
			// String jpql="delete from StudentBean where sid=:sid";
			 EntityManager  manager2=factory.createEntityManager();
			 EntityTransaction transaction2=manager2.getTransaction();
			 try {
				 transaction2.begin();
				 StudentBean bean=manager2.find(StudentBean.class,sid);
				 LoginBean loginBean=manager2.find(LoginBean.class,bean.getLoginBean().getId());
				 loginBean.setStatus("removed");
				  transaction2.commit();
				 return true;
			 }catch (Exception e) {
				 e.printStackTrace();
				 transaction2.rollback();
				 return false;
				// TODO: handle exception
			}
			
		}
		
		public LibrarianBean searchLibrarian(int lid) {
			EntityManager entityManager=factory.createEntityManager();
			try {
				LibrarianBean bean=entityManager.find(LibrarianBean.class,lid);
				return bean;
			}catch (Exception e) {
				e.printStackTrace();
				return null;
				// TODO: handle exception
			}
		}
		
		
		
		public StudentBean searchStudent(int sid) {
			EntityManager entityManager=factory.createEntityManager();
			try {
				StudentBean bean=entityManager.find(StudentBean.class,sid);
				return bean;
			}catch (Exception e) {
				e.printStackTrace();
				return null;
				// TODO: handle exception
			}
		}
		
		
	public List<LibrarianBean> viewLibrarians(){
		
			String jpql="from LibrarianBean";
			EntityManager  manager=factory.createEntityManager();
			TypedQuery<LibrarianBean> query=manager.createQuery(jpql,LibrarianBean.class);
				return query.getResultList();
	
		}
	

	
	public List<StudentBean> viewStudents() {
		String jpql="from StudentBean";
		EntityManager manager=factory.createEntityManager();
		TypedQuery<StudentBean> query=manager.createQuery(jpql,StudentBean.class);
		List<StudentBean> beans= query.getResultList();
		System.out.println(beans.size());
		return beans;
	}
	
	
	
	
	
	
	
	public List<BookBean> viewBooks(){
		String jpql="from BookBean";
		EntityManager manager=factory.createEntityManager();
		TypedQuery<BookBean> query=manager.createQuery(jpql,BookBean.class);
		return query.getResultList();
	}
	
	
	
	
	
	
	
	
	
	
	
}