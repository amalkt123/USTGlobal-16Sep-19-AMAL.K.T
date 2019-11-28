package com.ustglobal.arrays;

public class TestA {
	public static void main(String[] args) {
		int[] nums=new int[5];
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		nums[3]=40;
		nums[4]=50;
		for(int i=0;i<nums.length;i++)
			System.out.println(nums[i]);
		System.out.println("*************************************************************************");
		for(int i:nums)
			System.out.println(i);
		
		char[] ch= {'a','b','c','d'};
		for(int i=0;i<ch.length;i++)
			System.out.println(ch[i]);
		System.out.println("**********************************************************");
		for(char c:ch)
			System.out.println(c);
		System.out.println("*****************************************");
		boolean[] b= {true,false};
		for(boolean b1:b)
			System.out.println(b);
		System.out.println("******************************************************");
		byte[] by= {1,2,3,4,5,6,12};
		for(int b1=0;b1<by.length;b1++)
			System.out.println(by[b1]);
		System.out.println("*******************************************");
		
		for(byte b2:by)
			System.out.println(b2);
		System.out.println("*********************************");
		double[] d= {10.0,10.2,14.5,87.44,55.3,65.5};
		for(int d1=0;d1<d.length;d1++)
			System.out.println(d[d1]);
		System.out.println("*******************************");
		for(double d2:d)
			System.out.println(d2);
		System.out.println("************************************************");
		
			String names[]= {"aishu","kavya","divya","priya"};
			for(int i=0;i<names.length;i++)
				System.out.println(names[i]);
			for(String name:names)
				System.out.println(name);
	}
}
