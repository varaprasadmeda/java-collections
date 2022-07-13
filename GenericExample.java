package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericExample {
	
	public static void main(String[] args) {
		
		/*List<String>  list = new ArrayList<String>();
		list.add("Chinranjeevi");
		list.add("Balakrishna");
		list.add("Venkatesh");
		list.add("Anushka");)
		*/
		List<Integer>  list  = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
	
			//Integer itr1 = (Integer)itr.next();
			System.out.println(itr.next());			
		}
		//System.out.println(list);
				
	}

}
