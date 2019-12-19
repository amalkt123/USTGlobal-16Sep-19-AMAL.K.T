package com.ustglobal.lms.service;

import java.util.List;

import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.LibrarianBean;
import com.ustglobal.lms.dto.RegisterLibrarianBean;
import com.ustglobal.lms.dto.StudentBean;

public interface AdminService {
	boolean addLibrarian(RegisterLibrarianBean bean);
	 boolean removeLibararian(int lid);
	 boolean removeStudent(int sid);
	 LibrarianBean searchLibrarian(int lid);
	 StudentBean searchStudent(int sid);
	 List<LibrarianBean> viewLibrarians();
	 List<StudentBean> viewStudents();
	 List<BookBean> viewBooks();

}
