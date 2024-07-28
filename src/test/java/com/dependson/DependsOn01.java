package com.dependson;

import org.testng.annotations.Test;

public class DependsOn01  {

	@Test(groups="init")
	public void launchChrome(){
		System.out.println("launch Chrome");
	}
		
	@Test(groups="init")
	public void signIn(){
		System.out.println("Sign In");
		//Assert.assertEquals("actual", "expected");
	}
	
	@Test(groups="init")
	public void verifySuccessMessage(){
		System.out.println("verify Success Message");
	}
	
	@Test(groups="init")
	public void signOut(){
		System.out.println("sign Out");
	}
	
	@Test(dependsOnGroups="init")
	public void closeChrome(){
		System.out.println("Close Chrome");
	}
	
}
