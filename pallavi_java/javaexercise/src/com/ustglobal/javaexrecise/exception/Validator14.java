package com.ustglobal.javaexrecise.exception;

public class Validator14 {
	void verify(int age) {
		if(age<18) {
			throw new InvalidAgeException14("try again");
		}
	}
}
