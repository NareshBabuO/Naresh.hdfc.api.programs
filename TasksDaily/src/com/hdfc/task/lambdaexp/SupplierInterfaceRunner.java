package com.hdfc.task.lambdaexp;

import java.util.function.Supplier;

public class SupplierInterfaceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<String> sup = () -> {
			return "Welcome to HDFC Bank";
		};
		System.out.println(sup.get());

		Supplier<Double> random = () -> Math.random();
		System.out.println(random.get());

	}
}