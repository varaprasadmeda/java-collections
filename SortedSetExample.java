package com.java.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
		SortedSet<String> sortedSet = new TreeSet<String>();
		//sortedSet.add("India");
		//sortedSet.add("Australia");
		//sortedSet.add("South Africa");
		sortedSet.add("A");
		sortedSet.add("N");
		sortedSet.add("C");
		sortedSet.add("F");
		System.out.println(sortedSet);
		
		//sortedSet.forEach(e -> System.out.println(e));
		

	}

}
