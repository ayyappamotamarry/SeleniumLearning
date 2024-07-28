package com.listener;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Demo2 {

	@Test
	public void testMethod03() {
		System.out.println("Hello World 03!!! - Demo2");
		Assert.assertEquals(2, 3);
	}	
	
	@Test
	public void testMethod04() {
		System.out.println("Hello World 04!!! - Demo2");
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



