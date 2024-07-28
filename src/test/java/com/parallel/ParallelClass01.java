package com.parallel;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelClass01 {
	
	WebDriver driver;
	
	//A thread is an independent path of execution within a program		  
	@Test
	public void test01() {		
		System.out.println("I am in test01_Class01 - ID: " + Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().setPosition(new Point(1500,0));		
		driver.get("https://www.google.com/docs/about/");
	}
	
	@Test
	public void test02() {		
		System.out.println("I am in test02_Class01 - ID: " + Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().setPosition(new Point(1500,0));		
		driver.get("https://www.google.com");
	}
	
					
}
