package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bankaccount;
import com.example.demo.repo.BankRepo;

@Service
public class BankDao {
	
	@Autowired
	BankRepo repo;
	
	
	public Bankaccount addBank(Bankaccount b)
	{
		return repo.save(b);
	}

}

