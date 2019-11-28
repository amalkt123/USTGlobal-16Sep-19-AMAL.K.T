package com.ustglibal.jpawithhibernate.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table
public class Pencil {
	@Id
	@Column
	private int pid;
	@Column
	private String color;
	@Exclude
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bid")
	private PencilBox box;

}
