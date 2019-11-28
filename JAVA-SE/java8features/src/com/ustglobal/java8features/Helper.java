package com.ustglobal.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {
	void displayAllStudent(ArrayList<Student> al) {
		Iterator<Student> i=al.iterator();
		while (i.hasNext()) {
			Student student = (Student) i.next();
			System.out.println("id is "+student.id);
			System.out.println("name is "+student.name);
			System.out.println("percentage is "+student.percentage);
			System.out.println("==================================================");
		
			
		}
	}
	void displayFaildStudent(ArrayList<Student> al) {
		System.out.println("-----------------------failed student-----------------------------------");
	List<Student> l=	al.stream().filter(s->s.percentage<40).collect(Collectors.toList());
	Iterator<Student> i=l.iterator();
	while (i.hasNext()) {
		Student student = (Student) i.next();
		System.out.println("id is "+student.id);
		System.out.println("name is "+student.name);
		System.out.println("percentage is "+student.percentage);
		System.out.println("================================================");
	}
		
	}
	void displayPassedStudent(ArrayList<Student> al) {
		System.out.println("-----------------------Passed student-----------------------------------");
	List<Student> l=	al.stream().filter(s->s.percentage>=40).collect(Collectors.toList());
	Iterator<Student> i=l.iterator();
	while (i.hasNext()) {
		Student student = (Student) i.next();
		System.out.println("id is "+student.id);
		System.out.println("name is "+student.name);
		System.out.println("percentage is "+student.percentage);
		System.out.println("================================================");
		
	}
	}
	void displayTopStudent(ArrayList<Student> al) {
		System.out.println("-----------------------Top student-----------------------------------");
		Comparator<Student> cmp=(c1,c2)->{Double d1=c1.percentage;
		                                   Double d2=c2.percentage;
		                                   return d1.compareTo(d2);
		};
		Student s=al.stream().max(cmp).get();
		System.out.println("id is "+s.id);
		System.out.println("name is "+s.name);
		System.out.println("percentage is "+s.percentage);
		System.out.println("================================================");
		
	


	}
	void displayLastStudent(ArrayList<Student> al) 
	{
		
		System.out.println("-----------------------last student-----------------------------------");
		Comparator<Student> cmp=(c1,c2)->{Double d1=c1.percentage;
		                                   Double d2=c2.percentage;
		                                   return d1.compareTo(d2);
		};
		Student s=al.stream().min(cmp).get();
		System.out.println("id is "+s.id);
		System.out.println("name is "+s.name);
		System.out.println("percentage is "+s.percentage);
		System.out.println("================================================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
