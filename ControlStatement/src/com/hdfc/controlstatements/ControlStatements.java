package com.hdfc.controlstatements;

public class ControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("IF Control Statements");

		int x = 10;
		if (x == 20) {
			System.out.println("Hello");
		} else {
			System.out.println("hi");
		}

		System.out.println("------------------");

		boolean b = false;
		if (b = true) {
			System.out.println("Hello");
		} else {
			System.out.println("Hi");
		}
		System.out.println("-----SWITCH Statement-------------");

		int l = 10;
		final int m = 20;
		switch (l) {
		case 10:
			System.out.println("10");
		case 11:
			System.out.println("20");
		}
		System.out.println("========1==========");

		int day = 4;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Sat");
			break;
		case 7:
			System.out.println("Sunday");
		}

		System.out.println("=============2=============");

		int x1 = 0;
		switch (x1) {
		case 0:
			System.out.println("0");
			break;
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
		default:
			System.out.println("default");

		}
	}

}
