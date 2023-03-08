package com.hdfc.jdbc.service;

import java.util.List;

import com.hdfc.jdbc.entity.HospitalEntity;

public interface HospitalService {

	public int addEmployees(HospitalEntity entity);

	public int updateHospitalById(HospitalEntity entity);

	public int deleteHospitalById(int id);

	public List<HospitalEntity> getHospitalEntityDetails();

}
