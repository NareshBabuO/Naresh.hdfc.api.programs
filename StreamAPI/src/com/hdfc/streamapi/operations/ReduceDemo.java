package com.hdfc.streamapi.operations;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer salaries[] = { 45000, 80000, 20000, 74500, 86220, 65400 };

		Stream<Integer> stream = Arrays.stream(salaries);

		Optional<Integer> optional = stream.reduce((s1, s2) -> {
			return s1 + s2;
		});

		if (optional.isPresent()) {
			System.out.println("result from get(): " + optional.get());
		} else {
			System.out.println("no result");
		}

		// System.out.println(optional.get());
		Integer orElse = optional.orElse(0);
		System.out.println("Sum of salaries is: " + orElse);

	}

}
