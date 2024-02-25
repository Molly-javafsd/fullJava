package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Bankaccount;

public interface BankRepo extends JpaRepository<Bankaccount, Integer>{

}