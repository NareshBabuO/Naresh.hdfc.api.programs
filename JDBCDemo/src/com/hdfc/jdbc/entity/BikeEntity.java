package com.hdfc.jdbc.entity;

public class BikeEntity {

	private int id;
	private String brand;
	private String ownerName;
	private String location;

	public BikeEntity() {
		// TODO Auto-generated constructor stub
	}

	public BikeEntity(int id, String brand, String ownerName, String location) {
		super();
		this.id = id;
		this.brand = brand;
		this.ownerName = ownerName;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getLocation() {
		return location;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Bikedetails [id=" + id + ", brand=" + brand + ", ownerName=" + ownerName + ", location=" + location
				+ "]";
	}

}
