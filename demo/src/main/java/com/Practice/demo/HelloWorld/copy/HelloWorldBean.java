package com.Practice.demo.HelloWorld.copy;

public class HelloWorldBean {
	private String message;


	//Constructor
	public HelloWorldBean(String message) {
		this.message=message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getMessage() {
		return message;
	}


	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}
	
	
}
