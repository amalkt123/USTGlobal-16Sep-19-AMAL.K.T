package com.ustglobal.maps;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestG {
public static void main(String[] args) {
	Employee e1=new Employee(101, "kumar", 500000);
	Employee e2=new Employee(102,"kaveri",600000);
	Employee e3=new Employee(103,"praveen",70000);
	Employee e4=new Employee(104,"kamala",40000);
	Employee e5=new Employee(105,"rahul",80000);
	Employee e6=new Employee(106,"kiran",45000);
	Employee e7=new Employee(101, "krishna",76500);
	Employee e8=new Employee(101, "kumaran",30000);
	Employee e9=new Employee(101, "janaki",45000);
	ArrayList<Employee> al=new ArrayList<Employee>();
			al.add(e1);
	al.add(e2);
	al.add(e3);
	ArrayList<Employee> al1=new ArrayList<Employee>();
	al1.add(e4);
	al1.add(e5);
	al.add(e6);
	ArrayList<Employee> al2=new ArrayList<Employee>();
	al2.add(e7);
	al2.add(e8);
	al2.add(e9);
	
	
	HashMap<String, ArrayList<Employee>> hm=new HashMap<String, ArrayList<Employee>>();
	
      hm.put("manager1",al);
      hm.put("manager2",al1);
      hm.put("manager3",al2);
      
      Set<Map.Entry<String,ArrayList<Employee>>> m=hm.entrySet();
      for(Map.Entry<String, ArrayList<Employee>> j:m) {
    	  String k=j.getKey();
    	  System.out.print(k+" : [  ");
    	  ArrayList<Employee> ae=j.getValue();
    	  Iterator<Employee> e=ae.iterator();
    	  while (e.hasNext()) {
			Employee employee = (Employee) e.next();
			System.out.print("   [   ");
			System.out.print("name is : "+employee.name);
			System.out.print("id is : "+employee.id);
			System.out.print("salary is : "+employee.salary);
			System.out.print(" ]  ");
		}
    	  System.out.println("     ]   ");
    	  
    	  

   



}
	}
}
