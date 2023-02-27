package com.hdfc.collection.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> que = new PriorityQueue<String>();
		que.add("Sahil");
		que.add("Javeed");
		que.add("Hritik");
		que.add("Adarsh");
		que.add("Babu");

		System.out.println(que);
		
		System.out.println("Peak read the data: " +que.peek());
		System.out.println("Pol delete data : "+que.poll());
		
		System.out.println(que);
		
		System.out.println("=======Integer========");
		
		Queue<Integer> que2 = new PriorityQueue<Integer>();
		
		
		que2.add(88);
		que2.add(14);
		que2.add(05);
		que2.add(29);
		que2.add(64);
		
		System.out.println(que2);

	}

}
