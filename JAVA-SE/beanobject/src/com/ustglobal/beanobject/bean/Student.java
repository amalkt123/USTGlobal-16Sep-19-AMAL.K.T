package com.ustglobal.beanobject.bean;

import java.io.Serializable;

public class Student implements Serializable
{
	
   private int id;
   private String name;
   private int rollno;
   public Student() {
	   return;
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
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
}
