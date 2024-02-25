package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Admin;
import com.example.demo.model.Bankaccount;
import com.example.demo.model.Category;
import com.example.demo.model.FoodItem;
import com.example.demo.model.User;
import com.example.demo.repo.BankRepo;
import com.example.demo.repo.FoodItemRepo;
import com.example.demo.service.AdminService;
import com.example.demo.service.BankDao;
import com.example.demo.service.CategoryDao;
import com.example.demo.service.FoodItemDao;
import com.example.demo.service.UserDao;

@RestController
@CrossOrigin(origins="http://localhost:4200/")
public class RestfulController {
	@Autowired
	AdminService dao;
	@Autowired
	BankDao bdao;
	@Autowired
	BankRepo repo;
	@Autowired
	CategoryDao cdao;
	@Autowired
	FoodItemDao fdao;
	@Autowired
	FoodItemRepo frepo;
	@Autowired
	UserDao udao;
	
	@PostMapping("/adminregister")
	public String addAdmin(@RequestBody Admin admin) {
		dao.insert(admin);
		return "Admin data inserted";
	}
	
	@GetMapping("/adminlogin/{un}")
	public Admin adminLogin(@PathVariable String un) {
		return dao.get(un);
		
	}
	
	
	
	@PostMapping("/addbank")
	public String addBank(@RequestBody  Bankaccount acc) {
		 bdao.addBank(acc);
		 return "bank added";
	}
	
	@GetMapping("/getallbank")
	public List<Bankaccount> getBanks(){
		return repo.findAll();
	}
	
	
	
	@PostMapping("/addcategory")
	public String addAdmin(@RequestBody Category c) {
		cdao.insertCate(c);
		return "Category added ";
	}
	
	@GetMapping("/getallcate")
	public List<Category> getAllCate()
	{
		return cdao.getAllCategory();
	}
	
	  

	 @PostMapping("/addfooditem")
	  public String addItem(@RequestBody FoodItem fi) {
		  fdao.addFood(fi);
		  return "food added";
	  }
	  
	  @GetMapping("/getallfood")
	  public List<FoodItem>  getAllItem(){
		  return fdao.getAllItem();
	  }
	  
	  @GetMapping("/getalltypefood/{type}")
	  public List<FoodItem>  getAllItemType(@PathVariable  String type){
		  return fdao.getTypeItem(type);
	  }
	  @GetMapping("/getallfoodbycategory/{cat}")
	  public List<FoodItem>  getAllItemCat(@PathVariable  String cat){
		  return fdao.getFoodByCategory(cat);
	  }
	  @GetMapping("/getfood/{fname}")
	  public List<FoodItem>  getFoodByName(@PathVariable  String fname){
			return fdao.getFoodByName(fname);
		}
	  
	  @GetMapping("/getfoodbyid/{id}")
	  public FoodItem  getFoodById(@PathVariable  int id){
			return frepo.getFoodById(id);
		}
	  
	  
	  @DeleteMapping("/deletefood/{id}")
	  public List<FoodItem> deleteFood(@PathVariable int id)
	  {
		  return fdao.deleteFood(id);
	  }

		
		
	@PostMapping("/adduser")
	public String addUser(@RequestBody  User u) {
	return	udao.addUser(u);
		}
		
		
	@GetMapping("/userlogin/{uname}")
	public User login(@PathVariable  String uname)
		{
	return	udao.login(uname);
		}
 }
	  





