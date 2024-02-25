package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDAO {
//used for autogeneration of a reference for an object
	@Autowired
	EmployeeRepo repo;
	
	public Employee insert(Employee e) {
		return repo.save(e);
	}
	
	public List<Employee> getall(){
		return repo.findAll();
	}
	
	public List<Employee> insertall(List<Employee> emp){	//insert all records
		return repo.saveAll(emp);
	}
	
	public Optional<Employee> getbyid(int id){		//get record by id
		return repo.findById(id);
	}

	public void deletebyid(int id) {		//delete using id
		repo.deleteById(id);
	}

/*in jpa we dont have an inbuilt update command
	 * 1.fetch the data -find
	 * 2.set the new values
	 * 3.perform a insert operation-save
	 * 
	 * 1.fetch the data -find
	 * {
        "empno": 32,
        "empname": "kk",
        "phono": "123456"
    }->store it in an object->newemp
    2.set the new values
    with the object newemp -setempname with a new record of name-"karthik"
    3.insert 
	 * */
	//{32,"karthik"}->json
	
	public Employee updateByName(Employee e) {
		Employee ee=repo.findById(e.getEmpno()).orElse(null);
		ee.setEmpname(e.getEmpname());
		ee.setPhono(e.getPhono());
	return	repo.save(ee);
		
	}

	//customize query
	public String findbyname(String name,int id){
		return repo.findByname(name, id);
	}




	
}
