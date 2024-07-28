package com.listenerRegression;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Demo_reg {

	@Test
	public void testMethod01_reg() {
		System.out.println("Hello World 01_reg!!!");
		Assert.assertEquals(2, 3);
	}	
	
	@Test
	public void testMethod02_reg() {
		System.out.println("Hello World 02_reg!!!");
		Assert.assertEquals(2, 2);
	}
}

/**
 * do something before test starts
 * and then I want to execute test
 * do something after your test PASSED
 * do something if the test is failed
 * do something if the test is skipped
 */



