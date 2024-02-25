package com.example.demo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import ch.qos.logback.core.util.FileUtil;

@Service
public class CustomerServiceImpl {
	private final String folderPath="D:\\img\\";
	
	@Autowired
	private CustomerRepo repo;
	
	public Customer addCustomer(Customer cust) {
		return repo.save(cust);
	}

	public List<Customer> getAll() {
		return repo.findAll();
	}

}
