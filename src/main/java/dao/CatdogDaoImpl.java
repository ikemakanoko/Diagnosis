package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import domain.Catdog;

public class CatdogDaoImpl implements CatDogDao {

	private DataSource ds;

	public CatdogDaoImpl(DataSource ds) {
		this.setDs(ds);
	}

	@Override
	public List<Catdog> findAll() {
		List<Catdog> catdogList = new ArrayList<>();

		try (Connection con = ds.getConnection()) {
			String sql = "SELECT * FROM diagnosis_db.animal_table";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				catdogList.add(mapToCatdog(rs));
			}
		} catch (Exception e) {

		}
		return catdogList;
	}

	@Override
	public Catdog findById(Integer id) throws Exception {
		List<Catdog> catdogList = new ArrayList<>();
		try (Connection con = ds.getConnection()) {
		String sql = "SELECT * from animal_table where ";
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		return null;
	}}

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	private Catdog mapToCatdog(ResultSet rs) throws Exception {
		Integer id = (Integer) rs.getObject("id");
		String animal = rs.getString("animal");
		String choice = rs.getString("choice");

		return new Catdog(id, animal, choice);

	}
}