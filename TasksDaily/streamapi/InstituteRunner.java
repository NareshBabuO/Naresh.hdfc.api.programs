package com.hdfc.task.streamapi;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InstituteRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Institute> set = new HashSet<Institute>();

		set.add(new Institute("Manipal", "API Dev", 300000.0, 2009));
		set.add(new Institute("Xworkz", "Bangalore", 28000, 2014));
		set.add(new Institute("J Spider", "Rajaji nagar", 45000, 2010));
		set.add(new Institute("Kodinet", "Micho Layout", 30000, 2015));

		// System.out.println("--Using Map Stream-----");

		Stream<Institute> stream = set.stream();

		/*
		 * stream.map((name) -> { return name; }).forEach(System.out::println);
		 */

		System.out.println("----Using Collector------");
		Stream<Institute> stream1 = set.stream();
		List<String> list = stream1.map((in) -> {
			return in.getName();
		}).collect(Collectors.toList());
		System.out.println(list);

		System.out.println("----Reduce Method--by Optional--");
		List<Double> list2 = stream.map((i1) -> {
			return i1.getFee();
		}).collect(Collectors.toList());

		Optional<Double> optional = list2.stream().reduce((l1, l2) -> {
			return l1 + l2;
		});
		optional.orElse(0.0);
		System.out.println("After All Fee reduce: " + optional);

	}

}
