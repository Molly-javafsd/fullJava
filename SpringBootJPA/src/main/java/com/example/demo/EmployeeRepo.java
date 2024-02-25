package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;
												

													//<pojo classname , primary key type>
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {


}

