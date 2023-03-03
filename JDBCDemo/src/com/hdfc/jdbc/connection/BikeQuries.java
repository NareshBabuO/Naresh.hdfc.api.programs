package com.hdfc.jdbc.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hdfc.jdbc.entity.BikeEntity;
import com.hdfc.jdbc.util.bikeUtil;

public class BikeQuries {

	Connection connet = bikeUtil.getConnection();

	public int insert(BikeEntity entity) {

		int executeUpdate = 0;
		String inserting = "insert into bikedetails(id,brand,ownerName,location) values(?,?,?,?)";

		try {
			PreparedStatement ps = connet.prepareStatement(inserting);

			ps.setInt(1, entity.getId());
			ps.setString(2, entity.getBrand());
			ps.setString(3, entity.getOwnerName());
			ps.setString(4, entity.getLocation());

			executeUpdate = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return executeUpdate;
	}

	public int updateById(BikeEntity entity) {

		String updating = "update bikedetails set brand=?,ownerName=?,location=? where id=?";

		int executeUpdate = 0;
		try {
			PreparedStatement ps2 = connet.prepareStatement(updating);

			
			ps2.setString(1, entity.getBrand());
			ps2.setString(2, entity.getOwnerName());
			ps2.setString(3, entity.getLocation());
			ps2.setInt(4, entity.getId());

			executeUpdate = ps2.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return executeUpdate;
	}

	public int deleteById(int id) {
		int executeUpdate = 0;
		String deleting = "delete from bikedetails where id=?";

	
		try {
			PreparedStatement ps3 = connet.prepareStatement(deleting);
			ps3.setInt(1, id);

			executeUpdate = ps3.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return executeUpdate;
	}

	public BikeEntity selectById(int id) {

		String select = "select * from bikedetails where id=?";

		BikeEntity bikeEntity = new BikeEntity();

		try {
			PreparedStatement ps4 = connet.prepareStatement(select);

			ps4.setInt(1, id);

			ResultSet rs = ps4.executeQuery();

			if (rs.next()) {
				bikeEntity.setId(rs.getInt("id"));
				bikeEntity.setBrand(rs.getString("brand"));
				bikeEntity.setOwnerName(rs.getString("ownerName"));
				bikeEntity.setLocation(rs.getString("location"));
			} else {
				System.err.println("Bike Details not found");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return bikeEntity;
	}

	public List selectAll() {

		List<BikeEntity> list = new ArrayList<BikeEntity>();

		String selectall = "select * from bikeDetails";
		try {
			PreparedStatement ps5 = connet.prepareStatement(selectall);

			ResultSet rs = ps5.executeQuery(selectall);

			while (rs.next()) {
				BikeEntity bikeEntity = new BikeEntity();
				bikeEntity.setId(rs.getInt("id"));
				bikeEntity.setBrand(rs.getString("brand"));
				bikeEntity.setOwnerName(rs.getString("ownerName"));
				bikeEntity.setLocation(rs.getString("location"));

				list.add(bikeEntity);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
}
