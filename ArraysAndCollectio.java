package com.java.collection;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

public class ArraysAndCollectio {

	public static void main(String[] args) {
				
		 
		//Array Declarion
		int arr[] = new int[7];
		
		   System.out.println("Array Length "+arr.length);
		
		//Adding Elements
		arr[0] =10;
		arr[1] =20;
		arr[2] =30;
		arr[3] =40;
		arr[4] =50;
		arr[5] =60;
		arr[6] =70;
		//arr[7] =80;
		
		//Printing the values		
	   for(int i=0; i<arr.length;i++) {
		   System.out.println(arr[i]);
	   }
	   
	   for(int j=0; j<arr.length;j++) {
		   if(j == 6 ) {
		       System.out.println("Pring 0th Element"+arr[j]);
		   }
	   }
	   
	   //Collection Concept
	   List list = new ArrayList();
	   list.add(10);
	   list.add(20);
	   list.add(30);
	   list.add(40);
	   list.add(50);
	   list.add(60);
	   list.add(70);
	   list.add(5555555);
	   
	   System.out.println(list.size());
	   
	   //Print the Values
	   for(int i=0; i<list.size();i++) {
		   System.out.println(list.get(i));
	   }
	   
	   //GEt the specific Index
	   
	   System.out.println("Print 4th Eleemnt "+list.get(4));
	   System.out.println("Print the valuess "+list);
	   System.out.println("Print 4th Eleemnt "+list.contains(5555555));
	   

	}

}
