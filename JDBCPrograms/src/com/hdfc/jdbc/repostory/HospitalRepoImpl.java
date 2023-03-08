package com.hdfc.jdbc.repostory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hdfc.jdbc.entity.HospitalEntity;
import com.hdfc.jdbc.utilclass.JDBCUtil;

public class HospitalRepoImpl implements HospitalRepository {

	private Connection connection;

	public HospitalRepoImpl() {
		this.connection = JDBCUtil.getDBConnection();
	}

	@Override
	public int addEmployees(HospitalEntity entity) {

		int executeUpdate = 0;
		String insert = "insert into hospital(id,name,founder,since)values(?,?,?,?)";

		try {
			PreparedStatement ps = connection.prepareStatement(insert);

			ps.setInt(1, entity.getId());
			ps.setString(2, entity.getName());
			ps.setString(3, entity.getFounder());
			ps.setInt(4, entity.getSince());

			executeUpdate = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return executeUpdate;
	}

	@Override
	public int updateHospitalById(HospitalEntity entity) {

		
		String update = "update hospital set  name=?, founder=?, since=? where id=?";
		int executeUpdate = 0;
		try {
			PreparedStatement ps2 = connection.prepareStatement(update);

			
			ps2.setString(1, entity.getName());
			ps2.setString(2, entity.getFounder());
			ps2.setInt(3, entity.getSince());
			ps2.setInt(4, entity.getId());

			executeUpdate = ps2.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return executeUpdate;
	}

	@Override
	public int deleteHospitalById(int id) {
		int executeUpdate = 0;
		String delete = "delete from hospital where id=?";

		try {
			PreparedStatement ps3 = connection.prepareStatement(delete);

			ps3.setInt(1, id);

			executeUpdate = ps3.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return executeUpdate;
	}

	@Override
	public List<HospitalEntity> getHospitalEntityDetails() {

		List<HospitalEntity> list = new ArrayList<HospitalEntity>();

		try {
			Statement statement = connection.createStatement();
			String selectquery = "Select id,name,founder,since from hospital";

			ResultSet rs = statement.executeQuery(selectquery);
			while (rs.next()) {
				HospitalEntity entity1 = new HospitalEntity();
				entity1.setId(rs.getInt("id"));
				entity1.setName(rs.getString("name"));
				entity1.setFounder(rs.getString("founder"));
				entity1.setSince(rs.getInt("since"));

				list.add(entity1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

}