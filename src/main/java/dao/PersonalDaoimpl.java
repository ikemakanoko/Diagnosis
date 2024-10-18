package dao;

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
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Personal findById(Integer id) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
//
//	private Personal mapToPersonal(ResultSet rs) throws Exception {
//		Integer id = (Integer) rs.getObject("id");
//		String personal_color = rs.getString("personal_color");
//		String color = rs.getString("color");
//		String eye = rs.getString("eye");
//		String hair = rs.getString("hair");
//		String sunburn = rs.getString("sunburn");
//		String rip = rs.getString("rip");
//		String praise = rs.getString("praise");
//		String impress = rs.getString("impress");
//		String acce = rs.getString("acce");
//		String rock = rs.getString("rock");
//
//		return new Personal(id, personal_color);
//	}
//		try(Connection con = ds.getConnection()){
		//			String sql ="INSERT INTO personal"
		//					+ " (id, personal_color, color, eye, hair, sunburn, rip, praise, impress, acce, rock)"
		//					+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		//			PreparedStatement stmt = con.prepareStatement(sql);
		//			stmt.setString(1, personal.getPersonalcolor());
		//			stmt.setString(2, personal.getColor());
		//			stmt.setString(3, personal.getEye());
		//			stmt.setString(4, personal.getHair());
		//			stmt.setString(5, personal.getSunburn());
		//			stmt.setString(6, personal.getRip());
		//			stmt.setString(7, personal.getPraise());
		//			stmt.setString(8, personal.getImpress());
		//			stmt.setString(9, personal.getAcce());
		//			stmt.setString(10, personal.getRock());
		//			stmt.executeUpdate();
		//		} catch (Exception e) {
		//			throw e;
		//		}	
}
