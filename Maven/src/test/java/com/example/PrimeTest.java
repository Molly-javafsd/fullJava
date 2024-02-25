package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeTest {

	@Test
	public void test() {
		PrimeOrNot pm=new PrimeOrNot();
		assertEquals( "Yes,its a prime number",pm.PrOrNt(19));
	}

}
