package dao;

public class PersonalDaoFactory {

	public static PersonalDao createPersonalDao() {
		return new PersonalDaoimpl();
	}
}