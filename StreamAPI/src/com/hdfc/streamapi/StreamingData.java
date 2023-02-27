package com.hdfc.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamingData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=====Using Stream type 'of' Method=====");
		Stream stream = Stream.of(10, 40, 30, 20, 50);

		Consumer<Integer> con = (data) -> {
			System.out.println(data);
		};
		// System.out.println(con);

		stream.forEach(con);

		System.out.println("-----Using Stream type by Arrays class---- ");

		Integer arr[] = new Integer[] { 55, 78, 66, 41, 88 };

		Stream<Integer> stream1 = Arrays.stream(arr);

		stream1.forEach((x) -> {
			System.out.println(x);
		});
		
		System.out.println("------data by list ------");
		List<String> list = new ArrayList<>();
		list.add("Nagesh");
		list.add("Babu");
		list.add("Javeed");
		list.add("Dada");
		
		Stream<String> stream2 = list.stream();
		
		stream2.forEach((name)->{System.out.println(name);});

	}

}
