package com.ustglobal.lms.dao;


import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.mapping.Bag;
import org.springframework.stereotype.Repository;

import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.BookDetailsBean;
import com.ustglobal.lms.dto.LoginBean;
import com.ustglobal.lms.dto.RegisterLibrarianBean;
import com.ustglobal.lms.dto.RegisterStudentBean;
import com.ustglobal.lms.dto.StudentBean;

@Repository
public class StudentDaoImpl implements StudentDAO{
	@PersistenceUnit
	private EntityManagerFactory factory;
	
	
	//register user
		public boolean register(RegisterStudentBean bean) {
			EntityManager manager=factory.createEntityManager();
			EntityTransaction transaction=manager.getTransaction();
			try {
				transaction.begin();
				StudentBean studentBean=new StudentBean();
				studentBean.setCourse(bean.getCourse());
				studentBean.setMob(bean.getMob());
				studentBean.setName(bean.getName());
				studentBean.setBatch(bean.getBatch());
				studentBean.setDepartment(bean.getDepartment());
				LoginBean loginBean=new LoginBean();
				loginBean.setUsername(bean.getUsername());
				loginBean.setPassword(bean.getPassword());
				loginBean.setType("student");
				loginBean.setStatus("disable");
				loginBean.setStudentBean(studentBean);
				studentBean.setLoginBean(loginBean);
				manager.persist(studentBean);
				transaction.commit();
				return true;
			}catch (Exception e) {
				e.printStackTrace();
				return false;
				// TODO: handle exception
			}
		}
		
		//login user
		public LoginBean login(LoginBean loginBean) {
			String jpql="from LoginBean where username=:email";		
			try {
				EntityManager manager=factory.createEntityManager();
				TypedQuery<LoginBean> query=manager.createQuery(jpql,LoginBean.class);
				query.setParameter("email",loginBean.getUsername());
				LoginBean bean=query.getSingleResult();
				return bean;
				}
				
			
			catch (Exception e) {
				e.printStackTrace();
				return null;
				// TODO: handle exception
			}
		
		}
		//changePassword
		public boolean changePassword(LoginBean bean) {
			EntityManager manager=factory.createEntityManager();
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			try {
				System.out.println(bean);
			LoginBean loginBean=manager.find(LoginBean.class,bean.getId());
			loginBean.setPassword(bean.getPassword());
			transaction.commit();
			return true;
			}
			catch (Exception e) {
				e.printStackTrace();
				transaction.rollback();
				return false;
				// TODO: handle exception
			}
		}
		//delete User
		public boolean deleteUser(int id) {
			EntityManager manager=factory.createEntityManager();
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			try {
				LoginBean bean=manager.find(LoginBean.class,id);
				bean.setStatus("removed");
				transaction.commit();
				return true;
			}catch (Exception e) {
				e.printStackTrace();
				transaction.rollback();
				return false;
				// TODO: handle exception
			}
		}
		
		//search book
		public List<BookBean> searchBook() {
			String jpql="from BookBean where  status='available'";
			EntityManager manager=factory.createEntityManager();
			TypedQuery<BookBean> query=manager.createQuery(jpql,BookBean.class);
			try {
				List<BookBean> bean=query.getResultList();
				return bean;
			}catch (Exception e) {
				e.printStackTrace();
				return null;
				// TODO: handle exception
			}
			
		}
		
		
		//make request
		public boolean makeRequest(int bid,int sid) {
			String jpql="from BookDetailsBean where sid=:sid";
			EntityManager manager=factory.createEntityManager();
			EntityTransaction transaction=manager.getTransaction();
		    try {
			transaction.begin();
			TypedQuery<BookDetailsBean> query=manager.createQuery(jpql,BookDetailsBean.class);
			query.setParameter("sid",sid);
			List<BookDetailsBean> bbeans=query.getResultList();
			if(bbeans.size()<4) {
			BookBean bean=manager.find(BookBean.class,bid);
			StudentBean studentBean=manager.find(StudentBean.class,sid);
			BookDetailsBean detailsBean=new BookDetailsBean();
			detailsBean.setRequestDate(new Date());
			detailsBean.setStatus("requested");
			detailsBean.setBookBean(bean);
			detailsBean.setStudentBean(studentBean);
			bean.setStatus("unnavailable");
			manager.persist(detailsBean);
			transaction.commit();
			return true;
			}
			else {
			return true;
			}
		    }
		    catch (Exception e) {
		    	
		    	
		    	try {
		    		BookBean bean=manager.find(BookBean.class,bid);
					StudentBean studentBean=manager.find(StudentBean.class,sid);
					BookDetailsBean detailsBean=new BookDetailsBean();
					detailsBean.setRequestDate(new Date());
					detailsBean.setStatus("requested");
					detailsBean.setBookBean(bean);
					detailsBean.setStudentBean(studentBean);
					bean.setStatus("unnavailable");
					manager.persist(detailsBean);
					transaction.commit();
                 
		    	}catch (Exception e1) {
		    		e1.printStackTrace();
			    	transaction.rollback();
					// TODO: handle exception
				}
		    	
				// TODO: handle exception
		    	return false;
			}
//		    bean.getBookDetailsBeans().add(detailsBean);
//		    bean.setBookDetailsBeans(bean.getBookDetailsBeans());
		    
		}

	
		
	
		
	//viewBag
		
		 public  List<BookDetailsBean> viewBag(int sid){
			 String jpql="from BookDetailsBean where sid=:sid and status='requested' or status='approved'";
        	 EntityManager manager=factory.createEntityManager();
        	 TypedQuery<BookDetailsBean> query=manager.createQuery(jpql,BookDetailsBean.class);
        	 query.setParameter("sid",sid);
        	List<BookDetailsBean> bagBeans=query.getResultList();
        	System.out.println(bagBeans);
        	return bagBeans;
        	
         }
	

     			 
		 
		 //return book
		 public List<BookDetailsBean> returnBook(int id){
			 EntityManager manager=factory.createEntityManager();
			 EntityTransaction transaction=manager.getTransaction();
			 transaction.begin();
			 BookDetailsBean detailsBean=manager.find(BookDetailsBean.class,id);
			 detailsBean.setStatus("returned");
			 BookBean bean=detailsBean.getBookBean();
			 bean.setStatus("available");
			 String sjpql="from BookDetailsBean where sid=:sid and status='requested' or status='approved'";
			 TypedQuery<BookDetailsBean> query=manager.createQuery(sjpql,BookDetailsBean.class);
			 query.setParameter("sid",detailsBean.getStudentBean().getSid());
			 List<BookDetailsBean> bagBeans =query.getResultList();
			 transaction.commit();
			 return bagBeans;
			 
		 }
		 
		//report
		 
		 public List<BookDetailsBean> bookReport(int sid){
			 EntityManager manager=factory.createEntityManager();
			 EntityTransaction transaction=manager.getTransaction();
			 String jpql="from BookDetailsBean where sid=:sid";
			 try {
			 TypedQuery<BookDetailsBean> query=manager.createQuery(jpql,BookDetailsBean.class);
			 query.setParameter("sid",sid);
			 List<BookDetailsBean> bookDetailsBean=query.getResultList();
			 System.out.println(bookDetailsBean);
			 return bookDetailsBean;
			 }catch (Exception e) {
				 e.printStackTrace();
				 return null;
				// TODO: handle exception
			}
		 
		 }
		
	
}
	


