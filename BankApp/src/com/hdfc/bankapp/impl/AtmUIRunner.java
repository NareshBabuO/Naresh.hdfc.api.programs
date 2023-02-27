package com.hdfc.bankapp.impl;

import java.util.Scanner;

import com.hdfc.bankapp.inteface.IBank;
import com.hdfc.bankapp.runner.Util;

public class AtmUIRunner {

	public static void main(String[] args) {

		System.out.println("*******Welcome to HDFC ATM*******");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Exit");

		IBank bank = Util.getObject();

		Scanner scanner = new Scanner(System.in);

		int service = scanner.nextInt();

		switch (service) {
		case 1:

			bank.deposit();

			break;
		case 2:
			bank.withdraw();

			break;
		case 3:

			System.exit(0); // kill JVM

			break;

		default:

			System.out.println("Invalid service or option");

			break;
		}

	}
}