package com.ustglobal.rms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Entity
@Table(name="retailer")
public class RetailerBean {
	@Id
	@GeneratedValue
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String password;
	

}
