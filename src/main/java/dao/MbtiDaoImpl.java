package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import domain.Mbti;

public class MbtiDaoImpl implements MbtiDao {

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
		List<Mbti> mbtiList = new ArrayList<>();
		try (Connection con = ds.getConnection()) {
			String sql = "SELECT * FROM diagnosis_db.mbti";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			// ResultSetからデータを取り出し、Mbtiオブジェクトを作成してリストに追加
			while (rs.next()) {
				Mbti mbti = new Mbti();
				mbti.setId(rs.getInt("id")); // カラム名に合わせて適宜変更
				mbti.setType(rs.getString("type"));
				// 他のプロパティもここで設定する
				mbtiList.add(mbti);
			}
		} catch (Exception e) {
			e.printStackTrace(); // エラーがあれば出力して確認
		}
		return mbtiList;
	}

	//	@Override
	//	public List<Mbti> findAll() {
	//		List<Mbti> mbtiList = new ArrayList<>();
	//		try (Connection con = ds.getConnection()){
	//			String sql = "select * from mbti";
	//			PreparedStatement stmt = con.prepareStatement(sql);
	//			ResultSet rs = stmt.executeQuery();
	//		} catch (Exception e) {
	//			
	//		}
	//		return mbtiList;
	//	}

	@Override
	public Mbti findById(Integer id) throws Exception {
		List<Mbti> mbtiList = new ArrayList<>();
		try (Connection con = ds.getConnection()) {
			String sql = "select * from mbti where ";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
		} catch (Exception e) {
		}
		return null;
	}

	private Mbti mapToMbti(ResultSet rs) throws Exception {
		Integer id = (Integer) rs.getObject("id");
		String mbti = rs.getString("mbti");
		return new Mbti(id, mbti, mbti);
	}

}
