package dao;

import java.lang.reflect.Member;
import java.util.List;

import javax.sql.DataSource;

public class AnimalDaoImpl implements CatDogDao {

	private DataSource ds;

	public AnimalDaoImpl(DataSource ds) {
		this.setDs(ds);
	}

	@Override
	public List<Member> findAll() throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Member findById(Integer id) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}
}