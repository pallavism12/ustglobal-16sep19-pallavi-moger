package com.ustglobal.javaexrecise.exception;

public class InvalidAgeException14 extends RuntimeException {
	String msg="invalid age below 18";

	@Override
	public String getMessage() {
		return msg;
	}
	public InvalidAgeException14() {

	}
	public   InvalidAgeException14(String msg) {
		this.msg=msg;
	}
}

