package com.hdfc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Object> list = new ArrayList<Object>();

		list.add(20);
		list.add("Java");
		list.add(true);
		list.add(new ArrayListDemo());

		System.out.println(list);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(15);
		list2.add(47);
		list2.add(25);
		list2.add(15);
		System.out.println(list2);
	}

}
