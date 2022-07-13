package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SplitValuesBasedOnType {

	public static void main(String[] args) {
        //Add differrent type of values in to the list 
		List list = new ArrayList();
		list.add(100);
		list.add("Andhra pradesh");
		list.add(true);
		list.add('A');
		list.add(19.5f);
		list.add(200);
		list.add("Banglore");
		list.add(false);
		list.add('M');
		list.add(20.5f);
		list.add(200);
		list.add("Banglore");
		list.add(false);
		list.add('M');
		list.add(20.5f);
		
		System.out.println(list);
		
		System.out.println("========> sSplit Values <=======");
		List<Integer> intList = new ArrayList<Integer>();
		List<String> strList = new ArrayList<String>();
		List<Boolean> boolList = new ArrayList<Boolean>();
		List<Character> charList = new ArrayList<Character>();
		List<Float> floatList = new ArrayList<Float>();
		
		//Split the values based on the type
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			
			Object obj = (Object)itr.next();
			if(obj instanceof Integer)
				intList.add((Integer) obj);
			else if(obj instanceof String)
				strList.add((String)obj);
			else if(obj instanceof Boolean)
				boolList.add((Boolean)obj);
			else if(obj instanceof Character)
				charList.add((Character)obj);
			else if(obj instanceof Float)
				floatList.add((Float)obj);
		}
		System.out.println("Integer List : "+intList);
		System.out.println("String List : "+strList);
		System.out.println("Boolean List : "+boolList);
		System.out.println("Charecter List : "+charList);
		System.out.println("floatList List : "+floatList);
	}

}
