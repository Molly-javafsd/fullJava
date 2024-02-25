package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Category;
import com.example.demo.repo.CategoryRepo;

@Service
public class CategoryDao {
	
	@Autowired
	CategoryRepo repo;
	
	public Category insertCate(Category c) {
		return repo.save(c);
	}
	
	public List<Category> getAllCategory(){
		return repo.findAll();
	}

}