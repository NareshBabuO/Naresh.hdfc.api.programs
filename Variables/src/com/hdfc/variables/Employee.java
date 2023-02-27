package com.hdfc.variables;

public class Employee {
	// Entity class or POJO class or Bean Class

	private int eid;
	private String ename;
	private double salary;

	public Employee() {

	}

	public Employee(int eid, String ename, double salary) {

		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEid() {
		return this.eid;
	}

	public String getEname() {
		return this.ename;
	}

	public double getSalary() {
		return this.salary;
	}

	public void  setEname(String ename) {
		this.ename = ename;
	}

	public void setEid(int eid) {
		 this.eid = eid;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
