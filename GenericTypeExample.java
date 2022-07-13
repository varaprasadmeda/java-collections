package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class GenericTypeExample {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();  //Generic Type
		
		names.add("india");
		names.add("Pakisthan");
		names.add("Nigeria");
		names.add("Kenada");
		
		System.out.println(names);
		
		List<Integer> values = new ArrayList<Integer>();  //Generic Type
		values.add(10);
		values.add(20);		
		values.add(30);
		values.add(40);
		
		System.out.println(values);
		
		
		
		
	}

}
