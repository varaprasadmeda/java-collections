package com.java.collection;

import java.util.TreeSet;

public class SortingString {

	public static void main(String[] args) {
		   TreeSet trSet = new TreeSet(new MyComparator());
		    //TreeSet trSet = new TreeSet();
		    trSet.add("A");
		    trSet.add("B");
		    trSet.add("C");
		    trSet.add("D");
		    trSet.add("E");
		    trSet.add("F");
		    System.out.println(trSet);

	}

}
