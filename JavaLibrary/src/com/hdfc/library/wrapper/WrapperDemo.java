package com.hdfc.library.wrapper;

public class WrapperDemo {

	public static void main(String[] args) {

		System.out.println(Integer.SIZE / 8 + " Bytes");

		System.out.println(Long.SIZE / 8 + " Bytes");

		System.out.println("=====String to Int=====");
		
		String data = "5005";
		int amount = Integer.parseInt(data);

		System.out.println(amount + 995);

		int x = Integer.parseInt("699");
		System.out.println(x + 1);
		
		int y= new Integer("895");
		System.out.println(y+5);
		
		
		System.out.println("===integer to string======");
		
		Integer in= new Integer(500);
		
		System.out.println(in.toString()+100);
	}

}
