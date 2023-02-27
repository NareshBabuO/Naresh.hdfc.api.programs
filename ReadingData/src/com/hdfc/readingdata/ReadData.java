package com.hdfc.readingdata;

import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter user id");

		int id = scanner.nextInt();

		scanner.nextLine();

		System.out.println("Enter user Name");

		String name = scanner.next();
		scanner.nextLine();

		System.out.println("Enter user Amount");

		double amount = scanner.nextDouble();
		scanner.nextLine();

		System.out.println("id: " + id + " name: " + name + " amt: " + amount);

	}

}
