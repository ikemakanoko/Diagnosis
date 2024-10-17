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
	
	public PersonalDaoimpl (DataSource ds) {
		this.ds = ds;
	}

	@Override
	public List<Personal> findAll() throws Exception {
		List<Personal> personalList = new ArrayList<>();
		
		try(Connection con = ds.getConnection()) {
			String sql = "SELECT"
			+ " personal.id, personal.personal_color, personal.color,"
			+ " personal.eye, personal.hair, personal.sunburn,"
			+ " personal.rip, personal.praise, personal.impress,"
			+ " personal.acce, personal.rock";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				personalList.add(mapToPersonal(rs));
			}
		} catch (Exception e) {
			throw e;
		}
		return personalList;
	}

	@Override
	public Personal findById(Integer id) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void insert(Personal personal) throws Exception {
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

	@Override
	public void update(Personal personal) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void delete(Personal personal) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	private Personal mapToPersonal(ResultSet rs) throws Exception{
		Integer id = (Integer) rs.getObject("id");
		String personal_color = rs.getString("personal_color");
		String color = rs.getString("color");
		String eye = rs.getString("eye");
		String hair = rs.getString("hair");
		String sunburn = rs.getString("sunburn");
		String rip = rs.getString("rip");
		String praise = rs.getString("praise");
		String impress = rs.getString("impress");
		String acce = rs.getString("acce");
		String rock = rs.getString("rock");
		
		return new Personal(id, personal_color, color, eye, hair, sunburn, rip, praise, impress, acce, rock);
	}
	}
