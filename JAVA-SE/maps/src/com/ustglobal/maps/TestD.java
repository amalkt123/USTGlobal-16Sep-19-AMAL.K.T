package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {
public static void main(String[] args) {
	LinkedHashMap<String, Integer> lh=new LinkedHashMap<String, Integer>();
	
	lh.put("bangalore",560068);
	lh.put("hariyana",134203);
	lh.put("patna",880000);
	System.out.println(lh);
	for(Map.Entry<String, Integer> m:lh.entrySet())
	{
		String k=m.getKey();
		Integer v=m.getValue();
		System.out.println(k+" : "+v);
		System.out.println("===================================================");
	}
}
}
