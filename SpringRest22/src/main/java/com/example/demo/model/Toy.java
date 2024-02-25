package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Toy {
	@Id
	private int tid;
	private String tname;
	private String forGender;
	
}
