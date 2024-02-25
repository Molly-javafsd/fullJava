package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Food {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int fid;
	private String foodname;
	private int foodprice;
}
