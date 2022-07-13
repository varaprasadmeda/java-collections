package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTheString {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		List<String> synchronizedList = Collections.synchronizedList(list);
				
				
		list.add("India");
		list.add("Singapore");
		list.add("Afganisthan");
		list.add("Malashiya");
		list.add("USA");
		list.add("Nigeria");
		
		System.out.println("Before Sorting : "+ list);
		
		
		
		Collections.sort(list);
		System.out.println("After Sorting : "+ list);
		
		Collections.sort(list, new MyComparator());
		System.out.println("After Comparator Sorting : "+ list);
		Collections.shuffle(list);
		System.out.println("Suffle Sorting : "+ list);
		
	}
}
