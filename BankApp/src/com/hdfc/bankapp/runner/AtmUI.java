package com.hdfc.bankapp.runner;

import java.util.Scanner;

public class AtmUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Bank");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Exit");

		Scanner scanner = new Scanner(System.in);

		int service = scanner.nextInt();
		switch (service) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		}
	}

}
