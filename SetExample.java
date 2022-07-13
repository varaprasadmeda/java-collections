package com.java.collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		// List : To represent group of elemnets with signle variable

		Set list = new HashSet();
		list.add("India");
		list.add("AAAA");
		list.add(10);
		list.add(20);
		list.add(10.0f);
		list.add('A');
		list.add(true);
		list.add("Country");
		list.add("Country");
		list.add('A');
		list.add(null);
		list.add(null);
		
		// list.

		System.out.println(list);
	}

}
