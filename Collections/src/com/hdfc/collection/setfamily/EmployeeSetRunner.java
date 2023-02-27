package com.hdfc.collection.setfamily;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeSetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Employee> set = new HashSet<Employee>();

		set.add(new Employee(103,"Naresh", 62400));
		set.add(new Employee(148,"Mahesh", 72400));
		set.add(new Employee(103,"Gopal", 91400));
		
		System.out.println(set);
	}
	
	
	//Set<String> settree = new TreeSet<String>();

}
