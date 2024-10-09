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
	public List<Personal> findAll() {
		List<Personal> personals = new ArrayList<>();
		String sql = "select * from personal_color";
		Connection con = ds.getConnection(); 
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next());
			Integer id = rs.getInt("id");
			String personalcolor = rs.getString("personalcolor");
			String color = rs.getString("color");
			String eye = rs.getString("eye");
			String hair = rs.getString("hair");
			String sunburn = rs.getString("sunburn");
			String rip = rs.getString("rip");
			String praise = rs.getString("praise");
			String impress = rs.getString("impress");
			String acce = rs.getString("acce");
			String rock = rs.getString("rock");
			new Personal(id, personalcolor, color, eye, hair, sunburn, rip, praise, impress, acce, rock);
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
