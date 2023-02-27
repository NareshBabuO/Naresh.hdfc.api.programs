package com.hdfc.exceptions.programs;

public class ExpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int res = div(10, 20);
			System.out.println("Result; " + res);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			// System.err.println(e);
			// TODO: handle exception
		}

		String name = "Naresh";

		System.out.println("name lenght is " + name.length());
	}

	private static int div(int a, int b) {
		return a / b;
	}
}
