package com.ustglogal.array;

public class premitiveArray {
	public static void main(String[] args) {
		Object[] o= {1,12.0,'a',true};
		System.out.println("=================for loop==================");
		for(int i=0;i<o.length;i++) {
			System.out.println(o[i]);
		}
		System.out.println("===================for each====================");
		for(Object ob:o)
			System.out.println(ob);
	}

}
