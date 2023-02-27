package com.hdfc.task.collection;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class ParkRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=====HashSet =======");
		
		Set<Park> set = new HashSet<Park>();
		set.add(new Park(111,"Brundavana","BTM"));
		set.add(new Park(222,"Lalbhag","NationalPark"));
		set.add(new Park(333,"Bannergata","Jigani"));
		set.add(new Park(888,"Govardana","Jayanagara"));
		
		System.out.println(set);
		
		System.out.println("=====LinkedHashSet=======");
		
		
		//Set<Park> set1 = new LinkedHashSet()<Park>();
		
		      Set<Park> set1=new LinkedHashSet<Park>();
		
		set1.add(new Park(126,"Jim Corbett Park","Mumbai"));
		set1.add(new Park(447,"Kanha Park","Gujarath"));
		set1.add(new Park(986,"Bandipur","Karnataka"));
		set1.add(new Park(257,"Nameri Park","Arunachal"));
		
		System.out.println(set1);
		System.out.println(set1.size());
		
	}

}
