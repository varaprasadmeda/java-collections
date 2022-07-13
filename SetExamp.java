package com.java.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetExamp {

	public static void main(String[] args) {
		
		//HashSet  set = new HashSet();
		LinkedHashSet set = new LinkedHashSet();
		
		
		
		set.add(100);
		set.add("Nation");
		set.add('A');
		set.add(true);
		set.add(100.0f);
		set.add("Nation");
		set.add(null);
		System.out.println(set.add(null));
		System.out.println(set.hashCode());
		
		System.out.println(set);
		System.out.println(set.size());
		
		set.forEach(e -> System.out.println(e));
		
		
		
		//Integer inte = new Integer(10);
		set.add(10);   //set.add(new Integer(10));

	}

}
