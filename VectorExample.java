package com.java.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Vector vector = new Vector();		
		System.out.println(vector.capacity());
		//vector.add(10);
		//System.out.println(vector.capacity());
		for(int i = 0; i<10;i++) {
			vector.addElement(i);
		}
		
		System.out.println(vector);
		//System.out.println(vector.capacity());
		//vector.addElement("Sample");
		//System.out.println(vector.capacity());
		
		Enumeration list = vector.elements();
		
		while(list.hasMoreElements()) {
			Integer itr = (Integer)list.nextElement();
			if(itr%2 ==0)

				System.out.println(itr);
		}
		System.out.println(vector);

	}

}
