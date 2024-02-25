package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Toy;
import com.example.demo.service.ToyDAO;

@RestController
public class ToyRestController {
@Autowired
ToyDAO dao;

@PostMapping("/insert")
public Toy insert(@RequestBody Toy t) {
	return dao.insert(t);
}

@PostMapping("/insertall")
public List<Toy> insert(@RequestBody List<Toy> t) {
	return dao.insertall(t);
}

@GetMapping("/getall")
public List<Toy> getall() {
	return dao.getAll();
}

@GetMapping("/getbyid/{id}")
public Optional<Toy> getById(@PathVariable("id") int id) throws Exception {
	if(dao.getById(id).isEmpty()) {
		throw new Exception("Id IS UNAVAILABLE!!");
	}
	else {
		return dao.getById(id);
	}

}
}
