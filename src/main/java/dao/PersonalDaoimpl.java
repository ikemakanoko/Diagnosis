package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	public void insert(Personal personal) throws Exception {
		
	}

	@Override
	public void update(Personal personal) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void delete(Personal personal) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public List<Personal> findAll() throws Exception {
		List<Personal> personalList = new ArrayList<>();

		try (Connection con = ds.getConnection()) {
			String sql = "SELECT * FROM diagnosis_db.personal";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				personalList.add(mapToPersonal(rs));
			}
		} catch (Exception e) {

		}
		return personalList;
	}

	@Override
	public Personal findById(Integer id) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	private Personal mapToPersonal(ResultSet rs) throws Exception {
		Personal personal = new Personal(null, null, null, null, null, null, null);
		Integer id = (Integer) rs.getObject("id");
		String question = rs.getString("question");
		String choice1 = rs.getString("choice1");
		String choice2 = rs.getString("choice2");
		String choice3 = rs.getString("choice3");
		String choice4 = rs.getString("choice4");
		String result = rs.getString("result");
		
		return new Personal(id, question, choice1, choice2, choice3, choice4, result);
	}
}
