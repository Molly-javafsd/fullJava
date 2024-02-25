package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;

@Service
public class UserDao {

	
	@Autowired
	UserRepo repo;
	
	public String addUser(User u) {
		repo.save(u);
		return "Hi "+u.getName()+" Welcome to KictenStory";
	}
	
	public User login(String un){
		return repo.findByName(un);
	}

	
}
