package com.hdfc.task.lambdaexp;

import java.util.function.Predicate;

public class PredicateInterfaceRunner {

	public static void main(String[] args) {

		System.out.println("---PredicateInterface display True and False---");

		Predicate<Integer> i = in -> (in < 30);
		System.out.println(i.test(14));

		System.out.println(i.test(35));
		
		
		System.out.println("--------'--String types-----");
		
		Predicate<String> pre= Predicate.isEqual("HDFC");
		System.out.println(pre.test("HDFC"));
		System.out.println(pre.test("hdfc"));
	}

}
