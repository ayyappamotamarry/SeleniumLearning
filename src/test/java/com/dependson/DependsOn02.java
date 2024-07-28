package com.dependson;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DependsOn02 {

	WebDriver driver;
	
	@Test
	public void launchChrome(){
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().setPosition(new Point(1000,0));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/login");	
	}
		
	@Test(dependsOnMethods = "launchChrome")
	public void signIn(){		
		System.out.println("Sign In");
		Assert.assertEquals("actual", "expected");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//i[contains(text(),'Login')]")).click();
		//Assert.assertEquals("actual", "expected");
	}
	
	@Test(dependsOnMethods = "signIn")
	public void verifySuccessMessage(){
		System.out.println("verify Success Message");
		String msg = driver.findElement(By.xpath("//div[@id='flash']")).getText();		
		Assert.assertEquals(msg.contains("You logged into a secure area!"), true);	
	}
	
	@Test(dependsOnMethods = {"verifySuccessMessage","signIn"})
	public void LogOut(){
		System.out.println("Log Out");
		driver.findElement(By.xpath("//i[contains(text(),'Logout')]")).click();
	}
	
	@Test(alwaysRun = true)
	public void closeChrome(){
		System.out.println("close Chrome");
		driver.quit();
	}
	
	
}
