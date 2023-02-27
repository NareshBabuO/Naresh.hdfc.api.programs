package com.hdfc.task.threads;

public class Customer extends User {
	
	private int cId;
	private String name;
	
	public int getcId() {
		return cId;
	}
	public String getName() {
		return name;
	}
	
	public void setcId(int cId) {
		this.cId = cId;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", name=" + name + "]";
	}
	
}
