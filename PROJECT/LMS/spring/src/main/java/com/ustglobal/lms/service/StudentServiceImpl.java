package com.ustglobal.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.lms.dao.StudentDAO;
import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.BookDetailsBean;
import com.ustglobal.lms.dto.LoginBean;
import com.ustglobal.lms.dto.RegisterLibrarianBean;
import com.ustglobal.lms.dto.RegisterStudentBean;
import com.ustglobal.lms.dto.StudentBean;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDAO dao;

	@Override
	public boolean register(RegisterStudentBean bean) {
		// TODO Auto-generated method stub
		//		if((!bean.getName().equals("")) 
		//				&& (bean.getName() != null) 
		//				&& (bean.getName().matches("^[a-zA-Z]*$"))) {
		//			if(bean.getPassword()!=null&&(bean.getPassword().length()>6&&bean.getPassword().length()<10)
		//					&&(!bean.getPassword().matches("^[a-zA-Z]*$"))){
		return dao.register(bean);
		//			}
		//			return false;
		//
		//		}else {
		//			return false;
		//		}

	}

	@Override
	public Object login(LoginBean loginBean) {
		// TODO Auto-generated method stub
		//		if((!loginBean.getUsername().equals("")) 
		//				&& (loginBean.getPassword() != null) 
		//				&& (loginBean.getPassword().matches("^[a-zA-Z]*$"))) {
		//			if(loginBean.getPassword()!=null&&(loginBean.getPassword().length()>6&&loginBean.getPassword().length()<10)
		//					&&(!loginBean.getPassword().matches("^[a-zA-Z]*$"))){
		LoginBean bean= dao.login(loginBean);
		if(bean!=null) {
			if(bean.getPassword().equals(loginBean.getPassword())){
				switch(bean.getStatus()) {
				case "enable":return bean;
				case "disable":return "wait for approval/contact librarian";
				case "removed":return "access denied";
				}
			}else {
				return "invalid password";
			}
		}
	    else {
				return "invalid username(email)";
			}
		return "invalid";
		
		
}

	@Override
	public List<BookBean> searchBook() {
		// TODO Auto-generated method stub
		return dao.searchBook();
	}

	@Override
	public boolean makeRequest(int bid,int sid) {
		// TODO Auto-generated method stub
		return dao.makeRequest(bid,sid);
	}

	@Override
	public List<BookDetailsBean> viewBag(int sid) {
		// TODO Auto-generated method stub
		return dao.viewBag(sid);
	}

	@Override
	public List<BookDetailsBean> returnBook(int id) {
		// TODO Auto-generated method stub
		return dao.returnBook(id);
	}

	@Override
	public List<BookDetailsBean> bookReport(int sid) {
		// TODO Auto-generated method stub
		return dao.bookReport(sid);
	}

	@Override
	public boolean changePassword(LoginBean bean) {
		// TODO Auto-generated method stub
		return dao.changePassword(bean);
	}

	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		return dao.deleteUser(id);
	}

}
