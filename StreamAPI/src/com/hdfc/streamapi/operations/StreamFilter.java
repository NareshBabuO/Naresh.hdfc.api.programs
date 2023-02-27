package com.hdfc.streamapi.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4

		List<String> list = new ArrayList<>();
		list.add("Nagesh");
		list.add("Babu");
		list.add("Javeed");
		list.add("Dada");
		list.add("Dada");

		Stream<String> stream = list.stream();

		stream.filter((name) -> {
			return name.length() > 4;
		}).map((name) -> {
			System.out.println(name + " :");
			return name.length();
		}).forEach(System.out::println);
		;

		System.out.println("---Other filter methods-----");

		Stream<String> stream1 = list.stream();
		System.out.println("Limit filter");
		stream1.limit(3).forEach(System.out::println);

		System.out.println("Display with skip method");
		
		Stream<String> stream2 = list.stream();
		stream2.skip(3).forEach(System.out::println);
		
		System.out.println("---Distint method---");
		
		Stream<String> stream3 = list.stream();
		stream3.distinct().forEach(System.out::println);
	}

}
