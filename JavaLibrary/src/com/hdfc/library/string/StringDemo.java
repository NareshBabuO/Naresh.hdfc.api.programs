package com.hdfc.library.string;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "java";
		String str2 = "java";

		System.out.println(str1.equals(str2));
		System.out.println("======");
		System.out.println("java comparing: " + str1 == str2);

		String str3 = new String("Hello");
		String str4 = new String("Hello");

		System.out.println(str3.equals(str4));// check hascode
		System.out.println(str3 == str4);// check data

		System.out.println("===Compare() Method");

		String s1 = new String("A");// 65// +ve means need sort
		String s2 = new String("B");// 66 //-ve means sorted already

		System.out.println(s1.compareTo(s2));

		String s3 = new String("King");//
		String s4 = new String("Ken");// 

		System.out.println(s3.compareTo(s4));//+ve because e come first and i last
	}

}
