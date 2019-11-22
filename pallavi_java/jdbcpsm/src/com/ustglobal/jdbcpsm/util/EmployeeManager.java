package com.ustglobal.jdbcpsm.util;

import com.ustglobal.jdbcpsm.dao.EmployeeDAO;
import com.ustglobal.jdbcpsm.dao.EmployeeDAOImpl;

public class EmployeeManager {
	
	private EmployeeManager() {
		
	}
	
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOImpl();
	}

}
