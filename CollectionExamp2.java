package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExamp2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(48);
		list.add(75);
		list.add(90);
		list.add(35);
		list.add(56);
		list.add(24);
		
		System.out.println("Value of Maximum Element : "+Collections.max(list));
		System.out.println("Value of Maximum Element : "+Collections.min(list));
		//System.out.println("Value of Maximum Element : "+Collections.reverse(list););
		Collections.reverse(list);
		System.out.println("After Reverse element : "+list);
		Collections.sort(list);
		System.out.println("After Reverse element : "+list);
		Collections.sort(list, new MyComparator());
		System.out.println("After Reverse element : "+list);
		
	}

}
