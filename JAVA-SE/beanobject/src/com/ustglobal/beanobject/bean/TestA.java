package com.ustglobal.beanobject.bean;


public class TestA {
	public static void main(String[] args) {
		Student s=new Student();
		s.setId(10);
		s.setName("ram");
		s.setRollno(134);
		DataBase db=new DataBase();
		db.receive(s);
		
		Employee e =new Employee();
		e.setId(101);
		e.setDept(10);
		e.setName("kumar");
		e.setDesignation("manager");
		e.setSalary(500000);
		
		db.save(e);
	}

}
