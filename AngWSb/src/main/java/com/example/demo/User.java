package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int uid;
	private String ufname;
	private String ulname;
	private String email;
	private String uusername;
	private String upassword;
}
