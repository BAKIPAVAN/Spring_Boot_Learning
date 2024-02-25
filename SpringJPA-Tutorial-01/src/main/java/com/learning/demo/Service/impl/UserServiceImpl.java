package com.learning.demo.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.learning.demo.Service.UsersService;
import com.learning.demo.model.Users;
import com.learning.demo.repository.UsersRepository;

@Service
public class UserServiceImpl implements UsersService{

	private UsersRepository usersRepo;
	
	

	public UserServiceImpl(UsersRepository usersRepo) {
		super();
		this.usersRepo = usersRepo;
	}

	@Override
	public Users saveUsers(Users users) {
		// TODO Auto-generated method stub
		return usersRepo.save(users);
	}

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
//		return usersRepo.findAll();
		System.out.println("________");
		return usersRepo.getAllRecords();
	}

	@Override
	public Users getUsersById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users updateUsers(Users employee, long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUsers(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Users> getBYUserName(String name) {
		// TODO Auto-generated method stub
		return usersRepo.getUserByName(name);
	}




}
