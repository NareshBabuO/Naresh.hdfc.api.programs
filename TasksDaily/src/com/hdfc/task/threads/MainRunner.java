package com.hdfc.task.threads;

import java.util.Scanner;

public class MainRunner {

	public static void main(String[] args) {

		Runnable r = new User();

		System.out.println("Enter the Choice..");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();

		switch (i) {
		case 1:
			Customer customer = new Customer();
			Thread td = new Thread(customer);
			customer.setcId(15);
			customer.setName("Naresh");
			td.setName(customer.getName());
			td.start();
			
			break;

		case 2:
			Admin admin = new Admin();
			Thread td1 = new Thread(admin);
			admin.setAid(104);
			admin.setAdminName("Teja");
			td1.setName(admin.getAdminName());
			td1.start();
			break;

		}

		/*
		 * Customer c = new Customer(); Thread td = new Thread(c); c.setcId(105);
		 * c.setName("Naveen"); td.setName(c.toString()); td.start();
		 */

	}

}
