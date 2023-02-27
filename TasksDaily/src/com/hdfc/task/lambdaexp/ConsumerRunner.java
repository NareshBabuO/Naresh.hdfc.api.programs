package com.hdfc.task.lambdaexp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerRunner {

	public static void main(String[] args) {

		System.out.println("----Consumer Functional Interface-------");

		Consumer<String> consumer = (String name) -> {
			System.out.println(name);
		};

		consumer.accept("1. Hello Welcome to Manipal Globle Academy");
		consumer.accept("2. Hello Welcome to Manipal Globle Academy API Devlopment");

		List<Integer> list = Arrays.asList(1, 3, 6, 8, 66, 7);

		Consumer<Integer> con = (Integer l) -> System.out.println(l);

		forEach(list, con);

	}

	private static void forEach(List<Integer> list, Consumer<Integer> con) {
		for (Integer integer : list) {
			con.accept(integer);

		}

	}

}
