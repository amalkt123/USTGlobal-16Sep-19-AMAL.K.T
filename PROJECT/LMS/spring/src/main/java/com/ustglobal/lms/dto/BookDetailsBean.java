package com.ustglobal.lms.dto;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString.Exclude;
@Data
@Entity
@Table(name = "book_details")
public class BookDetailsBean {
	@Id
	@GeneratedValue
	@Column
	private int bdid;
	@Column
	@JsonFormat
	private Date requestDate;
	@Column
	@JsonFormat
	private Date issueDate;
	@Column
	@JsonFormat
	private Date returnDate;
	@Column
	private String status;
	@Exclude
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bid")
	private BookBean bookBean;
	@Exclude
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="sid")
	private StudentBean studentBean;

}
