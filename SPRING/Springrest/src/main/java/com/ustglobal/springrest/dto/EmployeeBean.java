package com.ustglobal.springrest.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;


@Data
@Entity
@Table(name = "employee")
public class EmployeeBean {
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column
	private String password;
	@Column
	private String gender;
	@Column
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date doj;
	

}
