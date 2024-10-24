package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import domain.Mbti;

public class MbtiDaoImpl implements MbtiDao{

	private DataSource ds;
	
	public MbtiDaoImpl(DataSource ds) {
		this.setDs(ds);
	}
	
	private void setDs(DataSource ds2) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	public DataSource getDs() {
		return ds;
	}

	@Override
	public List<Mbti> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Mbti findById(Integer id) throws Exception {
		List<Mbti> mbtiList = new ArrayList<>();
		try (Connection con = ds.getConnection()){
			String sql = "select * from mbti where id=?;";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
		} catch (Exception e) {
		}
		return null;
	}
	private Mbti mapToMbti(ResultSet rs) throws Exception {
		Integer id = (Integer) rs.getObject("id");
		String mbti = rs.getString("mbti");
		String choice = rs.getString("choice");
		return new Mbti(id, mbti);
	}

}
