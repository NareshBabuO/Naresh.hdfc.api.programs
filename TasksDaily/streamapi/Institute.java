package com.hdfc.task.streamapi;

public class Institute {

	private String name;
	private String courseName;
	private double fee;
	private int since;

	public Institute() {
		System.out.println(" using default constructor in Institute");
	}

	public Institute(String name, String courseName, double fee, int since) {


		super();
		
		this.name = name;
		this.courseName = courseName;
		this.fee = fee;
		this.since = since;
	}

	public String getName() {
		return name;
	}

	public String getCourseName() {
		return courseName;
	}

	public double getFee() {
		return fee;
	}

	public int getSince() {
		return since;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public void setSince(int since) {
		this.since = since;
	}

	@Override
	public String toString() {
		return "Institute [name=" + name + ", courseName=" + courseName + ", fee=" + fee + ", since=" + since + "]";
	}

}
