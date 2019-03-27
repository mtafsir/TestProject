package com.Practice.demo.HelloWorld.copy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//controller
@RestController
public class HellowWorldController {
	
	//Get
	//URI - /hello-world
	//method - "Hello World"
	
	//@RequestMapping(method=RequestMethod.GET, path = "/hello-world")
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello World";
	}//end of helloWold
	
	//
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}//end of helloWorldBean
	
	
	//hello-world/path-variable/@PathMapping
	
	//String.format
	//String sf1=String.format("name is %s",name);  
	//String sf2=String.format("value is %f",32.33434); 
	
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s",name));
	}//end of helloWorldBean
	
	
	
	
	
}
