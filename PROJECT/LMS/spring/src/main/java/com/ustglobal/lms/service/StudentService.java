package com.ustglobal.lms.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.BookDetailsBean;
import com.ustglobal.lms.dto.LoginBean;
import com.ustglobal.lms.dto.RegisterLibrarianBean;
import com.ustglobal.lms.dto.RegisterStudentBean;
import com.ustglobal.lms.dto.StudentBean;


public interface StudentService {
	boolean register(RegisterStudentBean bean);
	Object login(LoginBean loginBean);
	 List<BookBean> searchBook();
	 boolean makeRequest(int bid,int sid);
	   List<BookDetailsBean> viewBag(int sid);
	   List<BookDetailsBean> returnBook(int id);
	   List<BookDetailsBean> bookReport(int sid);
	   boolean changePassword(LoginBean bean);
	   public boolean deleteUser(int id);

}
