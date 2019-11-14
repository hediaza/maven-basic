package com.acme.basic;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello main");
	}

	void sayHello() {
		System.out.println("Hello World!");
	}

	void notCovered() {
		System.out.println("This method is not covered by unit tests");
	}

}
