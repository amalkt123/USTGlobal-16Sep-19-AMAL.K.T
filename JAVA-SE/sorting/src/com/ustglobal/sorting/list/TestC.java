package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class TestC {
	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(12);
		l.add(23);
		l.add(34);
		l.add(25);
		
		
		
		Integer peekElement=l.peek();
		System.out.println("peek element "+peekElement);
		Integer peekFirstElement=l.peekFirst();
		System.out.println("peek first element "+peekFirstElement);
		Integer peekLastElement=l.peekLast();
		System.out.println("peek last element "+peekLastElement);
		
	
	System.out.println("after peek=----------------------------->");

	System.out.println("===========================================");
	Integer pollElement=l.poll();
	System.out.println("poll element "+pollElement);
	Integer pollFirstelement=l.pollFirst();
	System.out.println("poll first element "+pollFirstelement);
	Integer pollLastElement =l.pollLast();
	System.out.println("poll last element "+pollLastElement);
	System.out.println("after poll----------------------->");
	
	
	l.push(12);
	System.out.println("after push-------------->"+l);
	Integer p=l.pop();
	System.out.println(p);
	System.out.println("after pop----------->"+l);
	
	
	}

}
