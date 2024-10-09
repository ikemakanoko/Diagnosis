package dao;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class AnimalDaoFactory {
	
	public static CatDogDao createCatDogDao() {
		return new AnimalDaoImpl(getDataSource());
		
	}
	private static DataSource getDataSource() {
		//オブジェクトを用意し、null(何を入れるか決めてない)をする　それをctx,dsに代入
		InitialContext ctx = null;
		DataSource ds = null;
		//try catchで囲む
		try {
			//naming属性
			ctx = new InitialContext();
			//データベースから目的のものを探す
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/diagnosis_db");
		} catch (NamingException e) {
			if (ctx != null) {
				try {
					ctx.close();
				} catch (NamingException e1) {
					throw new RuntimeException(e1);
				}
			}
			throw new RuntimeException(e);
		}
		return ds;
	}
}
