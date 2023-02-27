package com.hdfc.streamapi.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		list.add("Nagesh");
		list.add("Babu");
		list.add("Javeed");
		list.add("Dada");
		
		Stream<String> stream = list.stream();
		
		stream.map((name)->{System.out.println(name+":");return name.length();})
		.forEach((x)->{System.out.println(x);});
		
		//.forEach(System.out::println);

	}

}
