package com.example.test;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.example.main.AgeVerificationToVote;

public class AgeVerificationToVoteTest {
    static AgeVerificationToVote agetovote;
    
   //@BeforeClass-- it will ask to add static in method,which is costly
    
   @Before
   public  void setUp() {
  	 System.out.println("Object activated");
  	 agetovote=new AgeVerificationToVote();//reference    
   }
   
//@AfterClass(public static void) will do dereference only 1 time,
//i.e. after code completion
   
   @After
   public void dereference() {
  	 System.out.println("Dereferenced object");
  	agetovote=null;
  	 
   }

	@Test
	  public void testAgeVerfication1() {
		System.out.println("In 1st test case");
	   	 assertEquals("Right to vote!!",agetovote.ageCheck(20) );

	    }
	
	  @Test
	    public void testAgeVerfication2() {
		  System.out.println("In 2nd test case");
	   	 assertEquals("Not Eligible!!",agetovote.ageCheck(15) );
	    }



}
