package com.hdfc.variables;

public class EmployeeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee(101, "Bailley", 35000);

		System.out.println(e1.getEid());
		System.out.println(e1.getEname());
		System.out.println(e1.getSalary());

		Employee e2 = new Employee(102, "Bisleri", 10000);
		System.out.println(e2.getEid()+" "+e2.getEname()+" "+e2.getSalary());
	
	Employee e3 = new Employee();
	e3.setEname("Naresh");
	//System.out.println("e3e3.setEid(0)+""+e3.setSalary(0.0));
	
	}

}
