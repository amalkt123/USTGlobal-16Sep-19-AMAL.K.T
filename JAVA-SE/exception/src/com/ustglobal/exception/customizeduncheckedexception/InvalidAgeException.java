package com.ustglobal.exception.customizeduncheckedexception;

public class InvalidAgeException extends RuntimeException {
	private String message="invalid age below 18 years not allowed";
	public InvalidAgeException(String message) {
		this.message=message;
		// TODO Auto-generated constructor stub
	}
	public InvalidAgeException() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getMessage() {
		return message;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return message;
	}
	

}
