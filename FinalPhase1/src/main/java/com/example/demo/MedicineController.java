package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Medicine;
import com.example.demo.service.MedicineService;

@CrossOrigin(origins="http://localhost:4200/")
@RestController
@RequestMapping("/api/medicine")
public class MedicineController {
	@Autowired
	private MedicineService service;
	
	@PostMapping("/")
	public ResponseEntity<Medicine> addmed(@RequestBody Medicine u){
		Medicine med= service.addMed(u);
		if(med!=null)
			return new ResponseEntity<Medicine>(med,HttpStatus.CREATED);
		else
			return new ResponseEntity<Medicine>(med,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@GetMapping("/")
	public List<Medicine> getAllMeds(){
		return service.getAllMeds();
	}
	@GetMapping("/{id}")
	public ResponseEntity<Medicine>getMedById (@PathVariable int id){
		Medicine med= service.getMedById(id);
		if(med!=null)
			return new ResponseEntity<Medicine>(med, HttpStatus.OK);
		else
			return new ResponseEntity<Medicine>(med, HttpStatus.NOT_FOUND);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateMed(@PathVariable int id,@RequestBody Medicine newMed){
		Medicine med= service.updateMed(id, newMed);
		
		if (med!=null)
			return new ResponseEntity<Object>(med,HttpStatus.OK);
		else
			return new ResponseEntity<Object>("No Medicine Available to Update",HttpStatus.NOT_FOUND);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String>deleteUser(@PathVariable int id){
		boolean result = service.deleteMed(id);
		if(result) 
			return new ResponseEntity<String>("Object Deleted",HttpStatus.OK);
		else
			return new ResponseEntity<String>("NO medicine Found", HttpStatus.NOT_FOUND);
		
	}
}
