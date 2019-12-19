package com.ustglobal.lms.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.dom4j.tree.BackedList;
import org.springframework.stereotype.Repository;

import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.BookDetailsBean;
import com.ustglobal.lms.dto.LoginBean;
import com.ustglobal.lms.dto.StudentBean;

@Repository
public class LibrarianDaoImpl implements LibrarianDAO{
	@PersistenceUnit
	private EntityManagerFactory factory;
	
	//login
	//viewStudentRequest
	public List<LoginBean> viewStudentRequest(){
		String jpql="from LoginBean where status='disable' and type='student'";
		EntityManager manager=factory.createEntityManager();
		try {
			TypedQuery<LoginBean> query=manager.createQuery(jpql,LoginBean.class);
		return query.getResultList();
			
		}catch (Exception e) {
			return null;// TODO: handle exception
		}

		
	}
//	//approve student
			public List<LoginBean> approveStudent(LoginBean bean){
				String jpql="from LoginBean where status='disable' and type='student'";
				EntityManager manager=factory.createEntityManager();
				EntityTransaction transaction=manager.getTransaction();
				LoginBean loginBean=manager.find(LoginBean.class,bean.getId());
				transaction.begin();
				loginBean.setStatus(bean.getStatus());
				transaction.commit();
				TypedQuery<LoginBean> query=manager.createQuery(jpql,LoginBean.class);
				return query.getResultList();
			}
				
			
			//viewBookRequest
			public List<BookDetailsBean> viewRequestBag(){
				String jpql="from BookDetailsBean where status='requested'";
				EntityManager manager=factory.createEntityManager();
				try {
					TypedQuery<BookDetailsBean> query=manager.createQuery(jpql,BookDetailsBean.class);
				return query.getResultList();
					
				}catch (Exception e) {
					return null;// TODO: handle exception
				}
				
			}
			
    //allocate book
			public List<BookDetailsBean> approveBook(int id){
				String sjpql="from BookDetailsBean where status='requested'";
			
				EntityManager manager=factory.createEntityManager();
				EntityTransaction transaction=manager.getTransaction();
				transaction.begin();
			try {
				BookDetailsBean bean=manager.find(BookDetailsBean.class,id);
				bean.setStatus("approved");
				bean.setIssueDate(new Date());
				TypedQuery<BookDetailsBean> query2=manager.createQuery(sjpql,BookDetailsBean.class);
				transaction.commit();
				return query2.getResultList();
		
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				transaction.rollback();
				return null;
			}
			   
				
		
			}
				
			
			//addbook

         public    boolean addBook(BookBean bean) {
            	 EntityManager manager=factory.createEntityManager();
            	 EntityTransaction transaction=manager.getTransaction();
            	 try {
            		 transaction.begin();
            		 bean.setStatus("available");
            		 manager.persist(bean);
            		 transaction.commit();
            		 return true;
            	 }catch (Exception e) {
            		 transaction.rollback();
            		 e.printStackTrace();
            		 return false;
					// TODO: handle exception
				}
             }
		//	update book
           public  boolean updateBook(BookBean bean) {
            
            	 EntityManager manager=factory.createEntityManager();
            	 EntityTransaction transaction=manager.getTransaction();
            	             	
            	 try {
            		 transaction.begin();
            		 BookBean bookBean=manager.find(BookBean.class,bean.getId());
                	 bookBean.setName(bean.getName());
                	 bookBean.setAuthor(bean.getAuthor());
                	 bookBean.setPrice(bean.getPrice());
                	 bookBean.setPublication(bean.getPublication());
                	 bookBean.setSubject(bean.getSubject());
            		 transaction.commit();
            		 return true;
            	 }catch (Exception e) {
            		 e.printStackTrace();
            		 transaction.rollback();
            		 return false;
					// TODO: handle exception
				}
            	 
             }
			//deletebook
           public List<BookBean> deleteBook(int id){
        	   EntityManager manager=factory.createEntityManager();
        	   EntityTransaction transaction=manager.getTransaction();
        	   String jpql="fromBookBean where status !='removed'or status !='unavailable'";
        	   try {
        		   transaction.begin();
        		   BookBean bean=manager.find(BookBean.class,id);
        		   bean.setStatus("removed");
        		   transaction.commit();
        		   TypedQuery<BookBean> query=manager.createQuery(jpql,BookBean.class);
        		   List<BookBean> beans=query.getResultList();
        		   return beans;
        	   }catch (Exception e) {
        		   e.printStackTrace();
        		   transaction.rollback();
				// TODO: handle exception
        		   return null;
			}
           }
           
          //delete student 
          public List<LoginBean> deleteStudent(int sid){
        	  EntityManager manager=factory.createEntityManager();
        	  EntityTransaction transaction=manager.getTransaction();
        	  String jpql="update  LoginBean set status='removed' where id=:id";
        	  String jpqls="from LoginBean where status !='removed";
        	  transaction.begin();
        	  try {
        		  StudentBean bean=manager.find(StudentBean.class,sid);
        		  TypedQuery<LoginBean> query=manager.createQuery(jpql,LoginBean.class);
        		  query.setParameter("id",bean.getLoginBean().getId());
        		  query.executeUpdate();
        		  TypedQuery<LoginBean> typedQuery=manager.createQuery(jpqls,LoginBean.class);
        		  List<LoginBean> beans=typedQuery.getResultList();
        		  return beans;
      			 }catch (Exception e) {
 				 e.printStackTrace();
 				 return null;
 				// TODO: handle exception
 			}
          }
        	  
        	  //tackBook
          public List<BookDetailsBean> trackBook(){
    		  String jpql="from BookDetailsBean where status='approved' or status='requested'";
    			 EntityManager manager=factory.createEntityManager();
    			 try {
    			 TypedQuery<BookDetailsBean> query=manager.createQuery(jpql,BookDetailsBean.class);
    			 List<BookDetailsBean> bookBeans=query.getResultList();
    			 return bookBeans;
    			 
    			 }
    			 catch (Exception e) {
    				 e.printStackTrace();
    				 return null;
					// TODO: handle exception
				}
    			 
    		 }
	
		}
    		
		 
  		 
        
          
			
	
	

