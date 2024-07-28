package com.parallel;

import org.testng.annotations.Test;

public class ParallelClass02 {
	
	//A thread is an independent path of execution within a program
		  
	@Test
	public void test01() {		
		System.out.println("I am in test01_Class02 - ID: " + Thread.currentThread().getId());			
	}
	
	@Test
	public void test02() {		
		System.out.println("I am in test02_Class02 - ID: " + Thread.currentThread().getId());			
	}
	
	@Test
	public void test03() {		
		System.out.println("I am in test03_Class02 - ID: " + Thread.currentThread().getId());			
	}
					
}
