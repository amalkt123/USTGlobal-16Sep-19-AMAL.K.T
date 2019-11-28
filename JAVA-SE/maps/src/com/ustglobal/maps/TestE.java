package com.ustglobal.maps;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestE {
	public static void main(String[] args) {
		TreeMap<String,Integer> lh=new  TreeMap<String, Integer>();
		
		lh.put("bangalore",560068);
		lh.put("hariyana",134203);
		lh.put("patna",880000);
		lh.put("ram", null);
		//	lh.put(484, 5678); class cast exception only generic
		//lh.put(null, 5678);null pointer exception
		System.out.println(lh);
		Set<Entry<String, Integer>> e=lh.entrySet();
		for(Entry<String,Integer> e1:e) {
			String k=e1.getKey();
			Integer v=e1.getValue();
			System.out.println(k+" : "+v);
		}
		}

}
