package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		List<String>  list = new ArrayList<String>();
		list.add("Core Java");
		list.add("Adv Java");
		list.add("JDBC");
		list.add("Servlets");
		
		System.out.println("Initial Collection :"+list);
		java.util.Collections.addAll(list, "Jsp","Spring");
		System.out.println("After adding Collection :"+list);
		
		String[]  arr = {"Chennai","Hyd"};
		java.util.Collections.addAll(list, arr);
		System.out.println("After adding array to the Collection :"+list);
		

	}

}
