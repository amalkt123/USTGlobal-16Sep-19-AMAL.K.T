package com.ustglobal.java8features;

import java.util.ArrayList;
import java.util.Comparator;

public class TestG {
public static void main(String[] args) {
ArrayList<Student> al=new ArrayList<Student>();
al.add(new Student(5,"vikram",56.7));
al.add(new Student(3,"vijay",67.8));
al.add(new Student(6,"yash",35.7));
al.add(new Student(2,"akshy",65.8));
al.add(new Student(1,"aishu",90.99));

Helper h=new Helper();
h.displayAllStudent(al);
h.displayFaildStudent(al);
h.displayPassedStudent(al);
h.displayTopStudent(al);
h.displayLastStudent(al);
Comparator<Student> cmp=(c1,c2)->c1.name.compareToIgnoreCase(c2.name);





}
}
