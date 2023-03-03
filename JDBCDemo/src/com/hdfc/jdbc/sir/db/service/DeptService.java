package com.hdfc.jdbc.sir.db.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hdfc.jdbc.sir.db.Dept;
import com.hdfc.jdbc.sir.runner.DBUtil;

public class DeptService {

	Connection con = DBUtil.getDBConnection();

	public int insert(Dept dept) {

		int count = 0;

		String inputquries = "insert into department (dno,dname,location) values(?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(inputquries);

			ps.setInt(1, dept.getDno());
			ps.setString(2, dept.getDname());
			ps.setString(3, dept.getLocation());

			count = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
	}

	public int update(Dept dept) {

		int executeUpdate = 0;
		String update = "update department set dname=?,location=? where dno=?";

		try {
			PreparedStatement ps1 = con.prepareStatement(update);

			ps1.setString(1, dept.getDname());
			ps1.setString(2, dept.getLocation());
			ps1.setInt(3, dept.getDno());

			executeUpdate = ps1.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return executeUpdate;
	}

	public int deleteById(int dno) {

		int executeUpdate = 0;

		String delete = "delete from department where dno=?";
		try {
			PreparedStatement ps2 = con.prepareStatement(delete);

			ps2.setInt(1, dno);

			// boolean execute = ps2.execute();

			executeUpdate = ps2.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return executeUpdate;
	}

	public Dept selectById(int dno) {

		String select = "select * from department where dno=?";

		Dept dept = new Dept();

		try {
			PreparedStatement ps3 = con.prepareStatement(select);

			ps3.setInt(1, dno);

			ResultSet rs = ps3.executeQuery();

			if (rs.next()) {
				dept.setDno(rs.getInt("dno"));
				dept.setDname(rs.getString("dname"));
				dept.setLocation(rs.getString("location"));
			} else {
				System.err.println("Dept Not Found");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dept;

	}

	public List selectAll() {
		//Dept dept = new Dept();

		List<Dept> list = new ArrayList<Dept>();

		String selectAll = "select * from department";

		try {
			PreparedStatement ps4 = con.prepareStatement(selectAll);

			ResultSet rs2 = ps4.executeQuery(selectAll);

			while (rs2.next()) {
				Dept dept = new Dept();
				dept.setDno(rs2.getInt("dno"));
				dept.setDname(rs2.getString("dname"));
				dept.setLocation(rs2.getString("location"));

				list.add(dept);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

}
