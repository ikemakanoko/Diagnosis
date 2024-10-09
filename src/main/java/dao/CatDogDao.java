package dao;

import java.util.List;

import domain.Catdog;

public interface CatDogDao {
	//データの選択
	List<Catdog> findAll();
	Catdog findById(Integer id) throws Exception;
}
