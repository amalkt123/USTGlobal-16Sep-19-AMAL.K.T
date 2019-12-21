package com.ustglobal.finalproject.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class EmailResponse {
	private String message;
	private int statuscode;
	private String description;
	private List<UserBean> user;
	private List<EmailBean> email;
}
