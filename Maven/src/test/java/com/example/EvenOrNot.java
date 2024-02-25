package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class EvenOrNot {

	@Test
	public void test() {
		EvenOdd ev=new EvenOdd();
		assertEquals("Even",ev.isEven(6));
	}

}
