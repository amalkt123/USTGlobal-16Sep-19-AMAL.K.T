package com.ustglobal.collectionframework.list;

public class Employee {
	int eid;
	String name;
	int deptno;
	public Employee(int eid, String name, int deptno) {
		super();
		this.eid = eid;
		this.name = name;
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", deptno=" + deptno + "]";
	}
	
	

}
