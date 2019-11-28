package com.ustglobal.accessmodifier.pkg1;

public class ClassB extends ClassA{
	private void display() {
		System.out.println("classb method");
	}
	public static void main(String[] args) {
		ClassB b=new ClassB();
		b.display();
		//ClassA a=new ClassB();
	//	a.display(); upcasting we cannot access private members of paent class in sublclass
		
	}

}
