package com.hdfc.java8features.lambda;

@FunctionalInterface
public interface MyInterface {

	abstract int add(int a, int b);
	
	
	public static void m1() {
		System.out.println("m1() from interface by static");
	}

}
