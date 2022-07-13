package com.java.collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		Vector v = new Vector();
		for (int i = 0; i <= 10; i++) {
			v.addElement(i);
		}

		System.out.println(v);
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			Integer itr = (Integer) e.nextElement();
			if (itr % 2 == 0) {
				System.out.println(itr);
			}
		}
		System.out.println(v);

	}

}
