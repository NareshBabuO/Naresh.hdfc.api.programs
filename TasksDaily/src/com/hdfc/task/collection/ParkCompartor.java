package com.hdfc.task.collection;

import java.util.Comparator;

public class ParkCompartor implements Comparator<Park> {

	@Override
	public int compare(Park p1, Park p2) {

		String s1 = p1.toString();
		String s2 = p2.toString();

		return s1.compareTo(s2);
	}

}
