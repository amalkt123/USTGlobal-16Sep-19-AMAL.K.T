package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


public class TestG {
	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		Employee e1=new Employee(1,"veeru");
		Employee e2=new Employee(4,"yuvi");
		Employee e3=new Employee(2,"dhoni");
		al.add(e1);
		al.add(e2);
		al.add(e3);
		Comparator<Employee> cmp=(c1,c2)->c1.name.compareTo(c2.name);
		
List<Employee> l=al.stream().sorted(cmp).collect(Collectors.toList());
Iterator<Employee> i=l.iterator();
System.out.println("after sorted----------------->");
while (i.hasNext()) {
	Employee employee = (Employee) i.next();
	System.out.println("id is "+employee.id);
	System.out.println("name is "+employee.name);
	
}
		
	}

}
