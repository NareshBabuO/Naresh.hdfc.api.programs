package com.hdfc.readingdata;

import java.util.Scanner;

public class InstituteRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Institute institute = new Institute("Manipal", "API Dev", 300000.0, 2009);

		System.out.println(institute);

		System.out.println("----------------");

		Institute institute1 = new Institute();
		institute1.setName("Nextwave");
		institute1.setCourseName("Pythan");
		System.out.println(institute1.toString());
		System.out.println("=========Using Scanner =============");

		Institute institute2 = new Institute();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter institute Name ");

		String name = scanner.next();
		scanner.nextLine();
		institute2.setName(name);

		System.out.println("Enter Course");

		String course = scanner.next();
		scanner.nextLine();
		institute2.setCourseName(course);

		System.out.println("Enter Fee");

		double fee = scanner.nextDouble();
		scanner.nextLine();
		institute2.setFee(fee);

		System.out.println("When was institute Started");

		int since = scanner.nextInt();
		scanner.nextLine();
		institute2.setSince(since);

		System.out.println(institute2.toString());

	}

}
