package com.ustglobal.rms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="order")
public class OrderBean {
	@Id
	@Column
	@GeneratedValue
  private int orderid;
	@Column
  private String pname;
	@Column
  private double priceUnit;
	@Column
  private int qty;
	@Column
  private double amount;
	@Column
  private int retailId;
  
  
  
  

}
