package dao;

import java.util.List;

import domain.Personal;

public interface PersonalDao {
	//データの選択
	static List<Personal> findAll() throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	
	Personal findById(Integer id) throws Exception;
}
