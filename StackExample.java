package com.java.collection;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack stack  = new  Stack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.toString());// If we want print any object reference internally toString()
		System.out.println(stack.search("B"));
		System.out.println(stack.search("A"));
		System.out.println(stack.search("C"));

	}

}
