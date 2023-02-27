package com.hdfc.variables;

public class Demo {

	int d1;
	String demo;

	static int sid;
	static String sname;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Local Variable");
		int x = 0;
		String name = null;
		System.out.println(x);
		System.out.println(name);

		System.out.println("Instance Variables");
		Demo d = new Demo();

		d.d1 = 101;
		d.demo = "Hello";

		System.out.println(d.d1);
		System.out.println(d.demo);

		System.out.println("Static Variables");
		System.out.println(Demo.sid); // using Class name or reference
		System.out.println(Demo.sname);// using Class name or reference

		d.sid = 40;
		d.sname = "Naresh";

		Demo d2 = new Demo();
		d2.sid = 45;
		d2.sname = "Babu";

		System.out.println("d1 " + d.sid + " " + d.sname);
		System.out.println("d2 " + d2.sid + " " + d2.sname);

	}

}
