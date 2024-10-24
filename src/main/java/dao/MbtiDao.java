package dao;

import java.util.List;

import domain.Mbti;

public interface MbtiDao {
	List<Mbti> findAll() throws Exception;

	Mbti findById(Integer id) throws Exception;
}