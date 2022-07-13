package com.java.collection;

public class AbstractImplementation extends AbstractClassExample {

	@Override
	public void getMessage() {
      System.out.println("Abstract method implementation");

	}

	public static void main(String[] args) {
      AbstractClassExample abstra = new AbstractImplementation();
      
      abstra.getMessage();
      abstra.getMethod();
	}

}
