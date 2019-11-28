package com.ustglobal.immutable;

public class MyString {
	private int rollno;
	private  String name;
	public MyString(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	
	public String getName() {
		return name;
	}
	
	public MyString changeContent(int rollno,String name) {
		return new MyString(rollno, name);
	}

}
