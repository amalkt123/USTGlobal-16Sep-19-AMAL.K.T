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

import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.BookDetailsBean;
import com.ustglobal.lms.dto.LoginBean;
import com.ustglobal.lms.dto.StudentBean;
import com.ustglobal.lms.service.LibrarianService;
import com.ustglobal.response.LibrarianResponse;
@CrossOrigin(origins = "*",allowedHeaders = "*",allowCredentials = "true")
@RestController
public class LibrarianController {
	private final int SUCCESS_STATUS_CODE=200;
	private final int FAILD_STATUS_CODE=400;
	private final String SUCCESS_MESSAGE="sucess";
	private final String FAILD_MESSAGE="faild";
	@Autowired
	private LibrarianService service;
	
	@GetMapping(path ="view-student-request",produces = MediaType.APPLICATION_JSON_VALUE)
	public LibrarianResponse viewStudentRequest()
       {
		LibrarianResponse response=new LibrarianResponse();
  	 List<LoginBean>beans=  service.viewStudentRequest();
  	 if(!beans.isEmpty()) {
  		 response.setMessage(SUCCESS_MESSAGE);
  		 response.setStatusCode(SUCCESS_STATUS_CODE);
  		 response.setDescription("sucessfully change status");
  		 response.setLoginBeans(beans);
  	 }
  	 else {
  		 response.setStatusCode(FAILD_STATUS_CODE);
  		 response.setMessage(FAILD_MESSAGE);
  		 response.setDescription("faild");
  	 }
  	 return response;
    }

	
	
	
	@PostMapping(path = "student-approve",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
      public LibrarianResponse approveStudent(@RequestBody LoginBean loginBean) {
		LibrarianResponse response=new LibrarianResponse();
    	 List<LoginBean> beans=  service.approveStudent(loginBean);
    	 if(!beans.isEmpty()) {
    		 response.setMessage(SUCCESS_MESSAGE);
    		 response.setStatusCode(SUCCESS_STATUS_CODE);
    		 response.setDescription("sucessfully change status");
    		 response.setLoginBeans(beans);
    	 }
    	 else {
    		 response.setStatusCode(FAILD_STATUS_CODE);
    		 response.setMessage(FAILD_MESSAGE);
    		 response.setDescription("faild");
    	 }
    	 return response;
      }
	@PostMapping(path = "/add-book",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public LibrarianResponse addBook(@RequestBody BookBean bean) {
		LibrarianResponse response=new LibrarianResponse();
		boolean check=service.addBook(bean);
		if(check) {
			response.setStatusCode(SUCCESS_STATUS_CODE);
			response.setMessage(SUCCESS_MESSAGE);
			response.setDescription("sucessfully added");
			
		}
		else {
			response.setStatusCode(FAILD_STATUS_CODE);
			response.setMessage(FAILD_MESSAGE);
			response.setDescription("can't added");
		}
		return response;
	}
	@PostMapping(path = "/upate-book",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public LibrarianResponse updateBook(@RequestBody BookBean bean) {
		LibrarianResponse response=new LibrarianResponse();
		boolean check=service.updateBook(bean);
		if(check) {
			response.setStatusCode(SUCCESS_STATUS_CODE);
			response.setMessage(SUCCESS_MESSAGE);
			response.setDescription("sucessfully updated");
			
		}
		else {
			response.setStatusCode(FAILD_STATUS_CODE);
			response.setMessage(FAILD_MESSAGE);
			response.setDescription("can't updated");
		}
		return response;
	}
	
	//issue-book
	@GetMapping(path = "/issue-book/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public LibrarianResponse issueBook(@PathVariable int id){
		List<BookDetailsBean> detailsBeans=service.approveBook(id);
		LibrarianResponse response=new LibrarianResponse();
		if(detailsBeans!=null) {
			response.setStatusCode(SUCCESS_STATUS_CODE);
			response.setMessage(SUCCESS_MESSAGE);
			response.setDescription("sucessfully updated");
			response.setBookDetailsBeans(detailsBeans);
			
		}
		else {
			response.setStatusCode(FAILD_STATUS_CODE);
			response.setMessage(FAILD_MESSAGE);
			response.setDescription("can't updated");
		}
		return response;

	}
	
	//delete book
	@GetMapping(path = "delete-book/{bid}",produces = MediaType.APPLICATION_JSON_VALUE)
    public LibrarianResponse deleteBook(@PathVariable int bid) {
		List<BookBean> beans=service.deleteBook(bid);
		LibrarianResponse response=new LibrarianResponse();
		if(!beans.isEmpty()) {
			response.setStatusCode(SUCCESS_STATUS_CODE);
			response.setMessage(SUCCESS_MESSAGE);
			response.setDescription("sucessfully deleted");
			
		}
		else {
			response.setStatusCode(FAILD_STATUS_CODE);
			response.setMessage(FAILD_MESSAGE);
			response.setDescription("can't delete");
		}
		return response;
		
	}
	
	@GetMapping(path = "view-book-request",produces = MediaType.APPLICATION_JSON_VALUE)
	public LibrarianResponse viewRequestBag()
       {
		LibrarianResponse response=new LibrarianResponse();
  	 List<BookDetailsBean>beans=  service.viewRequestBag();
  	 if(!beans.isEmpty()) {
  		 response.setMessage(SUCCESS_MESSAGE);
  		 response.setStatusCode(SUCCESS_STATUS_CODE);
  		 response.setDescription("sucessfully change status");
  		 response.setBookDetailsBeans(beans);
  	 }
  	 else {
  		 response.setStatusCode(FAILD_STATUS_CODE);
  		 response.setMessage(FAILD_MESSAGE);
  		 response.setDescription("faild");
  	 }
  	 return response;
    }
 //delete student
	 public  LibrarianResponse deleteStudent(int sid) {
		LibrarianResponse response=new LibrarianResponse();
	
		List<LoginBean> loginBeans=service.deleteStudent(sid);
		if(loginBeans!=null) {
		response.setLoginBeans(loginBeans);
		response.setStatusCode(SUCCESS_STATUS_CODE);
		response.setMessage(SUCCESS_MESSAGE);
		response.setDescription("successfully deleted");
		}
		else {
		
		response.setStatusCode(FAILD_STATUS_CODE);
		response.setMessage(FAILD_MESSAGE);
		response.setDescription("can't delete");
		}
		
		return response;
	}
	
	 //trackBook
	 @GetMapping(path ="track-book",produces = MediaType.APPLICATION_JSON_VALUE)
	 public LibrarianResponse trackBook() {
		 LibrarianResponse response=new LibrarianResponse();
		 List<BookDetailsBean> bookBeans=service.trackBook();
		 if(bookBeans!=null) {
		
				response.setStatusCode(SUCCESS_STATUS_CODE);
				response.setMessage(SUCCESS_MESSAGE);
				response.setDescription("successfully get");
				response.setBookDetailsBeans(bookBeans);
				}
				else {
				
				response.setStatusCode(FAILD_STATUS_CODE);
				response.setMessage(FAILD_MESSAGE);
				response.setDescription("can't get");
				}
				
				return response;

		 
	 }
	 
	
	
	
	
	

}
