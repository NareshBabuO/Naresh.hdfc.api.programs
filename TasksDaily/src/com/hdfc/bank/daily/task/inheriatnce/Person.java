package com.hdfc.bank.daily.task.inheriatnce;

public class Person extends Account {

	private String name;
	private int age;

	public Person() {
		super();
		System.out.println("Person Class Default Constructor..");
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("Person Class Parameter Constructor...");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
