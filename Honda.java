package com.java.collection;

public class Honda extends Bike {

	@Override
	void run() {
		String message ="Run safely";
		
		System.out.println(message);

	}

	public static void main(String[] args) {

		Bike bike = new Honda();
		bike.run();

	}

}
