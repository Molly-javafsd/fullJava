package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Toy;
import com.example.demo.repo.ToyRepo;

@Service
public class ToyDAO {
@Autowired
ToyRepo repo;


public Toy insert(Toy y) {
	return repo.save(y);
}


public List<Toy> insertall(List<Toy> y) {
	return repo.saveAll(y);
}

public List<Toy> getAll(){
	return repo.findAll();
}

public Optional<Toy> getById(int id) throws Exception{
	
		return repo.findById(id);
	
	
}


}
