package com.SeleniumPractice;

import com.microsoft.edge.seleniumtools.EdgeDriver;
import com.microsoft.edge.seleniumtools.EdgeOptions;
import org.openqa.selenium.WebDriver;

/**
 * @author Yadagiri Reddy
 * How to maximize browser window in Selenium WebDriver?
 */
public class TestBrowserMaximization {
	public static void main(String[] args) throws Exception {
		// Way 1 - Chrome
		//		WebDriverManager.chromedriver().setup();
		//		WebDriver driver = new ChromeDriver();
		//		driver.manage().window().maximize();
		//		driver.get("https://www.google.com/");

		// Way 1 - Firefox
		//		WebDriverManager.firefoxdriver().setup();
		//		WebDriver driver = new FirefoxDriver();
		//		driver.manage().window().maximize();
		//		driver.get("https://www.google.com/");

		// Way 1 - Edge
		//		WebDriverManager.edgedriver().setup();
		//		WebDriver driver = new EdgeDriver();
		//		driver.manage().window().maximize();
		//		driver.get("https://www.google.com/");

		//Way 2 - Chrome
		//		WebDriverManager.chromedriver().setup();
		//		ChromeOptions options = new ChromeOptions();
		//		options.addArguments("start-maximized");
		//		WebDriver driver = new ChromeDriver(options);
		//		driver.get("https://www.google.com/");

		//Way 2 - Edge
//		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new EdgeDriver(options);
		driver.get("https://www.google.com/");
	}
}