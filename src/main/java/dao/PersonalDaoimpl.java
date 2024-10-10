package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import domain.Personal;

public class PersonalDaoimpl implements PersonalDao {
	private DataSource ds;

	public PersonalDaoimpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public List<Personal> findAll() throws Exception {
		List<Personal> personalList = new ArrayList<>();
		try(Connection con = ds.getConnection()) {
			String sql = "select * from personal_color";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				personalList.add(mapToPersonal(rs));
			}
	} catch (Exception e) {
		throw e;
	} return personalList;
}
	
	private Personal mapToPersonal(ResultSet rs) throws SQLException {
		Personal personal = new Personal();
		personal.setId(rs.getInt("id"));
		personal.setPersonalcolor(rs.getString("personalcolor"));
		personal.setColor(rs.getString("color"));
		personal.setEye(rs.getString("eye"));
		personal.setHair(rs.getString("hair"));
		personal.setSunburn(rs.getString("sunburn"));
		personal.setRip(rs.getString("rip"));
		personal.setPraise(rs.getString("praise"));
		personal.setImpress(rs.getString("impress"));
		personal.setAcce(rs.getString("acce"));
		personal.setRock(rs.getString("rock"));
		return null;
	}

	@Override
	public Personal findById(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public List<Personal> getAllpersonals() throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
}
