package com.java.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		llist.add("India");
		llist.add("USA");
		llist.add("London");
		llist.add("Singapore");

		System.out.println(llist);

		ListIterator litr = llist.listIterator();
		while (litr.hasNext()) {
			String str = (String) litr.next();
			// remove
			if (str.equals("USA")) {
				litr.remove();
			}

			// set
			if (str.equals("London")) {
				litr.set("Malasiya");
			}

			// add
			if (str.equals("India")) {
				litr.add("Nigeria");
			}

		}
		System.out.println(llist);
	}

}
