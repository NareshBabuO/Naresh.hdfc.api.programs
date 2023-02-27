package com.hdfc.allstream.example;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Employee> set = new HashSet<Employee>();

		set.add(new Employee(103, "Naresh", 62400));
		set.add(new Employee(148, "Mahesh", 72400));
		set.add(new Employee(103, "Gopal", 91400));

		Stream<Employee> stream = set.stream();
		// System.out.println(set);

		System.out.println("display usking MAP Stream");
		stream.map((emp) -> {
			return emp;
		}).forEach(System.out::println);

		System.out.println(" Using Collector");

		Stream<Employee> stream1 = set.stream();

		List<String> list = stream.map((emp) -> {
			return emp.getName();
		}).collect(Collectors.toList());

		System.out.println(list);

		System.out.println("Reduce method");

		System.out.println("-----------Optional-----");
		List<Double> salaries = stream.map((e1) -> {
			return e1.getSalary();
		}).collect(Collectors.toList());

		Optional<Double> reduce = salaries.stream().reduce((s1, s2) -> {
			return s1 + s2;
		});
		Double orElse = reduce.orElse(0.0);

		System.out.println("The total salaries is by reduce stream: " + orElse);

	}

}
