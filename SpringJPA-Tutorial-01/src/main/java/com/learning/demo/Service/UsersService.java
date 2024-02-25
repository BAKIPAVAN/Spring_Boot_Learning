package com.learning.demo.Service;

import java.util.List;

import com.learning.demo.model.Users;

public interface UsersService {

	Users saveUsers(Users employee);

	List<Users> getAllUsers();

	Users getUsersById(long id);

	Users updateUsers(Users employee, long id);

	void deleteUsers(long id);
	
	List<Users> getBYUserName(String name);
	
	
	
}
