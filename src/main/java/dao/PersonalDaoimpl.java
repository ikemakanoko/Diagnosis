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
			String sql = "SELECT color FROM diagnosis_db.personal where id = 5";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				//personalList.add(mapToPersonal(rs));
			}
		} catch (Exception e) {

		}
		return personalList;
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
	
	public Personal findByChoice(String choice) throws SQLException {
		String sql = "SELECT * FROM personal WHERE choice = ?";
		try (Connection conn = getConnection();
		    PreparedStatement stmt = conn.prepareStatement(sql)) {
		    stmt.setString(1, choice);
		        try (ResultSet rs = stmt.executeQuery()) {
		            if (rs.next()) {
		                return new Personal(
		                    rs.getInt("id"),
		                    rs.getString("choice"),
		                    rs.getString("result"), sql, sql, sql, sql
		                );
		            }
		        }
		    }
		    return null; // 該当する結果が見つからない場合
		}

	private Connection getConnection() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Personal findById(String string) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public String questionTitle() throws Exception {
		String titleString = "";
		try (Connection con = ds.getConnection()) {
			String sql = "SELECT color FROM diagnosis_db.personal where id = 5";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				titleString = rs.getString("color");
				//personalList.add(mapToPersonal(rs));
			}
		} catch (Exception e) {

		}
		return titleString;
	}

	}
