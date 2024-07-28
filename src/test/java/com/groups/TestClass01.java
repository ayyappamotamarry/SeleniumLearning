package com.groups;
import org.testng.annotations.Test;

@Test
public class TestClass01 {
	
	@Test(groups= {"module1_sanity"})
	public void Test01(){
		System.out.println("I am in Test 01");
	}
	
	@Test(groups= {"module1_smoke"})
	public void Test02(){
		System.out.println("I am in Test 02");
	}
	
	@Test(groups= {"module2_sanity","module1_smoke"})
	public void Test03(){
		System.out.println("I am in Test 03");
	}
	
	@Test(groups= {"module1_smoke"})
	public void Test04(){
		System.out.println("I am in Test 04");
	}
	
	@Test(groups= {"module2_smoke"})
	public void Test05(){
		System.out.println("I am in Test 05");
	}


}
