package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Medicine;
import com.example.demo.model.User;
import com.example.demo.repo.MedicineRepo;

@Service
public class MedicineService {
	@Autowired
	private MedicineRepo repo;
	
	public Medicine addMed(Medicine u) {
		return repo.save(u);
	}
	public List<Medicine> getAllMeds(){
		return repo.findAll();
	}
	public Medicine getMedById(int id) {
		if(repo.findById(id).isPresent()) {
			return repo.findById(id).get();
		}
		else {
			return null;
		}
		
	}
	public Medicine updateMed(int id, Medicine newMed) {
		if(repo.findById(id).isPresent()) {
			Medicine oldmed= repo.findById(id).get();
			oldmed.setName(newMed.getName());
			oldmed.setDescription(newMed.getDescription());
			oldmed.setCategory(newMed.getCategory());
			oldmed.setPrice(newMed.getPrice());
			
			return repo.save(oldmed);
		}
		else {
			return null;
		}
	}
	
	
	public boolean deleteMed(int id) {
		if(repo.findById(id).isPresent()) {
			repo.deleteById(id);
			return true;
		}
		
		else {
			return false;
		}
	}
}
