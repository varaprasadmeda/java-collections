package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DisplayValaues {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(10);
		list.add("Apple");
		list.add(20);			
		list.add("Mango");
		list.add(300);
		list.add("Guva");
		list.add(300);
		list.add("Orange");
		list.add("Water melon");
		list.add('A');
		list.add('M');
		list.add('Z');
		list.add('Q');
		list.add(9.40f);
		list.add(10.90f);
		list.add(12.5f);
		list.add(11.5f);
		list.add(true);
		list.add(false);
		
		List<Integer> intList = new ArrayList<Integer>();
		List<String> strList = new ArrayList<String>();
		List<Boolean> booleanList = new ArrayList<Boolean>();
		List<Character> charList = new ArrayList<Character>();
		List<Float> floatList = new ArrayList<Float>();

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Object object = (Object) itr.next();
			if (object instanceof Integer) {
				intList.add((Integer) object);
			} else if (object instanceof String) {
				strList.add((String) object);
			}else if (object instanceof Boolean) {
				booleanList.add((Boolean) object);
			}else if (object instanceof Character) {
				charList.add((Character)object);
			}else if (object instanceof Float) {
				floatList.add((Float)object);
			}

		}

		System.out.println("Integer List : " + intList);
		System.out.println("String List : " + strList);
		System.out.println("Boolean List : " + booleanList);
		System.out.println("Char List : " + charList);
		System.out.println("Float List : " + floatList);

	}

}
