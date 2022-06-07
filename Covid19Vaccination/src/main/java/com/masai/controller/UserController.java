package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.masai.model.User;
import com.masai.model.UserSession;
import com.masai.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService uService;
	
	@PostMapping("/users/register")
	public ResponseEntity<User> saveUserHandler(@RequestBody User user){
		
		User savedUser = uService.saveUser(user);
		return new ResponseEntity<User>(savedUser,HttpStatus.CREATED);
	}
	
	@GetMapping("/users/login")
	public ResponseEntity<UserSession> getUserHandler(@RequestBody User user){
		
		UserSession userLoggedin = uService.saveLogin(user);
		return new ResponseEntity<UserSession>(userLoggedin,HttpStatus.ACCEPTED);
	}
	
//	@PutMapping("/users/{key}")
//	public ResponseEntity<User> updateUserHandler(@RequestBody User user,@PathVariable String key){
//		
//		User updatedUser = uService.updateUser(user, key);
//		return new ResponseEntity<User>(updatedUser,HttpStatus.ACCEPTED);
//	}
	
//	@DeleteMapping("/users/logout/{key}")
//	public ResponseEntity<String> deleteUserHandler(@PathVariable String key){
//		String userLoggedout = uService.deleteSession(key);
//		return new ResponseEntity<String>("Logged out successfully",HttpStatus.ACCEPTED);
//	}

}
