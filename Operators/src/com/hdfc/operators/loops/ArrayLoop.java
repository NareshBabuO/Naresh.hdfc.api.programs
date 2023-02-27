package com.hdfc.operators.loops;

public class ArrayLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = { 11, 23, 45, 66, 77 };

		System.out.println(num);
		System.out.println(num.length);

		for (int i = 0; i < num.length; i++) {

			System.out.println("Value :" + i);
			System.out.println(num[i]);
		}
		
		System.out.println("For Each loop in Array");
		for (int x:num) {
			System.out.println(x);
		}
		
		System.out.println("=============");

		
		int ar[] = new int[4];
		
		ar[0]=101;
		ar[1]=102;
		
		System.out.println(ar);
		
		for (int i : ar) {
			System.out.println(i);
			
		}
	}

}
