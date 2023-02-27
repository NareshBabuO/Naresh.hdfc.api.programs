package com.hdfc.datatype;

public class DataTypesDemo {

	public static void main(String[] args) {

		System.out.println("The Max value of int :" + Integer.MAX_VALUE + " And Mini Value is:" + Integer.MIN_VALUE);

		System.out.println("The Max value of byte :" + Byte.MAX_VALUE + " And Mini Value is:" + Byte.MIN_VALUE);
		System.out
				.println("The Max value of char :" + Character.MAX_VALUE + " And Mini Value is:" + Character.MIN_VALUE);
		System.out.println("The Max value of float :" + Float.MAX_VALUE + " And Mini Value is:" + Float.MIN_VALUE);

		System.out.println("The Max value of Long :" + Long.MAX_VALUE + " And Mini Value is:" + Long.MIN_VALUE);

		System.out.println("The Max value of Double :" + Double.MAX_VALUE + " And Mini Value is:" + Double.MIN_VALUE);

		System.out.println("The Max value of Boolean :" + Boolean.FALSE + " And Mini Value is:" + Boolean.TRUE);

		System.out.println("==========================");

		byte b = 50;
		int i = 90;
		long l = 999999999585l;
		float f = 3.45f;
		double d = 800.4;

		int x = b; 
		System.out.println("Byte Value in int by using Implicite Type casting:" + x);

		int y = (int) l;
		System.out.println("long value in int by explicit type casting" + l);

		int ifvalue = (int) f;
		System.out.println("Float Value in int by explicit TypeCasting:" + ifvalue);

		int id = (int) d;
		System.out.println("Double Value int int by explicit Casting:" + id);

		long li = i;
		System.out.println("int Value in long by using Implicite Type casting:" + li);

		double di = i;
		System.out.println("int Value in double by using Implicite Type casting:" + di);

		float fi = i;
		System.out.println("int Value in Float by using Implicite Type casting:" + fi);

		float fl=l;
		System.out.println(fl);
	}

}
