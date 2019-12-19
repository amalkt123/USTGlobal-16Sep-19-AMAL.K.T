package com.ustglobal.lms.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name="book")
public class BookBean {
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column
	private String author;
	@Column
	private String subject;
	@Column
	private double price;
	@Column
	String status;
	@Column
	private String publication;
	@JsonIgnore
	@OneToMany(mappedBy ="bookBean")
	private List<BookDetailsBean> bookDetailsBeans;
	
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "sid")
//	private StudentBean studentBean;
	

}
