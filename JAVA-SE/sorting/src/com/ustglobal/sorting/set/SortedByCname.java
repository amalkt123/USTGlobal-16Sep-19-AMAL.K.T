package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortedByCname implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.name.compareToIgnoreCase(o2.name);
	}

}
