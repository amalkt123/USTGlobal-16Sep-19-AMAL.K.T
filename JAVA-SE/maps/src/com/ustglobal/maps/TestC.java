package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {
	public static void main(String[] args) {	
		
		LinkedHashMap<String, Integer> lh=new LinkedHashMap<String, Integer>();
		
		lh.put("bangalore",560068);
		lh.put("hariyana",134203);
		lh.put("patna",880000);
		System.out.println(lh);
		Set<String> s=lh.keySet();
		
		for(String s1:s) {
			System.out.println("keys "+s1);
		}
		
	
	Collection<Integer> c=lh.values();
	for(Integer i:c)
		System.out.println("values "+c);
	}
}
