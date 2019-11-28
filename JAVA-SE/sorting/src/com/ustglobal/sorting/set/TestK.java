package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestK {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(12);
		pq.add(24);
		pq.add(35);
		pq.add(35);
		pq.offer(1);
		
		
		
		System.out.println("---------------------------using iterator---------------------------");
		
		System.out.println("before poll "+pq);
		Iterator<Integer> i=pq.iterator();
		while (i.hasNext()) {
			System.out.println(pq.poll());
			
		}
		System.out.println("after poll "+pq);
		
	}

}
