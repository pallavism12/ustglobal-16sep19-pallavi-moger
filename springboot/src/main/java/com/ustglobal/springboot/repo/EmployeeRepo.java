package com.ustglobal.springboot.repo;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.ustglobal.springboot.dto.EmployeeBean;

public interface EmployeeRepo extends JpaRepository<EmployeeBean,Integer> {

	@Transactional
	@Modifying
	@Query("update EmployeeBean set name=:name, paasword=:paasword, gender=:gender, doj=:doj where id=:id")
	public void update(String name,String paasword,Date doj,String gender,int id);
	
	public EmployeeBean findByName(String name);
	
	public void deleteByName(String name);
}
