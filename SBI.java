package com.java.collection;

public class SBI implements Bank2{

	@Override
	public float rateOfIntrest() {
		
		System.out.println(Bank.name);
		Bank.defaultMethod();
		return 10.1f;
	}

	@Override
	public String getName() {

		return "SBI Bank";
	}

	@Override
	public boolean isBank() {
		// TODO Auto-generated method stub
		return false;
	}

}
