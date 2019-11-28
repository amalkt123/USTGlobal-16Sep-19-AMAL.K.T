package com.ustglobal.sorting.list;

public class Student implements Comparable<Student>{
	int id;
	String name;
	double percentage;
	
	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
//	@Override
//	public int compareTo(Student o) {
//	if(this.id>o.id)
//		return 12;//any positive value
//	else if(this.id<o.id)
//		return -10;//any negative value
	//          or
//	Integer i=this.id;
//	Integer j=o.id;
//	return i.compareTo(j);
//		return 0;
//	}
//
//	@Override
//	public int compareTo(Student o) {
//		if(this.percentage>o.percentage)
//			return 1;
//		else if(this.percentage<o.percentage)
//			return -1;
//		
//		return 0;
//	}
//	@Override
//	public int compareTo(Student o) {
//		String name=this.name.toLowerCase();
//		String anname=o.name.toLowerCase();
//	
//		
//		
//		return this.name.compareTo(o.name);
//	}
	
	@Override
	public int compareTo(Student o) {
		String name=this.name.toLowerCase();
		String anname=o.name.toLowerCase();
	
		
		
		return name.compareTo(anname);
		//return name.compareToIgnoreCase(anname);
	}


}
