package com.hdfc.java8features.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntBiFunction;

public class LambdaExpRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyInterface mi1 = (int x, int y) -> {
			return x + y;
		};

		MyInterface mi = (x, y) -> x + y;
		System.out.println(mi.add(5, 40));

		System.out.println("--------");

		MyInterface.m1();

		System.out.println("========Lambda Expression======");

		// ToIntBiFunction<Integer, U> f= (int a,int b)->{return a*b;};

		Supplier<String> sup = () -> {
			return "Hello World";
		};
		System.out.println(sup.get());
		
		System.out.println("======Function Functional Inter....");
		
		Function<String, Integer> ffi=  (String str)->{return str.length();};

		int len=ffi.apply("Naresh");
		System.out.println("The Lenght of String is : "+len);
		
		System.out.println("----Consumer FI");
		
		Consumer<String>  con=(String name)->{System.out.println(name);};
		con.accept("HDFC BANK");
		
		System.out.println("-----Another Method ConsumerFunctional Interface====");
		
		Consumer<Integer> consumer= System.out::println;
		consumer.accept(526);
		
	}

}
