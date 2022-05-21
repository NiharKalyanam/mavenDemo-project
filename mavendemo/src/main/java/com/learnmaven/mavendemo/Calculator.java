package com.learnmaven.mavendemo;

public class Calculator {

	public static int add(int a, int b) {
		System.out.println("add : "+(a+b));
		return a+b;
	}

	public static int sub(int a, int b) {
		System.out.println("sub : "+(a-b));
		return a-b;
	}

	public static int multiple(int a, int b) {
		System.out.println("multiple : "+(a*b));
		return a*b;
	}

	public static int divison(int a, int b) {
		System.out.println("divison : "+(a/b));
		return a/b;
	}

}
