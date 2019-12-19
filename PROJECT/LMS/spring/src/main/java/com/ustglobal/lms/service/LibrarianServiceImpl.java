package com.ustglobal.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.lms.dao.LibrarianDAO;
import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.BookDetailsBean;
import com.ustglobal.lms.dto.LoginBean;
import com.ustglobal.lms.dto.StudentBean;
@Service
public class LibrarianServiceImpl implements LibrarianService{
	@Autowired
	private LibrarianDAO dao;

	@Override
	public List<LoginBean> approveStudent(LoginBean loginBean) {
	
			return dao.approveStudent(loginBean);
	
	}

	@Override
	public boolean addBook(BookBean bean) {
		if(bean.getAuthor()!=null&&bean.getName()!=null&bean.getPrice()>0) {
		// TODO Auto-generated method stub
		return dao.addBook(bean);
		}
		else {
			return false;
		}
	}

	@Override
	public boolean updateBook(BookBean bean) {
		// TODO Auto-generated method stub
		return dao.updateBook(bean );
	}

	@Override
	public List<BookDetailsBean> viewRequestBag() {
		// TODO Auto-generated method stub
		return dao.viewRequestBag();
	}

	@Override
	public List<LoginBean> viewStudentRequest() {
		// TODO Auto-generated method stub
		return dao.viewStudentRequest();
	}

	@Override
	public List<BookBean> deleteBook(int id) {
		// TODO Auto-generated method stub
		return dao.deleteBook(id);
	}

	@Override
	public List<LoginBean> deleteStudent(int sid) {
		// TODO Auto-generated method stub
		return dao.deleteStudent(sid);
	}

	@Override
	public List<BookDetailsBean> trackBook() {
		// TODO Auto-generated method stub
		return dao.trackBook();
	}

	@Override
	public List<BookDetailsBean> approveBook(int id) {
		// TODO Auto-generated method stub
		return dao.approveBook(id);
	}

}
