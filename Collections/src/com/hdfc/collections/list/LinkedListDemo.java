package com.hdfc.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("======Array List=========");
		
		
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
		
		
		System.out.println("========Linked List=========");

		List<Integer> list3 = new LinkedList<Integer>();

		list3.add(52);
		list3.add(84);
		list3.add(null);
		list3.add(444);
		list.add(14);
		list3.add(78);
		//list3.add(3,74);
		//list3.remove(3);

		System.out.println("Linked list: "+list3);
		
		System.err.println("==========for loop=====");
		
		for (Integer list5 : list3) {
			System.out.println(list5);
		}

	}

}
