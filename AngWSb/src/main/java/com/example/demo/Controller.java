package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class Controller {
	
	@Autowired
	BankRepo brepo;
	@Autowired
	AdminRepo arepo;
	@Autowired
	FoodRepo frepo;
	@Autowired
	UserRepo urepo;
	
	
	@PostMapping("/registerUser")
	public String registeruser(@RequestBody User user) {
		urepo.save(user);
		return "Hi "+user.getUfname()+" your are registered successfully!!";
	}
	
	@PostMapping("/registerAdmin")
	public String registeradmin(@RequestBody Admin admin) {
		arepo.save(admin);
		return "Hi "+admin.getAusername()+" your are registered successfully!!";
	}
	@PostMapping("/registerAllFood")
	public List<Food> registerallfood(@RequestBody List<Food> food) {
		return frepo.saveAll(food);
		}
	
	//list of users
	@GetMapping("/getAllusers")
	public List<User> findAllusers(){
		return urepo.findAll();
	}
	@GetMapping("/getAlladmin")
	public List<Admin> findAlladmin(){
		return arepo.findAll();
	}
	@GetMapping("/getAllFood")
	public List<Food> findAllFood(){
		return frepo.findAll();
	}
	
	//search with email
	@GetMapping("/findByFoodname/{name}")
	public List<Food> findUser(@PathVariable String name){
		return frepo.findByFoodname(name);
	}
	
	//delete the record
	@DeleteMapping("/cancel/{id}")
	public List<Food> deleteFood(@PathVariable int id){
		frepo.deleteById(id);
		return frepo.findAll();
	}


}
