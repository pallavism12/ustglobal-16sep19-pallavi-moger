package com.ustglobal.jdbcpsm.dao;

import java.util.List;

import com.ustglobal.jdbcpsm.dto.EmployeeBean;

public interface EmployeeDAO {
	
	public List<EmployeeBean> getAllEmployeeDetails();
	public EmployeeBean searchEmployee(int id);
	public int insertEmpoyeeData(EmployeeBean bean);
	public int updateEmployeeData(EmployeeBean bean);
	public int deleteEmployeeData(int id);

}
