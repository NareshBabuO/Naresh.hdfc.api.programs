package com.hdfc.library.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();

		System.out.println(d);

		System.out.println("--------------");

		LocalDate mydate = LocalDate.now();
		System.out.println(mydate);
		System.out.println("adding + "+mydate.plusYears(25));
		System.out.println(mydate.getDayOfYear());
		System.out.println(mydate.getDayOfMonth());
		System.out.println(mydate.getDayOfWeek());
		System.out.println(mydate.getMonthValue());

		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		System.out.println(dt.getHour());

	}

}
