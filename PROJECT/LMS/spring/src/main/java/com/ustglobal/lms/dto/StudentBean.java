package com.ustglobal.lms.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.omg.CORBA.PRIVATE_MEMBER;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;
@Data
@Entity
@Table(name="student")
public class StudentBean {
	@Id
	@Column
	@GeneratedValue
	private int sid;
	@Column
	private String name;
	@Column
	private String course;
	@Column 
	private String department;
	@Column
	private int batch;
	@Column
	private long mob;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id")
	@lombok.ToString.Exclude
	@JsonIgnore
	private LoginBean loginBean;
	@JsonIgnore
	@OneToMany(mappedBy ="studentBean")
	private List<BookDetailsBean> bookDetailsBeans;
	

}
