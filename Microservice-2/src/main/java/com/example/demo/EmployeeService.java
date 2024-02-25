package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
@Autowired
EmpRepo repo;

public Employee insert(Employee e) {
	return repo.save(e);
}

public Employee findByUserNPwd(String user,String password) {
	return repo.findByUserNPwd(user, password);
}

public String dlt(Employee e) {
	 repo.delete(e);
	 return "Deleted!!";
}

public List<Employee> getAll(){
	return repo.findAll();
}
}
