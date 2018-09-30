package com.in10minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping(path="/helloworld")
	public String helloWorld() {
		
		return "Hello World";
	}
	
	@GetMapping(path="/helloworld-bean")
	public HelloWorldBean helloWorldBean() {
		
		return new HelloWorldBean("Hello world");
	}
	
	@GetMapping(path="/helloworld/path-variable/{name}")
	public HelloWorldBean hellowWorldPathVariable(@PathVariable String name) {
		
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
	
	

}
