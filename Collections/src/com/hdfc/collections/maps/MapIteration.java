package com.hdfc.collections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MapIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Naresh");
		map.put(105, "Gopal");
		map.put(117, "Ravi");
		map.put(106, "Varma");

		System.out.println(map);

		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.get(117));
		
		System.out.println("---------for loop--------");
		Set<Integer> keySet = map.keySet();
		
		for (Integer key : keySet) {
			
			System.out.println(key+" ,"+map.get(key));
			
		}

	}

}
