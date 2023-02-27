package com.hdfc.task.collection;

import java.util.Objects;

/*.Assignment:

i.Create an Entity Class(any class) Flight
write properties  fid,fname,price
setters & getters
para-constructors

ii. Create seperate Main class
	Create HashSet and enter above entity objects
	 override hashcode() , equals(); to make fid or fname or price as hashcode
	Override toString() to print hashcode.
	

2. Create TreeSet Demo for above entity
     and create MyCompartor to implement Comparator interface with compare();
	do sorting for fligtNames in asc and desc order.
	do sorting for  price in asc or desc order.*/

public class Park {

	private int pid;
	private String pName;
	private String location;

	public Park() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Park(int pid, String pName, String location) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.location = location;
	}

	/*
	 * @Override public int hashCode() { return Objects.hash(pid); }
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Park other = (Park) obj;
		return pid == other.pid;
	}

	public int getPid() {
		return pid;
	}

	public String getpName() {
		return pName;
	}

	public String getLocation() {
		return location;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Park [pid=" + pid +  "]";
	}

	


}
