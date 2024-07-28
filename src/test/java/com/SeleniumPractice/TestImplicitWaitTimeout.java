package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * @author Yadagiri Reddy
 * ImplicitWaitTimeout in Selenium WebDriver?
 */
public class TestImplicitWaitTimeout {
	public static void main(String[] args) throws Exception {
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.manage().window().setSize(new Dimension(1000, 1000));
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("txt1")).sendKeys("HYR");
		
	}
}