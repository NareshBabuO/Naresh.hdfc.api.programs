package com.hdfc.variables;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1 = new Student(56, "Ravi", 10000, "API Dev");
		// System.out.println(student1.getStudentId() + " " + student1.getStudentName()
		// + " " + student1.getFee() + " "
		// + student1.getCourse());

		System.out.println(student1.toString());
		
		System.out.println("------------------");
 
		Student student2 = new Student();
		student2.setStudentId(101);
		student2.setStudentName("Sundeep");

		System.out.println(student2.toString());

	}

}
