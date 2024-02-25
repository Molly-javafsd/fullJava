package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AuthorRepo extends JpaRepository<Author, Integer>{
String query="select a from Author a join a.book b";
String query1="select b.bname from Author a join a.book b where a.aname=?1";
	
	@Query(query)
	public List<Author> getalldetails();
	@Query(query1)
	public String getbookname(String name);
	
}
