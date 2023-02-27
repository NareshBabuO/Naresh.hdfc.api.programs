package com.hdfc.datefeature;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.now();
		
		System.out.println(date);
		System.out.println(date.getDayOfYear());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfWeek());
		
		System.out.println("Date format: "+date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println(date.plusWeeks(7));
		System.out.println("========");
LocalDate date1 = LocalDate.of(1998, 8, 31);
System.out.println(date1);
System.out.println(date1.getDayOfWeek());
System.out.println(date1.isAfter(date1));
System.out.println(date1.isLeapYear());

System.out.println("---Time------");

     LocalDateTime time = LocalDateTime.now();
     System.out.println(time);
     System.out.println(time.getDayOfYear());
     System.out.println(time.getDayOfMonth());

	}

}
