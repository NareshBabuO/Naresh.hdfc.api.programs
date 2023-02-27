package com.hdfc.oops.abstraction.impl;

import com.hdfc.oops.abstraction.interfaces.MyInterface;

public class MyInterfaceImpl implements MyInterface {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		MyInterface myInterface = new MyInterfaceImpl();
		int result = myInterface.add(35, 90);

		System.out.println(result);
	}
}
