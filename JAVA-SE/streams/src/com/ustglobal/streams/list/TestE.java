package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class TestE {
public static void main(String[] args) {
	ArrayList<Integer> mark=new ArrayList<Integer>();
	mark.add(70);
	mark.add(25);
	mark.add(35);
	mark.add(90);
	mark.add(45);
	Comparator<Integer> cmap=(m1,m2)->{
		if(m1>m2)
			return 1;
			else if(m1<m2)
				return -1;
		return 0;
	};
	
	long faildstudent =mark.stream().filter(i->i<40).count();
	System.out.println(faildstudent);
	
	
	System.out.println("==========================================");

     Integer i=mark.stream().min(cmap).get();
     System.out.println("min mark "+i);
     System.out.println("================================================");
     
     Integer j=mark.stream().max(cmap).get();
     System.out.println("max mark is "+j);
}
}
