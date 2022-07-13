package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();		
		System.out.println(list.size());
		
		list.add(10000);
		list.add(20000);
		list.add(200.0f);
		
		list.add(0,"Prasad");
		
		System.out.println(list.size());
		System.out.println(list);
		list.remove(3);
		System.out.println("After Remove : "+list);
		//list.add(1,"India");
		System.out.println(list);
		System.out.println(list.size());
		//list.removeAll(list);
		//System.out.println(list.size());
		list.add(1,"India1");
		System.out.println(list);
		//list.forEach(System.out::println);
		for(int i= 0; i<list.size() ;i++) {
			if(i == 1) {
				list.remove(i);
			}
		}
		list.add(1,"India123");
		System.out.println(list);
		//System.out.println(list.get(3));
		
		Iterator itr =list.iterator();
		while(itr.hasNext()) {
			
			itr.remove();
		}
		
		System.out.println(list);
		
		
		
	}

}
