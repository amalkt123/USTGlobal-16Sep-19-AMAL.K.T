package com.ustglobal.jpawithhibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * @Entity-----javax.persistance.Entity-----public @interface Entity----> to make a class as entity 
 * @Table------javax.persistance.Table------public @interface Table-----> to map a class in to table
 * @Column-----javax.persistance.Column-----public @interface Column----> to map data members as coloum
 * @Id---------javax.persistance.Id---------public @interface Id--------> to map a data member as primary key
 */

@Entity
@Table(name = "product")  //if class name is same as table name then no need to specify name="---"
public class Product {
	
	@Column(name = "pid")   //if class member name same as column name in table no need to specify name="____" 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "pname")
	private String name;
	@Column(name = "quantity")
	private int quantity;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


}
