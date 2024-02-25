package com.example.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

// Parameterized test
import com.example.main.AgeVerificationToVote;

@RunWith(Parameterized.class)
public class AgeVerficationToVoteParameterized {
	AgeVerificationToVote agetovote;
    @Before
    public  void setUp() {
   	 System.out.println("object activated");
   	 agetovote=new AgeVerificationToVote();
    }
    
    
    int input;
    String output;
        public AgeVerficationToVoteParameterized(int input, String output) {
        this.input = input;
        this.output = output;
    }
        @Parameterized.Parameters
        public static Collection testDataSet() {
       	 return Arrays.asList(new Object[][] {
       		 {23,"Right to vote!!"},
       		 {20,"Right to vote!!"},
       		 {-1,"Not Eligible!!"}    
       	 });
        }

	@Test
	public void test() {
		 assertEquals(output,agetovote.ageCheck(input));

	}

}
