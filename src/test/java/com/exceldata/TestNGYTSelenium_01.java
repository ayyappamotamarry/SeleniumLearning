package com.exceldata;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNGYTSelenium_01{

	WebDriver driver;

	@BeforeTest
	public void setUp() {		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().setPosition(new Point(1000,0));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/login");		
	}
	
	@Test(dataProvider="excel-data" , dataProviderClass = GetExcelData.class)
	public void signIn(String username, String password) {				
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//i[contains(text(),'Login')]")).click();
		String msg = driver.findElement(By.xpath("//div[@id='flash']")).getText();	
		
		Assert.assertEquals(msg.contains("is invalid!"), true);		
	}

	@AfterTest
	public void closeBrowser() {		
		driver.quit();
	}
	
}
