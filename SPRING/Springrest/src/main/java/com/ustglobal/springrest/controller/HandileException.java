package com.ustglobal.springrest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.springrest.dto.EmployeeResponse;
@RestControllerAdvice
public class HandileException {
@ExceptionHandler(Exception.class)
	public EmployeeResponse getException() {
		EmployeeResponse employeeResponse=new EmployeeResponse();
		employeeResponse.setStatusCode(501);
		employeeResponse.setMessage("Error in code");
		employeeResponse.setDescription("Got an Exception");
		return employeeResponse;
	}

}
