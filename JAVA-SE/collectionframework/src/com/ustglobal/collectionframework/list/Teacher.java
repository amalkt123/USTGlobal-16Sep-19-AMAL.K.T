package com.ustglobal.collectionframework.list;

public class Teacher {
	int id;
	String name;
	int deptno;
	String subject;

	public Teacher(int id, String name, int deptno, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.deptno = deptno;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", deptno=" + deptno + ", subject=" + subject + "]";
	}
	

}
