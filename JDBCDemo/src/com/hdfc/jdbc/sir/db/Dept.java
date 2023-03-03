package com.hdfc.jdbc.sir.db;

public class Dept {

	private int dno;
	private String dname;
	private String location;

	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dept(int dno, String dname, String location) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.location = location;
	}

	public int getDno() {
		return dno;
	}

	public String getDname() {
		return dname;
	}

	public String getLocation() {
		return location;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Entity [dno=" + dno + ", dname=" + dname + ", location=" + location + "]";
	}

}
