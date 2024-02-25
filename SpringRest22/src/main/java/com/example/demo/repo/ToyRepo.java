package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Toy;

public interface ToyRepo extends JpaRepository<Toy, Integer>{

}
