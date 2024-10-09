package dao;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class PersonalDaoFactory {

	public static PersonalDao createPersonalDao() {
		return new PersonalDaoimpl(getDataSource());
	}
	
	private static DataSource getDataSource() {
		DataSource ds = null;
		try {
			InitialContext ctx = new InitialContext();
			ds = 
					(DataSource) ctx.lookup("java:comp/env/jdbc/diagnosis_db");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ds;
	}
}