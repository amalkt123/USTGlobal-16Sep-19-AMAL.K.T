package com.ustglobal.springcore.di;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {
   public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Autowired
private Author author;
   private String name;
   private int price;

}
