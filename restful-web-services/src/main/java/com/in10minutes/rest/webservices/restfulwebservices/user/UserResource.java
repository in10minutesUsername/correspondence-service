package com.in10minutes.rest.webservices.restfulwebservices.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

//Step-08-Implementing GET Methods for User Resources
@RestController
public class UserResource {
	
	@Autowired
	private UserDaoService userDaoService;
	
	
	//retrieve All Users
	
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return userDaoService.findAll();
	}
	
	
	//retrieve User(int id)
	//GET  /user/{id}
	@GetMapping("/user/{id}")
	public User retrieveUser(@PathVariable int id) {
		return userDaoService.findOne(id);
	}
	
	//input-details of user
	//output- CREATED $ Return the created uRi
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@RequestBody User user) {
		User savedUser=userDaoService.save(user);
		
		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	
	

}
