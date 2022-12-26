package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Employee_Repository extends JpaRepository<Employee, Integer>{
	Employee getByName(String name);

	Employee findByName(String name);

}
