package com.springboot.Sampleproject.Service;

import java.util.List;

import com.springboot.Sampleproject.model.Users;

public interface UsersService {

	Users saveUsers(Users employee);

	List<Users> getAllUsers();

	Users getUsersById(long id);

	Users updateUsers(Users employee, long id);

	void deleteUsers(long id);
	
	List<Users> getBYUserName(String name);
	
	
	
}
