package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

/**
 * @author Yadagiri Reddy
 * Explicit Wait in Selenium WebDriver?
 */
public class TestExplicitWait {
	public static void main(String[] args) throws Exception {
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().setSize(new Dimension(1000, 1000));
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		FluentWait<WebDriver> waitt = new FluentWait<WebDriver>(driver);
//		wait.withTimeout(Duration.ofSeconds(10));
		
		driver.get("https://testproject.io/");
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.linkText("Login")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			if(!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
//				Function<WebDriver, Boolean> f = new Function<WebDriver, Boolean>() {
//					@Override
//					public Boolean apply(WebDriver webDriver) {
//						return webDriver.findElement(By.id("username")).isDisplayed();
//					}
//				};
//				wait.until(f);
//				wait.until(d->d.findElement(By.id("username")).isDisplayed());
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
				driver.findElement(By.id("username")).sendKeys("HYR Tutorials");
			}
		}
	}
}