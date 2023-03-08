package com.hdfc.jdbc.service;

import java.util.List;

import com.hdfc.jdbc.entity.HospitalEntity;
import com.hdfc.jdbc.repostory.HospitalRepoImpl;
import com.hdfc.jdbc.repostory.HospitalRepository;

public class HospitalServiceImpl implements HospitalService {

	private HospitalRepository repo;

	public HospitalServiceImpl() {
		repo = new HospitalRepoImpl();
	}

	@Override
	public int addEmployees(HospitalEntity entity) {

		/*
		 * int id = entity.getId(); String name = entity.getName(); String founder =
		 * entity.getFounder(); int since = entity.getSince(); if (id > 0 & id < 5000) {
		 * System.out.println("id is valid"); if (name != null && name.length() >= 3 &&
		 * name.length() < 500) { System.out.println("Hospital Name is Valid"); if
		 * (founder != null && founder.length() >= 4 && founder.length() < 100) {
		 * System.out.println("Hospital founder is Valid"); if (since > 1900 && since <
		 * 2024) { System.err.println("Since is Valid");
		 * System.out.println("All Preoperites is valid");
		 * 
		 * } else { System.err.println("Invalid Since"); } } else {
		 * System.err.println("Invalid Founder Name"); } } else {
		 * System.err.println("Invalid Hospital name"); } } else {
		 * System.err.println("Invalid Hospital Id"); }
		 */
		return repo.addEmployees(entity);
	}

	@Override
	public int updateHospitalById(HospitalEntity entity) {
		// TODO Auto-generated method stub
		return repo.updateHospitalById(entity);
	}

	@Override
	public int deleteHospitalById(int id) {
		// TODO Auto-generated method stub
		return repo.deleteHospitalById(id);
	}

	@Override
	public List<HospitalEntity> getHospitalEntityDetails() {
		return repo.getHospitalEntityDetails();
	}

}
