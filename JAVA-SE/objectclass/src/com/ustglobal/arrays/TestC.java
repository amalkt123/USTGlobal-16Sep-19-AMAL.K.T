package com.ustglobal.arrays;

public class TestC {
public static void main(String[] args) {
	Student s1=new Student(1, "arya", 78.99);
	Student s2=new Student(2, "nithin", 67.88);
	Student s3=new Student(3, "chinku", 45.66);
	
	Student[] student=new Student[3];
	student[0]=s1;
	student[1]=s2;
	student[2]=s3;
	for(Student s:student)
		System.out.println(s);
	receive(student);
	
}
static void receive(Student[] stud) {
	for(Student student:stud)
		System.out.println(student);
}
}
