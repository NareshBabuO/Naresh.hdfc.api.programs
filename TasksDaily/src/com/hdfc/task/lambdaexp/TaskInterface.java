package com.hdfc.task.lambdaexp;

public interface TaskInterface {

	public abstract int add(int a, int b);

	public static void m1() {

		System.out.println("m1() from interface");

	}

	public default void m2() {

		System.out.println("m2() from interface only by implementors");

	}

}
