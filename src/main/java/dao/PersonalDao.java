package dao;

import java.util.List;

import domain.Personal;

public interface PersonalDao {
	//データの選択
	List<Personal> findAll() throws Exception;
	
	Personal findById(Integer id) throws Exception;
	
	void insert(Personal personal) throws Exception;
	
	void update(Personal personal) throws Exception;
	
	void delete(Personal personal) throws Exception;
}