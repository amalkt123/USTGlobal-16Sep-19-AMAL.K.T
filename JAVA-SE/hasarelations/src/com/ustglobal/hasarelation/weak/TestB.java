package com.ustglobal.hasarelation.weak;

public class TestB {
	public static void main(String[] args) {
		Car c=new Car();
		System.out.println(c.name);
		System.out.println(c.brand);
		c.start();
		System.out.println(c.m.cname);
		c.m.play();
		c.m.pause();
		c.m.stop();
		c.stop();
	}

}
