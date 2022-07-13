package com.java.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {

	
		  TreeMap<String, String> fruits = new TreeMap<String, String>();
	      fruits.put("K1", "Jackfruit");
	      fruits.put("K2", "Raspberry");
	      fruits.put("K3", "Kiwifruit");
	      fruits.put("K4", "Tangerine");
	      fruits.put("K5", "Strawberry");

		  System.out.println("Before Sorting ="+fruits);
		
		 //calling sortvalues method
	     Map<String, String> sortedMap = sortValues(fruits);
	     System.out.println("After Sorting ="+sortedMap);
	     
	     Set set = sortedMap.entrySet();
	      Iterator iterate = set.iterator();
	      // print elements
	      while(iterate.hasNext()) 
	      {
	         Map.Entry ma = (Map.Entry)iterate.next();
	         System.out.print(ma.getKey() + ": ");
	         System.out.println(ma.getValue());
	      }

	
	}
	
	public static <K, V extends Comparable<V>> Map<K, V> sortValues(final Map<K, V> m) 
	   {
	      Comparator<K> com = new Comparator<K>()
	      {
	         public int compare(K k1, K k2) 
	         {
	            int compare = m.get(k1).compareTo(m.get(k2));
	            if(compare == 0)
	            {
	               return 1;
	            }
	            else
	            {
	               return compare;
	            }
	         }
	      };
	      Map<K, V> sortedByValues = new TreeMap<K, V>(com);
	      sortedByValues.putAll(m);
	      return sortedByValues;
	   }

}
