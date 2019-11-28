package com.ustglobal.maps;

import java.util.Hashtable;

public class TestH {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		ht.put(101,"ajay");
		ht.put(102,"vijay");
		ht.put(100,"sonu");
		ht.put(99,"monu");
		ht.put(101,"sriram");
		ht.put(501,"sriram");
		ht.put(-501,"sriram");
		
		//ht.put(101,null); null pointer exception
	//	ht.put(null,"sriram"); null pointer exception
		System.out.println("data "+ht);
		
	
	}

}
