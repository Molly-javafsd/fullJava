package com.example.demo;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class JUnitExApplicationTests {

	@Autowired
	EmployeeDAO dao;
	
	@Ignore
	@Test
	public void test1() {
		System.out.println("Inside 1st test case");
		Employee e = new Employee();
		e.setEmpno(1);
		e.setEmpname("neha");
		e.setPhono("789544");
		assertNotNull(dao.insert(e));
	}

	@Test
	public void test2() {
		System.out.println("Inside 2nd test case");
		assertEquals("Deleted the id of 1", dao.deletebyid(1));
		
}
}