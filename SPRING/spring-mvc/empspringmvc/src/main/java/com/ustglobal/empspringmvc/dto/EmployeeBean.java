package com.ustglobal.empspringmvc.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="employee")
public class EmployeeBean {
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column(unique=true)
	private String email;
	@Column
	private String password;
	@Column
	private Date doj;
	@Column
	private String gender;
	

}
