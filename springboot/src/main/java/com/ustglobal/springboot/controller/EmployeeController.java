package com.ustglobal.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.springboot.dto.EmployeeBean;
import com.ustglobal.springboot.dto.EmployeeResponse;
import com.ustglobal.springboot.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping(path="/add",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE) 
	public EmployeeResponse addEmployee(@RequestBody EmployeeBean bean) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.addEmployee(bean)) {
			response.setStatuscode(201);//all 200 series-success
			response.setMessage("success");
			response.setDescription("data added to db");
		}else {
			response.setStatuscode(401);//all 200 series-success
			response.setMessage("failure");
			response.setDescription("data nt added to db");
			
		}
		return response;
	}//eoa
	
	@PutMapping(path="/modify",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse modifyEmployee(@RequestBody EmployeeBean bean) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.modifyEmployee(bean)) {
			response.setStatuscode(201);//all 200 series-success
			response.setMessage("success");
			response.setDescription("data updated to db");
		}else {
			response.setStatuscode(401);//all 200 series-success
			response.setMessage("failure");
			response.setDescription("data nt updated to db");
			
		}
		
		return response;
	}//eom
	
	@DeleteMapping(path="/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(@PathVariable("id")int id) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.deleteEmployee(id)) {
			response.setStatuscode(201);//all 200 series-success
			response.setMessage("success");
			response.setDescription("data deleted");
		}else {
			response.setStatuscode(401);//all 200 series-success
			response.setMessage("failure");
			response.setDescription("data nt deleted");
			
		}
		return response;
	}//eod
	
	@GetMapping(path="/get",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam("id")int id) {
		EmployeeResponse response = new EmployeeResponse();
		EmployeeBean bean = service.getEmployee(id);
		if(bean!=null) {
			response.setStatuscode(201);//all 200 series-success
			response.setMessage("success");
			response.setDescription("data found");
			response.setEmployeeBeans(Arrays.asList(bean));
		}else {
			response.setStatuscode(401);//all 200 series-success
			response.setMessage("failure");
			response.setDescription("data nt found");
		}
		return response;
	}//eoe
	@GetMapping(path="/get-all",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee(){
		EmployeeResponse response = new EmployeeResponse();
		List<EmployeeBean> beans = service.getAllEmployee();
		if(!beans.isEmpty()) {
			response.setStatuscode(201);//all 200 series-success
			response.setMessage("success");
			response.setDescription("data found");
			response.setEmployeeBeans(beans);
		}else {
			response.setStatuscode(401);//all 200 series-success
			response.setMessage("failure");
			response.setDescription("data nt found");
		}
		return response;
	}//eol    
	
	@GetMapping(path="/exce",produces = MediaType.APPLICATION_JSON_VALUE)
	public void createException(){
		int i = 1/0;
	}

}
