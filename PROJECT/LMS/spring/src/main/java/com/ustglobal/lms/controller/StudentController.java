package com.ustglobal.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.BookDetailsBean;
import com.ustglobal.lms.dto.LibrarianBean;
import com.ustglobal.lms.dto.LoginBean;
import com.ustglobal.lms.dto.RegisterLibrarianBean;
import com.ustglobal.lms.dto.RegisterStudentBean;
import com.ustglobal.lms.dto.StudentBean;
import com.ustglobal.lms.service.StudentService;
import com.ustglobal.response.AdminResponse;
import com.ustglobal.response.StudentResponse;

import javassist.expr.Instanceof;
@CrossOrigin(origins ="*",allowedHeaders ="*",allowCredentials ="true")
@RestController
public class StudentController {
	private final int SUCCESS_STATUS_CODE=200;
	private final int FAILD_STATUS_CODE=400;
	private final String SUCCESS_MESSAGE="sucess";
	private final String FAILD_MESSAGE="faild";
	@Autowired	
	private StudentService service;
	@PostMapping(path = "/student-register",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public StudentResponse register(@RequestBody RegisterStudentBean bean) {
	    StudentResponse response=new StudentResponse();
		boolean check=service.register(bean);
		
		if(check) {
			response.setStatusCode(SUCCESS_STATUS_CODE);
			response.setMessage(SUCCESS_MESSAGE);
			response.setDescription("sucessfully registered");
		
			
		}
		else {
			response.setStatusCode(FAILD_STATUS_CODE);
			response.setMessage(FAILD_MESSAGE);
			response.setDescription("account is allready exsist try another username");

		}
		return response;
		
	}
	
	
	@PostMapping(path = "/login",consumes =MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE )
	public AdminResponse login(@RequestBody LoginBean bean) {
	    Object object=service.login(bean);
		AdminResponse adminResponse=new AdminResponse();
		if(object instanceof LoginBean) {
			LoginBean loginBean=(LoginBean)object;
			adminResponse.setStatusCode(SUCCESS_STATUS_CODE);
			adminResponse.setMessage(SUCCESS_MESSAGE);
			adminResponse.setDescription("sucessfully login");
			adminResponse.setType(loginBean.getType());
			adminResponse.setLoginBean(loginBean);
			System.out.println(loginBean.getStudentBean());
		
			
			if(loginBean.getType()=="librarian") {
				adminResponse.setLibrarianBean(loginBean.getLibrarianBean());
			}
			else if(loginBean.getType().equals("student")) {
				adminResponse.setStudentBean(loginBean.getStudentBean());
			}
			return adminResponse;
			
		}
		else {
			adminResponse.setStatusCode(FAILD_STATUS_CODE);
			adminResponse.setMessage(FAILD_MESSAGE);
			adminResponse.setDescription((String)object);
			
			return adminResponse;
		}
		
	}
	//changepassword
	@PostMapping(path = "/change-password",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public StudentResponse changePassword(@RequestBody LoginBean bean) {
		StudentResponse response=new StudentResponse();
		boolean check=service.changePassword(bean);
		if(check) {
			response.setStatusCode(SUCCESS_STATUS_CODE);
			response.setMessage(SUCCESS_MESSAGE);
			response.setDescription("password changed sucessfully");
		}
		else {
			response.setStatusCode(FAILD_STATUS_CODE);
			response.setMessage(FAILD_MESSAGE);
			response.setDescription("password can't change");
		}
		return response;
	}
	
	//delete User
	@GetMapping(path = "delete-user/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public StudentResponse deleteUser(@PathVariable int id) {
		boolean check=service.deleteUser(id);
		StudentResponse response=new StudentResponse();
		
		if(check) {
			response.setStatusCode(SUCCESS_STATUS_CODE);
			response.setMessage(SUCCESS_MESSAGE);
			response.setDescription("user deleted  sucessfully");
		}
		else {
			response.setStatusCode(FAILD_STATUS_CODE);
			response.setMessage(FAILD_MESSAGE);
			response.setDescription("user can't delete");
		}
		return response;
	}
	
	@GetMapping(path = "/search-books",produces = MediaType.APPLICATION_JSON_VALUE)
	public StudentResponse searchBook() {
		List<BookBean> bean=service.searchBook();
		StudentResponse response=new StudentResponse();
		if(bean!=null) {
			response.setStatusCode(SUCCESS_STATUS_CODE);
			response.setMessage(SUCCESS_MESSAGE);
			response.setDescription("sucessfull");
			response.setBookBeans(bean);

		}
		else {
			response.setStatusCode(FAILD_STATUS_CODE);
			response.setMessage(FAILD_MESSAGE);
			response.setDescription("no result found");

		}
           return response;
	}
	@GetMapping(path = "/make-book-request",produces = MediaType.APPLICATION_JSON_VALUE)
  public StudentResponse makeRequest(@RequestParam int sid,@RequestParam int bid) {
	  boolean check= service.makeRequest( bid,sid);
	  StudentResponse response=new StudentResponse();
	  if(check) {
		  response.setStatusCode(SUCCESS_STATUS_CODE);
			response.setMessage(SUCCESS_MESSAGE);
			response.setDescription("request make sucessfully");

	  }
	  else {
		  response.setStatusCode(FAILD_STATUS_CODE);
			response.setMessage(FAILD_MESSAGE);
			response.setDescription("your cart if full so you can't make request ");

	  }
	     return  response; 
  }
	@GetMapping(path = "/view-bag/{sid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public    StudentResponse viewBag(@PathVariable int sid){
	List<BookDetailsBean> bagBeans=	   service.viewBag(sid);
	StudentResponse response=new StudentResponse();
	if(!bagBeans.isEmpty()) {
		response.setStatusCode(SUCCESS_STATUS_CODE);
		response.setMessage(SUCCESS_MESSAGE);
		response.setDescription("sucessfully registered");
		response.setBookDetailsBeans(bagBeans);

	}
	else {
		response.setStatusCode(FAILD_STATUS_CODE);
		response.setMessage(FAILD_MESSAGE);
		response.setDescription("no data found");
		

	}
		
	return response;
		
	}
	@GetMapping(path = "/return-book/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public   StudentResponse returnBook(@PathVariable int id){
		 List<BookDetailsBean> bagBeans= service.returnBook(id);
		 StudentResponse response=new StudentResponse();
		 if(!bagBeans.isEmpty()) {
			 response.setStatusCode(SUCCESS_STATUS_CODE);
				response.setMessage(SUCCESS_MESSAGE);
				response.setDescription("sucessfully registered");
				response.setBookDetailsBeans(bagBeans);
		 }
		 else {
			 response.setStatusCode(FAILD_STATUS_CODE);
				response.setMessage(FAILD_MESSAGE);
				response.setDescription("no data found");
				
		 }
		return response;
	}
	
	
	//bookReport
	@GetMapping(path ="student-book-history/{sid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public StudentResponse bookReport(@PathVariable int sid){
		List<BookDetailsBean> beans=service.bookReport(sid);
		StudentResponse   response=new StudentResponse();
		if(!beans.isEmpty()) {
			response.setStatusCode(SUCCESS_STATUS_CODE);
			response.setMessage(SUCCESS_MESSAGE);
			response.setDescription("suceessfully got");
			response.setBookDetailsBeans(beans);
			
		}else {
			response.setStatusCode(FAILD_STATUS_CODE);
			response.setMessage(FAILD_MESSAGE);
			response.setDescription("no data found");
		}
		return response;
	}
	
}
