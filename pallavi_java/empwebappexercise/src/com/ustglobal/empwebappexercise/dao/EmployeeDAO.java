package com.ustglobal.empwebappexercise.dao;

import com.ustglobal.empwebappexercise.dto.EmployeeInfo;

public interface EmployeeDAO {
	public EmployeeInfo auth(int id,String password);
	public EmployeeInfo search(int id);
	public boolean changepassword(int id,String password);
	public boolean register(EmployeeInfo info); 
}
