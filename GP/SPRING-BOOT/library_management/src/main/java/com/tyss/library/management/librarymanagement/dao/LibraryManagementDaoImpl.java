package com.tyss.library.management.librarymanagement.dao;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.mail.internet.MimeMessage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Repository;

import com.tyss.library.management.librarymanagement.dto.BookRegistration;
import com.tyss.library.management.librarymanagement.dto.BookTransaction;
import com.tyss.library.management.librarymanagement.dto.BooksInventory;
import com.tyss.library.management.librarymanagement.dto.Users;
@Repository
public class LibraryManagementDaoImpl implements LibraryManagementDao{
	
	static Date returnDate;
	
	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Autowired
	private JavaMailSender sender;
	
	@Override
	public boolean registerUser(Users userInfo,String to,String subject,String body){
		
		MimeMessage message=sender.createMimeMessage();
		
		
		EntityManager em = factory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		try {
			
			MimeMessageHelper helper =new MimeMessageHelper(message, true);
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(body,true);
			sender.send(message);
			et.begin();
			em.persist(userInfo);
			et.commit();
			return true;
		} catch (Exception e) {
			et.rollback();
			e.printStackTrace();
			return false;
		}
		
	}//end of registerUser

	@Override
	public Users loginUser(String userName, String password) {
		EntityManager em = factory.createEntityManager();
		String jpql="from Users where userEmail=:email and userPassword=:password";
		try {
			Query query=em.createQuery(jpql);
			query.setParameter("email",userName);
			query.setParameter("password",password);
			return (Users)query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
			
		
	}//end of loginUser

	@Override
	public boolean updateUser(Users user) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Users userInfo=em.find(Users.class,user.getUserId());
		if(userInfo!=null) {
			et.begin();
            userInfo.setUserName(user.getUserName());
            userInfo.setUserEmail(user.getUserEmail());
            et.commit();
			return true;
		}
		
		return false;
	}//End of updateUser

	@Override
	public boolean removeUser(int id) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Users userInfo = em.find(Users.class, id);

		if (userInfo == null) {
			return false;
		} else {

			try {
				em.remove(userInfo);
				et.commit();
			} catch (Exception e) {
				et.rollback();
				e.printStackTrace();
			}
			return true;
		}
		
	}// End of removeUser

	@Override
	public boolean addBook(BooksInventory bookDto) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		try {
			et.begin();
			em.merge(bookDto);
			et.commit();
			return true;
		} catch (Exception e) {
			et.rollback();
			e.printStackTrace();
			return false;
		}
			
	}//End of addBook

	@Override
	public boolean deleteBook(int id) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		BooksInventory bookInfo = em.find(BooksInventory.class, id);

		if (bookInfo == null) {
			return false;
		} else {

			try {
				em.remove(bookInfo);
				et.commit();
			} catch (Exception e) {
				et.rollback();
				e.printStackTrace();
			}
			return true;
		}
		
	}//End of deleteBook

	@Override
	public boolean updateBook(BooksInventory book) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		BooksInventory bookInfo=em.find(BooksInventory.class,book.getBookId());
		if(bookInfo!=null) {
			et.begin();
			bookInfo.setBookName(book.getBookName());
			bookInfo.setAuthor1(book.getAuthor1());
			bookInfo.setAuthor2(book.getAuthor2());
			bookInfo.setPublisher(book.getPublisher());
			bookInfo.setYearOfPublication(book.getYearOfPublication());
			
			et.commit();
			return true;
		}
		return false;
	}//End of updateBook

	@Override
	public BooksInventory getBook(BooksInventory bookDto) {
		EntityManager em = factory.createEntityManager();

		BooksInventory bookInfo = em.find(BooksInventory.class, bookDto.getBookId());
		if (bookInfo == null) {
			return null;
		}
		return bookInfo;
	}//End of getBook

	@SuppressWarnings("unchecked")
	@Override
	public List<Users> getAllUsers() {
		EntityManager em = factory.createEntityManager();
		String queryStr="from Users";
		Query query=em.createQuery(queryStr);
		return query.getResultList();
	}//End of getAllUsers

	@SuppressWarnings("unchecked")
	@Override
	public List<BooksInventory> getAllBooks() {
		EntityManager em = factory.createEntityManager();
		String queryStr="from BooksInventory";
		Query query=em.createQuery(queryStr);
		return query.getResultList();
	}

	/*
	 * @Override public StudentBookDto acceptBookRequest(int userId, int bookId) {
	 * StudentBookDto studentBook=new StudentBookDto(); EntityManager em =
	 * factory.createEntityManager(); EntityTransaction et = em.getTransaction();
	 * 
	 * try { BookInfoDto bookInfoDto=em.find(BookInfoDto.class,bookId); et.begin();
	 * if(bookInfoDto!=null) { Date date = new Date();
	 * studentBook.setUserId(userId); studentBook.setBookId(bookId);
	 * studentBook.setBookName(bookInfoDto.getBookName());
	 * studentBook.setAuthorName(bookInfoDto.getAuthorName());
	 * studentBook.setCategory(bookInfoDto.getCategory());
	 * studentBook.setIssueDate(date);
	 * 
	 * em.remove(bookInfoDto);
	 * 
	 * em.persist(studentBook); }
	 * 
	 * et.commit(); } catch (Exception e) { et.rollback(); e.printStackTrace(); }
	 * return studentBook; }//End of acceptBookRequest
	 * 
	 * @SuppressWarnings("unchecked")
	 * 
	 * @Override public List<StudentBookDto> getIssueBookList(int userId) {
	 * EntityManager em = factory.createEntityManager(); String
	 * jpql="from StudentBookDto where userId=:userId"; Query
	 * query=em.createQuery(jpql); query.setParameter("userId", userId); return
	 * query.getResultList(); }
	 * 
	 * @Override public boolean returnBook(int bookId) { boolean flag=false;
	 * EntityManager em = factory.createEntityManager(); EntityTransaction et =
	 * em.getTransaction(); try { StudentBookDto
	 * studentBook=em.find(StudentBookDto.class,bookId); BookInfoDto bookInfo=new
	 * BookInfoDto(); if(studentBook!=null) {
	 * bookInfo.setBookId(studentBook.getBookId());
	 * bookInfo.setBookName(studentBook.getBookName());
	 * bookInfo.setAuthorName(studentBook.getAuthorName());
	 * bookInfo.setCategory(studentBook.getCategory());
	 * 
	 * et.begin(); em.remove(studentBook); em.persist(bookInfo); et.commit();
	 * flag=true; } } catch (Exception e) { e.printStackTrace(); } return flag; }
	 * 
	 */	
	
	@Override
	public List<Users> searchByName(String userName) {
		EntityManager em = factory.createEntityManager();
		String jpql="from Users where userName=:userName";
		Query query=em.createQuery(jpql);
		query.setParameter("userName",userName);
		return query.getResultList();
	}

	@Override
	public boolean changePassword(String email, String password,String newPassword) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		String jpql="from Users where userEmail=:email and userPassword=:password";
		try {
			Query query=em.createQuery(jpql);
			query.setParameter("email",email);
			query.setParameter("password",password);
		 Users dto = (Users)query.getSingleResult();
		 if(dto != null) {
			 dto.setUserPassword(newPassword);
			 et.commit();
			 return true;
		 }else {
			 return false;
		 }
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		
	}

	@Override
	public boolean requestBook(BooksInventory book,int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		BookRegistration bookreg = new BookRegistration();
		bookreg.setBookId(book.getBookId());
		bookreg.setRegDate(new Date());
		bookreg.setUserId(id);
		bookreg.setAuthor1(book.getAuthor1());
		bookreg.setAuthor2(book.getAuthor2());
		bookreg.setBookName(book.getBookName());
		bookreg.setPublisher(book.getPublisher());
		bookreg.setYearOfPublication(book.getYearOfPublication());
		try {
			transaction.begin();
			manager.merge(bookreg);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public List<BookRegistration> getAllBook() {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		String get = "from BookRegistration";
		Query query = manager.createQuery(get);
		try {
			List<BookRegistration> list = query.getResultList();
			return list;
		} catch (Exception e) {
			return null;
		}
	}
	
	@Override
	public boolean removeBook(int bId) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		BookRegistration book = manager.find(BookRegistration.class, bId);
		if (book == null) {
			return false;
		}
		transaction.begin();
		manager.remove(book);
		transaction.commit();
		return true;
	}
	
	@Override
	public boolean allocateBook(BookRegistration bookAction) {
		Calendar calendar = Calendar.getInstance();
		Date today = calendar.getTime();
		calendar.add(Calendar.DAY_OF_YEAR, 14);
		Date returnDate = calendar.getTime();
		long d = returnDate.getTime() - today.getTime();
		int days =(int)(d/(24*60*60*1000));
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		BookTransaction allocateBook = new BookTransaction();
		allocateBook.setIssuedDate(today);
		allocateBook.setReturnDate(returnDate);
		allocateBook.setAuthor1(bookAction.getAuthor1());
		allocateBook.setAuthor2(bookAction.getAuthor2());
		allocateBook.setPublisher(bookAction.getPublisher());
		allocateBook.setYearOfPublication(bookAction.getYearOfPublication());
		allocateBook.setBookId(bookAction.getBookId());
		allocateBook.setBookName(bookAction.getBookName());
		allocateBook.setUserId(bookAction.getUserId());
		try {
			transaction.begin();
			manager.merge(allocateBook);
			transaction.commit();
			System.out.println("book added");
			return true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<BookTransaction> getAlluserBooks(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
System.out.println(id);
		String get = "from BookTransaction where userId=:id";
		Query query=manager.createQuery(get);
		query.setParameter("id",id);
		List<BookTransaction> list = query.getResultList();
		System.out.println(list);
		return list;
	}

	@Override
	public boolean removeBookReg(int bId) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		BookTransaction book = manager.find(BookTransaction.class, bId);
		if (book == null) {
			return false;
		}
		transaction.begin();
		manager.remove(book);
		transaction.commit();
		return true;
	}

	@Override
	public int addBookAgain(BookTransaction book) {
		int fine = 0;
		Date retDate = book.getReturnDate();
		Date date = new Date();
		long d = date.getTime() - retDate.getTime();
		int days =(int)(d/(24*60*60*1000));
		if(days <=0) {
			 fine=0;
		}else {
			fine = days*1;
		}
		
		BooksInventory bk = new BooksInventory();
		bk.setBookId(book.getBookId());
		bk.setBookName(book.getBookName());
		bk.setAuthor1(book.getAuthor1());
		bk.setAuthor2(book.getAuthor2());
		bk.setPublisher(book.getPublisher());
		bk.setYearOfPublication(book.getYearOfPublication());
		
		EntityManager em = factory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		try {
			et.begin();
			em.merge(bk);
			et.commit();
			return fine;
		} catch (Exception e) {
			et.rollback();
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	public boolean addBookAgain1(BookRegistration book) {
		BooksInventory bk = new BooksInventory();
		bk.setBookId(book.getBookId());
		bk.setBookName(book.getBookName());
		bk.setAuthor1(book.getAuthor1());
		bk.setAuthor2(book.getAuthor2());
		bk.setPublisher(book.getPublisher());
		bk.setYearOfPublication(book.getYearOfPublication());
		
		EntityManager em = factory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		try {
			et.begin();
			em.merge(bk);
			et.commit();
			return true;
		} catch (Exception e) {
			et.rollback();
			e.printStackTrace();
			return false;
		}

	}
}
