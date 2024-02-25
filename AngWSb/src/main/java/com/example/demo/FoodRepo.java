package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
public interface FoodRepo extends JpaRepository<Food, Integer>{
public List<Food> findByFoodname(String foodname);
}
