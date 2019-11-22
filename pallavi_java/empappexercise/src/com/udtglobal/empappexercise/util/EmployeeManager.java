package com.udtglobal.empappexercise.util;

import com.ustglobal.empappexercise.dao.EmployeeDAO;
import com.ustglobal.empappexercise.dao.EmployeeDaoImpl;

public class EmployeeManager {
	private EmployeeManager() {}
	
	public static EmployeeDAO getEmployeeDao() {
		return (EmployeeDAO) new EmployeeDaoImpl();
	}

}
