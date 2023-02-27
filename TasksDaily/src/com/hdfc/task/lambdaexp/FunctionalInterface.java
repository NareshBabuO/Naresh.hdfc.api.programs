package com.hdfc.task.lambdaexp;

import java.util.function.Function;

public class FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String, Integer> fun = (String s) -> {
			return s.length();
		};

		int len = fun.apply("Naresh");
		int len1 = fun.apply("Javeed");
		int len2 = fun.apply("Hritik");
		int len3 = fun.apply("Neha");
		int len4 = fun.apply("Ajith");

		System.out.println(len);
		System.out.println(len1);
		System.out.println(len2);
		System.out.println(len3);
		System.out.println(len4);

	}

}
