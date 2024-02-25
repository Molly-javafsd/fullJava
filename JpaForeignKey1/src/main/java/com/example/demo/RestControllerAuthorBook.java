package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerAuthorBook {
	@Autowired
	AuthorRepo repoa;
	
	@PostMapping("/insert")
	public Author insert(@RequestBody Author s) {
	return repoa.save(s);
}
	
	@GetMapping("/getalldata")
	public List<Author> getall(){
		return repoa.getalldetails();
	}
	
	@GetMapping("/getbookname/{name}")
	public String getbookname(@PathVariable("name") String name){
		return repoa.getbookname(name);
	}
}
