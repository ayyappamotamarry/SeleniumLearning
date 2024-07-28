package com.asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * An assertion is a statement in Java programming language 
 that enables you to test your expectation about your program.
 */

public class Assert01 {

	@Test
	public void maths() {
		int a = 20, b= 30;
		int sum = a+b;		
		Assert.assertEquals(sum, 50, "Addition was not Successful");		
	}
	
	@Test
	public void stringComparison() {
		String firstName= "Chandan", secondName= "Gupta";			
		Assert.assertEquals(firstName, "Chandan", "Name is not correct");	
		System.out.println("Hey I am below first assertion");
		Assert.assertTrue(firstName.equals("Chandan"));
		Assert.assertFalse(firstName.equals("Gupta"));
		Assert.fail();
	}
		
  }




