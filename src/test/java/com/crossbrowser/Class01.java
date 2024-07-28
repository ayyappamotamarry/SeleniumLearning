package com.crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;


public class Class01 {
	
	WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	public void init(String browser){
		
		switch (browser.toLowerCase()) {

		case "chrome":
//			System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
//			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();			
			break;
			
		case "ie":
			System.setProperty("webdriver.ie.driver", "drivers//IEDriverServer.exe");
			driver = new InternetExplorerDriver();			
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
			driver = new FirefoxDriver();			
			break;

		default:
			driver = null;
			break;
		}
						
	}
	
	@Test
	public void verifyPageTitle() {     
		driver.get("https://www.google.com");
		Assert.assertEquals(driver.getTitle(), "Google");
	}
			
	@AfterMethod
	public void tearDown() throws IOException{     
		driver.quit();	
		Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
	}
}
