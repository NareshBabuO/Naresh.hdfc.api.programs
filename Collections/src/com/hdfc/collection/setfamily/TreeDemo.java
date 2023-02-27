package com.hdfc.collection.setfamily;

import java.util.Set;
import java.util.TreeSet;

public class TreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> treeSet = new TreeSet<String>();

		treeSet.add("Suresh");
		System.out.println(treeSet.add("Ramesh"));
		treeSet.add("Gopal");
		treeSet.add("Nagesh");
		treeSet.add("Anand");
		System.out.println(treeSet.add("Ramesh"));

		System.out.println(treeSet);

		System.out.println("========with Integer=======");

		Set<Integer> tset = new TreeSet<Integer>();
		tset.add(45);
		tset.add(99);
		tset.add(14);
		tset.add(27);
		tset.add(04);
		System.out.println(tset);

		System.out.println("=======");
		Set<Employee> set = new TreeSet<Employee>();
		set.add(new Employee(107, "Naresh", 3500.5));
		System.out.println(set);

		System.out.println("-----Comparator-----");
		// Set<Integer> set1 = new TreeSet<Integer>();

		Set<Employee> set05 = new TreeSet<Employee>();

		set05.add(new Employee(107, "Naresh", 73500.55000));
		set05.add(new Employee(177, "Babu", 83500.6));
		set05.add(new Employee(104, "Javeed", 66400.5));

		System.out.println(set05);
	}

}
