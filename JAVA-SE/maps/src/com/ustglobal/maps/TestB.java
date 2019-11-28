package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
public static void main(String[] args) {
	HashMap hm=new HashMap();
	hm.put("kuku", 998014);
	hm.put("mala", 678941);
	hm.put("sheela",787989);
	HashMap hm1=new HashMap();
	hm1.put("deepu", 789099);
	hm1.put("riya",678909);
	hm1.put("kriti",467787);
    boolean hashkey=hm.containsKey("mala");
    System.out.println("mala kei is "+hashkey);
    boolean hasvalue=hm.containsValue(998014);
    System.out.println("has value is "+hasvalue);
    hm.putAll(hm1);
    System.out.println("========================================================");
    System.out.println("After put all"+hm);
    System.out.println("size "+hm.size());
    System.out.println("map empty "+hm.isEmpty());
    
    hm.clear();
    System.out.println("after clear "+hm);
	
}
}
