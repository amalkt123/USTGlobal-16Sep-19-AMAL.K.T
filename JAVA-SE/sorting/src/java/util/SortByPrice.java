package java.util;

import com.ustglobal.sorting.list.Marker;

public class SortByPrice implements Comparator<Marker>{

	@Override
	public int compare(Marker o1, Marker o2) {
		if(o1.price>o2.price)
			return 1;
		else if(o1.price<o2.price)
			return -1;
		return 0;
	}

}
