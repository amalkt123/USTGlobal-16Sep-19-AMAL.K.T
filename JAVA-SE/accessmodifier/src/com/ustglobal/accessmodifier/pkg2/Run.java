package com.ustglobal.accessmodifier.pkg2;

public class Run {
 public static void main(String[] args) {
	

    Demo d= new Demo();
    //private
  //  System.out.println(d.a); private variable cannot access out side the class
   // d.add(); private method cannot access outside the class
    
    //default
    System.out.println(d.b);
    d.sub();
    
    //protected
    System.out.println(d.c);
    d.mul();
    //public 
    System.out.println(d.name);
    d.div();
}
 
}
