package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {
	public static void main(String[] args) {
		Student s1=new Student(2,"divya",67.69);
		Student s2=new Student(5,"ambika",56.67);
		Student s3=new Student(34,"kiran",45.7);
		Student s4=new Student(34,"dinesh",78.9);
		Student s5=new Student(1,"chinnu",35.64);
		Student s6=new Student(8,"giri",67.8);
		Student s7=new Student(4,"sonu",45.78);
		Student s8=new Student(7,"sweety",89.9);
		Student s9=new Student(45,"dimple",33.2);
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		
		
		ArrayList<Student> al1=new ArrayList<Student>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		
		ArrayList<Student> al2=new ArrayList<Student>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		
		
		
		HashMap<String,ArrayList<Student>> hm=new HashMap<String, ArrayList<Student>>();
		hm.put("first", al);
		hm.put("second",al2);
		hm.put("third", al2);
		
		ArrayList<Student> second=hm.get("second");
		
		Iterator<Student> i=second.iterator();
		while (i.hasNext()) {
			Student student = (Student) i.next();
			System.out.println("name is "+student.name);
			System.out.println("id is "+student.id);
			System.out.println("percentage is "+student.percentage);
			System.out.println("=======================================");
			
		}
		
	}
}