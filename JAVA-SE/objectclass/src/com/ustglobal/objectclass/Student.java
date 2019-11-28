package com.ustglobal.objectclass;

public class Student {
	int id;
	String name;
	double percentage;
	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	@Override
	public int hashCode() {
	
		return this.id;
	}
	@Override
	public String toString() {
		return "name is "+this.name+" id is "+this.id+" percentage is "+this.percentage;
	}

}
