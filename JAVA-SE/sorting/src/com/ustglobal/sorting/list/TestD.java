package com.ustglobal.sorting.list;

import java.util.Stack;

public class TestD {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		s.add(12);
		s.push(23);
		s.push(45);
		
		
		
		System.out.println("using   get() ---------------");
		for(int i=0;i<s.size();i++)
			System.out.println(s.get(1));
		int j=s.size();
		System.out.println("using pop()   --------------------");
		for(int i=0;i<j;i++)//size of stack will decrease for each pop operation
			System.out.println(s.pop());
	}

}
