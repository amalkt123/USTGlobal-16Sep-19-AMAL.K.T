package com.ustglobal.lms.dto;

import lombok.Data;

@Data
public class RegisterStudentBean {
	private String username;
	private String password;
	private String course;
	private String name;
	private long mob;
	private int batch;
	private String department;

	

}
