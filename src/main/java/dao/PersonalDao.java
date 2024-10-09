package dao;

import java.util.List;

import domain.Personal;

public interface PersonalDao {
	//データの選択
	List<Personal> findAll() throws Exception;
	
	Personal findById(Integer id) throws Exception;
	
	List<Personal> getAllpersonals() throws Exception;
}
