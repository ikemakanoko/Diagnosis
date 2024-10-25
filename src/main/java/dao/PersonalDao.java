package dao;

import java.sql.SQLException;
import java.util.List;

import domain.Personal;

public interface PersonalDao {
	//データの選択
	List<Personal> findAll() throws Exception;
	
	Personal findById(String string) throws Exception;

	Personal findByChoice(String string) throws SQLException;
	
	String questionTitle() throws Exception;
	
	String result() throws Exception;
	
	void insert(Personal personal) throws Exception;
	
	void update(Personal personal) throws Exception;
	
	void delete(Personal personal) throws Exception;

	
}