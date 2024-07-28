package com.asserts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	@Test
	public void maths() {
		SoftAssert softAssert= new SoftAssert();
		
		int a = 50, b= 30;
		int sum = a+b;		
		softAssert.assertEquals(sum, 20, "Addition was not Successful");
		
		int sub = a-b;
		softAssert.assertEquals(sub, 30, "Substraction was not Successful");
		
		int multiply = a*b;
		softAssert.assertEquals(multiply, 150, "Multiplication was not Successful");
		
		softAssert.assertAll();
	}
	
	@Test
	public void selenium() {
		SoftAssert softAssert02= new SoftAssert();
		System.out.println("Open Chrome");
		System.out.println("Launch amazom.com");
		softAssert02.assertEquals("Amazon123","Amazon","Page title is not correct");
		System.out.println("Sign In");
		softAssert02.assertEquals("Welcome Amazon","Welcome Amazon","Home Page title is not correct");
		System.out.println("Sign Out");
		System.out.println("Close Chrome");
		softAssert02.assertAll();
	}
	
}
