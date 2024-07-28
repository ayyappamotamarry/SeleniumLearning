package com.annotations;

import org.testng.annotations.*;

public class TestNGDemoClass2 {
	
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("Before Method - Sign In ");
	}
	 
	@AfterMethod
	public void afterMethod() {
	System.out.println("After Method - Sign Out");
	}
			 
	@BeforeClass
	public void beforeClass() {
	System.out.println("Before Class- Open Web Application");
	}
	 
	@AfterClass
	public void afterClass() {
	System.out.println("After Class - Close Web Application ");
	}
	 
	@BeforeTest
	public void beforeTest() {
	System.out.println("Before Test - create DB connection, Open Chrome");
	}
	 
	@AfterTest
	public void afterTest() {
	System.out.println("After Test - Close DB Connections, Close Chrome");
	}
	 
	@BeforeSuite
	public void beforeSuite() {
	System.out.println("Before Suite- Chrome SetUp- system property, initialize Report");
	}
	 
	@AfterSuite
	public void afterSuite() {
	System.out.println("After Suite- Clean up all cookies, Create Report, Send Mail");
	}
	
	@Test
	public void testCase1() {
	System.out.println("Search for Product");
	}
		 
	@Test
	public void testCase2() {
	System.out.println("Add to Cart");
	}
	 
	
}
