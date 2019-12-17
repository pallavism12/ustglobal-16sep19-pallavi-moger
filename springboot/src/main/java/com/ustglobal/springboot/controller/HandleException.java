package com.ustglobal.springboot.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.springboot.dto.EmployeeResponse;

@RestControllerAdvice
public class HandleException {

	@ExceptionHandler(Exception.class)
	public EmployeeResponse getException() {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatuscode(501);
		response.setMessage("errpr in code");
		response.setDescription("got an exception");
		return response;
	}
}
