package com.ustglobal.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.lms.dao.AdminDAO;
import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.LibrarianBean;
import com.ustglobal.lms.dto.RegisterLibrarianBean;
import com.ustglobal.lms.dto.StudentBean;

@Service
public class AdminServiceimpl implements AdminService {
	@Autowired
	AdminDAO dao;

	@Override
	public boolean addLibrarian(RegisterLibrarianBean bean) {
		// TODO Auto-generated method stub
		return dao.addLibrarian(bean);
	}

	@Override
	public boolean removeLibararian(int lid) {
		// TODO Auto-generated method stub
		return dao.removeLibararian(lid);
	}

	@Override
	public boolean removeStudent(int sid) {
		// TODO Auto-generated method stub
		return dao.removeStudent(sid);
	}

	@Override
	public LibrarianBean searchLibrarian(int lid) {
		// TODO Auto-generated method stub
		return dao.searchLibrarian(lid);
	}

	@Override
	public StudentBean searchStudent(int sid) {
		// TODO Auto-generated method stub
		return dao.searchStudent(sid);
	}

	@Override
	public List<LibrarianBean> viewLibrarians() {
		// TODO Auto-generated method stub
		return dao.viewLibrarians();
	}

	@Override
	public List<StudentBean> viewStudents() {
		// TODO Auto-generated method stub
		return dao.viewStudents();
	}

	@Override
	public List<BookBean> viewBooks() {
		// TODO Auto-generated method stub
		return dao.viewBooks();
	}

}
