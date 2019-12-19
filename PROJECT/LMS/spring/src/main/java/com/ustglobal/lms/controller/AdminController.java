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
import com.ustglobal.lms.dto.LibrarianBean;
import com.ustglobal.lms.dto.RegisterLibrarianBean;
import com.ustglobal.lms.dto.StudentBean;
import com.ustglobal.lms.service.AdminService;
import com.ustglobal.response.AdminResponse;
@CrossOrigin(origins = "*",allowedHeaders = "*",allowCredentials = "true")
@RestController
public class AdminController {
	@Autowired
	AdminService service;
	@PostMapping(path = "/librarian-register",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public AdminResponse registerLibrarian(@RequestBody RegisterLibrarianBean bean){
		boolean check= service.addLibrarian(bean);
		AdminResponse response=new AdminResponse();
		if(check) {
			response.setStatusCode(200);
			response.setMessage("sucess");
			response.setDescription("registered sucessfully");
			
		}
		else {
			response.setStatusCode(400);
			response.setMessage("failed");
			response.setDescription("can't register");
		}
		return response;
	}
	@GetMapping(path = "/view-students",produces = MediaType.APPLICATION_JSON_VALUE)
	public AdminResponse viewStudents() {
		List<StudentBean> beans= service.viewStudents();
		AdminResponse response=new AdminResponse();
		if(beans.size()>0) {
			response.setStatusCode(200);
			response.setMessage("sucess");
			response.setDescription("student details");
			response.setStudentBeans(beans);
		}else {
			response.setStatusCode(400);
			response.setMessage("faild");
			response.setDescription("no data found");
		}
		return response;
	}
	
	@GetMapping(path ="/view-librarians",produces = MediaType.APPLICATION_JSON_VALUE)
	public AdminResponse viewLibrarians() {
		List<LibrarianBean> beans= service.viewLibrarians();
		AdminResponse response=new AdminResponse();
		if(!beans.isEmpty()) {
			response.setStatusCode(200);
			response.setMessage("sucess");
			response.setDescription("librarian details");
			response.setLibrarianBeans(beans);
		}else {
			response.setStatusCode(400);
			response.setMessage("faild");
			response.setDescription("no data found");
		}
		return response;
	}
	@GetMapping(path = "/view-books",produces = MediaType.APPLICATION_JSON_VALUE)
	public AdminResponse viewBooks() {
		List<BookBean> beans= service.viewBooks();
		AdminResponse response=new AdminResponse();
		if(!beans.isEmpty()) {
			response.setStatusCode(200);
			response.setMessage("sucess");
			response.setDescription("book details");
			response.setBookBeans(beans);
		}else {
			response.setStatusCode(400);
			response.setMessage("faild");
			response.setDescription("no data found");
		}
		return response;
	}
	@GetMapping(path = "/delete-librarian/{lid}",produces = MediaType.APPLICATION_JSON_VALUE)
	 public AdminResponse removeLibararian(@PathVariable int lid) {
		boolean check=service.removeLibararian(lid);
		AdminResponse  adminResponse=new AdminResponse();
		if(check) {
			adminResponse.setStatusCode(200);
			adminResponse.setMessage("sucess");
			adminResponse.setDescription("removed sucessfully");
		}else {
			adminResponse.setStatusCode(400);
			adminResponse.setMessage("faild");
			adminResponse.setDescription("can't remove");
		}
		return adminResponse;
		 
	 }
	@GetMapping(path = "/student-remove",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	 public AdminResponse removeStudent(@RequestParam int sid) {
		 boolean check=service.removeStudent(sid);
			AdminResponse  adminResponse=new AdminResponse();
			if(check) {
				adminResponse.setStatusCode(200);
				adminResponse.setMessage("sucess");
				adminResponse.setDescription("removed sucessfully");
			}else {
				adminResponse.setStatusCode(400);
				adminResponse.setMessage("faild");
				adminResponse.setDescription("can't remove");
			}
			return adminResponse;
		 
	 }
	@GetMapping(path = "/librarian-search",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	 public AdminResponse searchLibrarian(@RequestParam int lid) {
		LibrarianBean bean=service.searchLibrarian(lid);
		AdminResponse response=new AdminResponse();
		if(bean!=null) {
			response.setStatusCode(200);
			response.setMessage("sucess");
			response.setDescription("got librarian");
			response.setLibrarianBean(bean);
		}
		else {
			response.setStatusCode(400);
			response.setMessage("faild");
			response.setDescription("no record found");
		}
		return response;
		 
	 }
	@GetMapping(path = "/student-search",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	 public AdminResponse searchStudent(@RequestParam int sid) {
		AdminResponse response=new AdminResponse();
		StudentBean bean=service.searchStudent(sid);
		if(bean!=null) {
			response.setStatusCode(200);
			response.setMessage("sucess");
			response.setDescription("got librarian");
			response.setStudentBean(bean);
		}
		else {
			response.setStatusCode(400);
			response.setMessage("faild");
			response.setDescription("no record found");
		}
           return response;
		 
	 }
	

}
