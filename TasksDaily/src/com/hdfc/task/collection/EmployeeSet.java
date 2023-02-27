package com.hdfc.task.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeSet {

	public static void main(String[] args) {

		Set<Employee> set = new HashSet<Employee>();
		set.add(new Employee(103, "naresh", 15710));
		set.add(new Employee(105, "adarsh", 85200));
		set.add(new Employee(101, "rushikesh", 3685));
		set.add(new Employee(102, "ramesh", 86600));

		System.out.println(set);

		Set<Employee> set2 = new LinkedHashSet<Employee>();

		set2.add(new Employee(103, "Babu", 5700));
		set2.add(new Employee(105, "Gowda", 7600));
		set2.add(new Employee(101, "Ravi", 1900));
		set2.add(new Employee(102, "Dinesh", 9000));

		System.out.println(set2);

		System.out.println("TreeSet with Employees objects");

		Set<Employee> set3 = new TreeSet<Employee>(new EmpComparator());

		set3.add(new Employee(103, "naresh", 2570));
		set3.add(new Employee(105, "Chandana", 7850));
		set3.add(new Employee(101, "hritik", 8780));
		set3.add(new Employee(102, "Ravi", 9600));
		set3.add(new Employee(102, "Ravi", 8900));

		System.out.println(set3.size());

		System.out.println("=====New Employeeee===");

		Set<Employee> setz = new HashSet<>();
		setz.add(new Employee(103, "Hritik", 50000));
		setz.add(new Employee(102, "naresh", 40000));
		setz.add(new Employee(101, "rushikesh", 20000));
		setz.add(new Employee(104, "neha", 30000));
		System.out.println("sorting by eid :" + setz.toString());// sorting order for eid

		Set<Employee> set1 = new TreeSet<Employee>(new EmpComparator());
		set1.add(new Employee(106, "Hritik", 50000));
		set1.add(new Employee(102, "naresh", 40000));
		set1.add(new Employee(101, "rushikesh", 20000));
		set1.add(new Employee(104, "neha", 30000));
		System.out.println("Sorting by ename :" + set1.size());// sorting order for eid

		Set<Employee> s1 = new TreeSet<Employee>(new SalaryComparator());
		s1.add(new Employee(101, "Prasad", 25));
		s1.add(new Employee(103, "Darshan", 2));
		s1.add(new Employee(104, "Bhavesh", 5));
		s1.add(new Employee(102, "Ankit", 6));

		System.out.println("Sorting by ename : " + s1.toString());

	}
}
