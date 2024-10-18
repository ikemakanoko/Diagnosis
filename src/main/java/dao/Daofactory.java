package dao;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Daofactory {

	public static LocationDao createLocationDao() {
		return new LocationDaoImpl(getDataSource());
	}

	public static UserDao createUserDao() {
		return new UserDaoImpl(getDataSource());
	}

	public static CatDogDao createCatDogDao() {
		return new AnimalDaoImpl(getDataSource());
	}
	
	public static PersonalDao createPersonalDao() {
		return new PersonalDaoimpl(getDataSource());
	}
	
	public static MbtiDao createMbtiDao() {
		return new MbtiDaoImpl(getDataSource());
	}

	private static DataSource getDataSource() {
		InitialContext ctx = null;
		DataSource ds = null;
		try {
			ctx = new InitialContext();
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
