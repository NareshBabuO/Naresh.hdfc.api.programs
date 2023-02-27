package com.hdfc.collection.setfamily;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new HashSet<String>();

		set.add("Benz");
		System.out.println(set.add("Tata"));
		set.add("Maruthi");
		set.add("Audi");
		System.out.println(set.add("Tata"));
		System.out.println(set);

		System.out.println("---Linked Hashset----");

		Set<String> set1 = new HashSet<String>();

		set1.add("Benz");
		System.out.println(set1.add("Tata"));
		set1.add("Maruthi");
		set1.add("Audi");
		System.out.println(set1.add("Tata"));
		System.out.println(set1);

	}

}
