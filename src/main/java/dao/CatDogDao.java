package dao;

import java.lang.reflect.Member;
import java.util.List;

public interface CatDogDao {
	//データの選択
	List<Member> findAll() throws Exception;
	
	Member findById(Integer id) throws Exception;
}
