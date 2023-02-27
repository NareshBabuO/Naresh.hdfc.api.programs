package com.hdfc.inheritance;

public class Child extends Parent {

	int cid = 99;

	public Child() {
		super();
		System.out.println("Child Default const...");
	}

	public void m2() {
		System.out.println("M2() Method in Child Class");
	}
	
	@Override
	public void m1() {
		System.out.println("M1() method from child class");
		
		// TODO Auto-generated method stub
	//	super.m1();
	}

}
