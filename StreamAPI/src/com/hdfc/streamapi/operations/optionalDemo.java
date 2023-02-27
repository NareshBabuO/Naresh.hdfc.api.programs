package com.hdfc.streamapi.operations;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class optionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ar[] = { "Hello", "Guru" };

		Stream<String> stream = Arrays.stream(ar);

		Optional<Integer> optional = Optional.of(30);

		
		  if (optional.isPresent()) { System.out.println(optional.get()); } else {
		  System.out.println("Value in not found"); }
		 System.out.println(" or we can use Optional instance of if-else  statement");
		Integer orElse = optional.orElse(0);
		System.out.println(orElse);

		
		
		
	}

}
