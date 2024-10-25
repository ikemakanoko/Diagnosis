package dao;

import java.util.List;

import domain.Mbti;

public interface MbtiDao {
	List<Mbti> findAll();

	Mbti findById(Integer id) throws Exception;
}