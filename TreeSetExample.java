package com.java.collection;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
    TreeSet trSet = new TreeSet(new MyComparator());
    //TreeSet trSet = new TreeSet();
    trSet.add(10);
    trSet.add(15);
    trSet.add(20);
    trSet.add(30);
    trSet.add(40);
    trSet.add(50);
    System.out.println(trSet);
    

	}

}


