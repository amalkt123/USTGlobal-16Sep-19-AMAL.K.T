package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
public static void main(String[] args) {
	HashMap hm=new HashMap();
	hm.put("kuku", 998014);
	hm.put("mala", 678941);
	hm.put("sheela",787989);
	hm.put(null, 4567434);
	hm.put(null, 456734);
	
	
	System.out.println("data "+hm);
	
	Object k=hm.put("mala",897548);
	System.out.println("After modify "+hm);
	System.out.println(k);
	
    hm.put("dimple",897548);
    System.out.println("after dimple "+hm);
    
    System.out.println("after null "+hm);
    
    Object phoneno=hm.get("mala");
    System.out.println("value is "+phoneno);
    Object phonen=hm.get("malas");
    System.out.println("value is "+phonen);
    Object r=hm.remove("mala");
    System.out.println("remove value "+r);
    System.out.println("after removing "+hm);
    Object r1=hm.remove("mala");
    System.out.println("remove value "+r1);

    
}
}
