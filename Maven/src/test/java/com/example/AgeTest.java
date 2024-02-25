package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgeTest {
//@Test tells that this method is a test method

	@Test
	public void test() {
		AgeValidation ag=new AgeValidation();
		assertEquals("Right to vote", ag.ageValid(19));
	}

}
