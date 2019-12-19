package com.ustglobal.springrest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.springrest.dto.EmployeeBean;
import com.ustglobal.springrest.dto.EmployeeResponse;
import com.ustglobal.springrest.service.EmployeeService;

@RestController
public class EmployeewController {
	@Autowired
	private EmployeeService service;
	@PostMapping(path = "/add",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse addEmployee(@RequestBody EmployeeBean bean) {
		EmployeeResponse response=new EmployeeResponse();
		if(service.addEmployee(bean)) {
			response.setStatusCode(201);
			response.setMessage("Sucess");
			response.setDescription("Data added to the DB");
		}
		else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not added to the DB");
			
			
		}
		return response;
	}
	@PutMapping(path = "/modify",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse modifyEmployee(@RequestBody EmployeeBean bean) {
		EmployeeResponse response=new EmployeeResponse();
		if(service.modifyEmployee(bean)) {
			response.setStatusCode(201);
			response.setMessage("Sucess");
			response.setDescription("Data added to the DB");
		}
		else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not added to the DB");
			
			
		}
		return response;
	}
	
	@DeleteMapping(path = "/delete/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(@PathVariable("id") int id) {
		EmployeeResponse response=new EmployeeResponse();
		if(service.deleteEmployee(id)) {
			response.setStatusCode(201);
			response.setMessage("Sucess");
			response.setDescription("Data deleted from the DB");
		}
		else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not deleted the DB");
			
			
		}
		return response;
	}
	@GetMapping(path = "/get",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam("id") int id) {
		EmployeeResponse response=new EmployeeResponse();
		EmployeeBean bean=service.getEmployee(id);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("Sucess");
			response.setDescription("Data found in the DB");
			response.setEmploteeBeans(Arrays.asList(bean));
		}
		else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data  not found in the DB");
			
			
		}
		return response;
	}
	@GetMapping(path = "/get-all",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee(){
		List<EmployeeBean> employeeBeans= service.getAllEmployee();
		EmployeeResponse response=new EmployeeResponse();
		if(!employeeBeans.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Sucess");
			response.setDescription("Data found in the DB");
			response.setEmploteeBeans(employeeBeans);
		}
		else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data  not found in the DB");
			
			
	}
		return response;
	}
	
	
	//exception mapping
	
	@GetMapping(path = "/exece",produces =MediaType.APPLICATION_JSON_VALUE)
	public void getException() {
		int i=1/0;
		
	}
	

}
