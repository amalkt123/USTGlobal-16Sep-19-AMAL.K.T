package com.ustglobal.objectclass;

public class TestE {
	public static void main(String[] args) {
		Car c1=new Car(3000000, "bmw", "white");
		System.out.println(c1.hashCode());
		System.out.println(c1);
		
		Car c2=new Car(4000000,"audi","black");
		System.out.println(c2.hashCode());
		System.out.println(c2);
		
		Car c3=new Car(5000000,"benz","red");
		System.out.println(c3.hashCode());
		System.out.println(c3);
	}

}
