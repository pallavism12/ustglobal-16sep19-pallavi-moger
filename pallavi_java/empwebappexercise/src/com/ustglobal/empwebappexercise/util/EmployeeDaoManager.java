package com.ustglobal.empwebappexercise.util;

import com.ustglobal.empwebappexercise.dao.EmployeeDAO;
import com.ustglobal.empwebappexercise.dao.EmployeeDaoJdbcImpl;

public class EmployeeDaoManager {
	private EmployeeDaoManager() {
		
	}
	
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDaoJdbcImpl();
	}
	

}
