package model.dao;

import enums.dao.EnumTipoDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static IPatternDao<?> createDaoJDBC(EnumTipoDao dao) {
		switch (dao) {
		case DEPARTMENT_DAO:
			return new DepartmentDaoJDBC();
		case SELLER_DAO:
			return new SellerDaoJDBC();
		default:
			return null;
		}		
		
	}
}
