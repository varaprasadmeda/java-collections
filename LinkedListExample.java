package com.java.collection;

import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		LinkedList llist = new LinkedList();
		System.out.println(llist.size());
		
		llist.add(10);
		System.out.println(llist);
		llist.add(0,20);
		System.out.println(llist);
		
	}

}
