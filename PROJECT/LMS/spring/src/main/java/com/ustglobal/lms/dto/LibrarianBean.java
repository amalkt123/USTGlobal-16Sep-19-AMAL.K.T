package com.ustglobal.lms.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;
@Data
@Entity
@Table(name = "librarian")
public class LibrarianBean {
	@Id
	@Column
	@GeneratedValue
	private int lid;
	@Column
	private String name;
	@Column
	private long mob;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	@lombok.ToString.Exclude
	@JsonIgnore
	private LoginBean bean;

}
