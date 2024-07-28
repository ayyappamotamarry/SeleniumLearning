package com.asserts;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Assert02 {

	WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();		
		driver.manage().window().setPosition(new Point(1000,0));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/login");	
	}
		
	@Test
	public void testApp(){
		SoftAssert softAssert= new SoftAssert();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
		System.out.println("Signing in");
		driver.findElement(By.xpath("//i[contains(text(),'Login')]")).click();			
		String msg = driver.findElement(By.xpath("//div[@id='flash']")).getText();		
		softAssert.assertEquals(msg.contains("You logged into a secure area!!!"), true);
		System.out.println("Sign In was successful");		
		
		driver.findElement(By.xpath("//i[contains(text(),'Logout')]")).click();
		String msglogout = driver.findElement(By.xpath("//div[@id='flash']")).getText();
		System.out.println("Signing out");
		softAssert.assertEquals(msglogout.contains("You logged out of the secure area!!!"), true);	
		System.out.println("Sign out was successful");	
		softAssert.assertAll();
	}
			
	
	@AfterTest
	public void closeChrome(){
		System.out.println("Close Chrome");
		driver.quit();
	}
}
