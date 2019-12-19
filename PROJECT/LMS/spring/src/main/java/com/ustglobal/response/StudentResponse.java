package com.ustglobal.response;

import java.util.List;

import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.BookDetailsBean;

import lombok.Data;

@Data

public class StudentResponse {
	private int statusCode;
	private String message;
	private String description;
	private BookBean bookBean;
	private List<BookDetailsBean> bookDetailsBeans;
	private List<BookBean> bookBeans;

}
