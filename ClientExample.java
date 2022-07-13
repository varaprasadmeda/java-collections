package com.java.collection;

public class ClientExample {

	public static void main(String[] args) {
		
		Bank bSBI = new SBI(); // By using interface reference variable we calling implementation method
		System.out.println("SBI ROI :"+bSBI.rateOfIntrest());
		
		
		Bank bICICI = new ICICI();
		System.out.println("ICICI ROI :"+bICICI.rateOfIntrest());

	}

}
