package com.hdfc.collections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.hdfc.collection.setfamily.EmpComparator;
import com.hdfc.collection.setfamily.Employee;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Map<Integer,String> map =	new HashMap<Integer,String>();
	map.put(101, "Naresh");
	map.put(105, "Gopal");
	map.put(117, "Ravi");
	map.put(106, "Varma");
	
	System.out.println(map);
	

	
	Map<String,Integer> map1 =	new HashMap<String,Integer>();
	map1.put( "Naresh",3);
	map1.put( "Gopal",5);
	map1.put("Ravi",6);
	map1.put( "Varma",8);
	
	System.out.println(map1);
	
	System.out.println("=====Tree Set=====");
	Map<Employee, String> tree = new TreeMap<Employee,String>(new EmpComparator());
	
	
	tree.put(new Employee(103,"Naresh", 62400),"Devloper");
	tree.put(new Employee(148,"Mahesh", 72400),"Tester");
	tree.put(new Employee(103,"Gopal", 91400),"UI Devloper");
	
	System.out.println(tree);
	
	}
}

