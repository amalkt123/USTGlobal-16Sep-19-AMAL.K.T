package com.ustglobal.arrays;

public class TestB {
	public static void main(String[] args) {
		int[] nums= {10,20,30,40};
		//System.out.println(nums[10]);  Array IndexOutofBoundException
		receive(nums);
		int[] n=getArray();
		for(int n1:n)
			System.out.println(n);
		String s[]= {"arjun","lal","balan"};
		receiveStringArray(s);
		String[] s1=getStringArray();
		for(String s2:s1)
			System.out.println(s2);

	}
	static void receive(int[] numbers) {
		for(int i:numbers)
			System.out.println(i);

	}
	static int[] getArray() {
		int[] values= {20,30,40,50};
		return values;
	}

	static void receiveStringArray(String[] numbers) {
		for(String i:numbers)
			System.out.println(i);

	}
	static String[] getStringArray() {
		String[] values= {"ram","kumar","ravi"};
		return values;
	}

}
