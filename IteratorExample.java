package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorExample {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);
		
		System.out.println(list);
		/*Iterator itr =list.iterator();
		while(itr.hasNext()) {
			Integer otr =(Integer)itr.next();
			if(otr == 200)
			  itr.remove();
		}*/
		
		ListIterator itr =list.listIterator();
		while(itr.hasNext()) {
			Integer otr =(Integer)itr.next();
			
			if(otr == 300)		
				itr.remove();
			
			
		}
		
		System.out.println(list);
		
		
	}

}
