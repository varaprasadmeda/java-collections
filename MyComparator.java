package com.java.collection;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		/*Integer obj1 = (Integer) o1;
		Integer obj2 = (Integer) o2;

		if (obj1 < obj2)
			return 100;
		else if (obj1 > obj2)
			return -100;
		else
			return 0;*/
		
	   String str1= (String)o1;
		String str2= (String)o2;
		
		return  - str1.compareTo(str2);
		

	}

}
