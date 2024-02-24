package com.springboot.Sampleproject.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Sampleproject.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee,Long> {

	
	

}
