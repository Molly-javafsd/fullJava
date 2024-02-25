package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDAO {
	@Autowired
	EmployeeRepo repo;
	
	public Employee insert(Employee e) {
		return repo.save(e);
	}
//	public Employee update(Employee e) {
//		repo.
//	}
	public String delete(Employee e) {
		repo.delete(e);
		return "deleted";
	}
	
	public List<Employee> getall(){
		return repo.findAll();
	}
	
	
}
