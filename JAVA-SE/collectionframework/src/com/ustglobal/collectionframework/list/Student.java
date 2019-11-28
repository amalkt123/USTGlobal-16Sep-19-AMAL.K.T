package com.ustglobal.collectionframework.list;

public class Student {
String name;
int id;
double percentage;
public Student(String name, int id, double percentage) {
	super();
	this.name = name;
	this.id = id;
	this.percentage = percentage;
}
@Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + ", percentage=" + percentage + "]";
}

}
