package com.listener;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Demo {

	@Test
	public void testMethod01() {
		System.out.println("Hello World 01!!!");
		Assert.assertEquals(2, 3);
	}	
	
	@Test
	public void testMethod02() {
		System.out.println("Hello World 02!!!");
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



