package com.springboot.Sampleproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboot.Sampleproject.model.Users;


@Repository
public interface UsersRepository extends JpaRepository<Users,Long>{
	
	@Query(value ="SELECT * FROM USERS",nativeQuery=true)
	public List<Users> getAllRecords();
	
	@Query(value ="SELECT * FROM USERS WHERE USER_NAME=:n",nativeQuery=true)
	public List<Users> getUserByName(@Param("n") String name);

}
