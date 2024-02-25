package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;

@RestController
@CrossOrigin(origins = "*")			//open to all other apps like vs-code
public class UserController {

	@Autowired
	UserRepo repo;
	
	//insert
	@PostMapping("/register")
	public String register(@RequestBody User user) {
		repo.save(user);
		return "Hi "+user.getName()+" your are registered successfully!!";
	}
	@PostMapping("/registerAll")
	public List<User> registerall(@RequestBody List<User> user){
		return repo.saveAll(user);
	}
	
	//list of users
	@GetMapping("/getAllusers")
	public List<User> findAllusers(){
		return repo.findAll();
	}
	
	//search with email
	@GetMapping("/findemail/{email}")
	public List<User> findUser(@PathVariable String email){
		return repo.findByEmail(email);
	}
	
	//delete the record
	@DeleteMapping("/cancel/{id}")
	public List<User> cancelregistration(@PathVariable int id){
		repo.deleteById(id);
		return repo.findAll();	//to get the remaining user list after deletion
	}
	
	//update record
	@PutMapping("/update/{name}/{id}")
	public User updateName(@PathVariable("name") String name,@PathVariable("id") int id) {
		User newUser=repo.getbyIDHtml(id);
		newUser.setName(name);
		return repo.save(newUser);
		
	}
	
}

