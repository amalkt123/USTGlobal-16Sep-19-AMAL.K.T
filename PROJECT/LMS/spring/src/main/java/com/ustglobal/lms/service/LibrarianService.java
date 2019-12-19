package com.ustglobal.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ustglobal.lms.dao.LibrarianDAO;
import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.BookDetailsBean;
import com.ustglobal.lms.dto.LoginBean;
import com.ustglobal.lms.dto.StudentBean;

public interface LibrarianService {
	
	List<LoginBean> approveStudent(LoginBean loginBean);
    boolean addBook(BookBean bean);
    boolean updateBook(BookBean bean);
    List<BookDetailsBean> viewRequestBag();
	public List<LoginBean> viewStudentRequest();
	 public List<BookBean> deleteBook(int id);
	 List<LoginBean> deleteStudent(int sid);
	 public List<BookDetailsBean> trackBook();
	 List<BookDetailsBean> approveBook(int id);

}
