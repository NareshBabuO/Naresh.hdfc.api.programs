package com.hdfc.java.programtest;

import java.util.Scanner;

public class StringConcatination {
	
	
	
	
	    
	    public static void main(String[] args) {
	    	
	    	String firstName,lastName,fullName;
	    	
	    	System.out.println("Enter Names to concate");
	    	Scanner scanner = new Scanner(System.in);
	    	
			/*
			 * String firstName = "Naresh"; String lastName = "Babu O"; String fullName =
			 * "";
			 */
	    	System.out.println("Enter First Name: ");
	    	firstName=scanner.nextLine();
	    	System.out.println("Enter last Name: ");
	    	lastName=scanner.nextLine();
	    	
	        try {
	            fullName = concatenateName(firstName, lastName);
	            System.out.println("Full Name: " + fullName);
	        } catch (InvalidNameException e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    public static String concatenateName(String firstName, String lastName) throws InvalidNameException {
	        if (firstName == null || firstName.trim().isEmpty() || lastName == null || lastName.trim().isEmpty()) {
	            throw new InvalidNameException("Invalid first or last name.");
	        }

	        String fullName = firstName + " " + lastName;
	        return fullName;
	    }
	}

	class InvalidNameException extends Exception {
	    public InvalidNameException(String message) {
	        super(message);
	    }
	}


