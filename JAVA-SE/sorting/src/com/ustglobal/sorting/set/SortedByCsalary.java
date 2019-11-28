package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortedByCsalary implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
	   Double i=o1.salary;
	   Double j=o2.salary;
		return i.compareTo(j);
	}

}
