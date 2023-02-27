package com.hdfc.task.threads;

public class Admin extends User {

	private int aId;
	private String adminName;

	public int getAId() {
		return aId;
	}

	

	public String getAdminName() {
		return adminName;
	}

	public void setAid(int aId) {
		this.aId = aId;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}



	@Override
	public String toString() {
		return "Admin [aId=" + aId + ", adminName=" + adminName + "]";
	}
	
}
