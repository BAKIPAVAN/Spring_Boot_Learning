package com.springboot.Sampleproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Sampleproject.Service.UsersService;
import com.springboot.Sampleproject.model.Users;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	
	@Autowired
	private UsersService usersService;

	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<Users> saveUsers(@RequestBody Users users) {
		return new ResponseEntity<Users>(usersService.saveUsers(users), HttpStatus.CREATED);
	}

	// build all employee rest api
	@GetMapping
	public List<Users> getAllUsers() {
		return usersService.getAllUsers();
	}
	@PostMapping("/name")
	public List<Users> GetName(@RequestBody String name) {
		return usersService.getBYUserName(name);
	}
	


}
