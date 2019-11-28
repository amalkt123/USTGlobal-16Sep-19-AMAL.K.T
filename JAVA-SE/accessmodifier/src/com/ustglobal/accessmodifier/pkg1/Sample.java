package com.ustglobal.accessmodifier.pkg1;

import com.ustglobal.accessmodifier.pkg2.Demo;

public class Sample extends Demo {
	public static void main(String[] args) {
		 Demo d= new Demo();
		    //private
		  //  System.out.println(d.a); private variable cannot access out side the class
		   // d.add(); private method cannot access outside the class
		    
		    //default
		  //  System.out.println(d.b); not possible
		  //  d.sub(); not possible
		    
		    //protected
//		    System.out.println(d.c);
//		    d.mul();
		 Sample s=new Sample();//by using child class object name of sub class wecan access protected non statc members and satic members in another package 
		 System.out.println(s.c);
		 s.mul();
		    //public 
		    System.out.println(d.name);
		    d.div();
	}

}
