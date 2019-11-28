package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestJ {
	public static void main(String[] args) {
      ArrayList<Student> al=new ArrayList<Student>();
      Student s1=new Student("ankitha", 101, 45.44);
      Student s2=new Student("salman",123,56.88);
      Student s3=new Student("srk",456,78.99);
      al.add(s1);
      al.add(s2);
      al.add(s3);
      
      
      for (int i = 0; i < al.size(); i++) {
		
    	  Student s=al.get(i);
    	  System.out.println("id is "+s.id);
    	  System.out.println("name is "+s.name);
    	  System.out.println("percentage is "+s.percentage);
	}
      System.out.println("============== for each================");
      for (Student student : al) {
    	  System.out.println(student);
		
	}
      
     Iterator<Student> i=al.iterator();
     
      }

}
