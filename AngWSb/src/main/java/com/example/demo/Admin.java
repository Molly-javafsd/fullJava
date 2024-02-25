package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Admin {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private int aid;
private String ausername;
private String apassword;
}
