package com.listenerSmoke;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Demo_smoke {

	@Test
	public void testMethod01_smoke() {
		System.out.println("Hello World 01_smoke!!!");
		Assert.assertEquals(2, 3);
	}	
	
	@Test
	public void testMethod02_smoke() {
		System.out.println("Hello World 02_smoke!!!");
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



