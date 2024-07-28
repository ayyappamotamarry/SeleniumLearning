package com.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
      System.out.println("The test is starting : "+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	  System.out.println("The test was successfully executed/passed : "+ result.getName());
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
	   System.out.println("The test was FAILED : "+ result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("The test was Skipped : "+ result.getName());	
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("I am the first one to be executed : "+ context.getName());	
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("I am the last one to be executed : "+ context.getName());	
	}
	
	

}
