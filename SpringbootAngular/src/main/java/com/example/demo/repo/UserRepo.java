package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	List<User> findByEmail(String email);
	@Query("update User user set user.name=?1 where user.id=?2")
	User update(String name,int id);
	
	@Query("select user from User user where user.id=?1")
	User getbyIDHtml(int id);
	
}


