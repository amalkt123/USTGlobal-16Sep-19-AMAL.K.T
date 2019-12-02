package com.ustglobal.rms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;
@Data
@Entity
@Table(name="product")
public class ProductBean {
	@Id
	@GeneratedValue
	@Column
	private int pid;
	@Column
	private String pname;
	@Column
	private int pqty;
	@Column
	private double price;
	

}
