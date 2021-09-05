package com.qascript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo {

	@Parameters("Browser")
	@Test
	public void OpenBrowser(String browser) throws InterruptedException {

		System.out.println("Parameter Name is " + browser);
		WebDriver driver = null;

		if (browser.contains("Chrome")) {
			ChromeOptions chromeOptions = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(chromeOptions);
			System.out.println("Launch Chrome Browser");
		} else if (browser.contains("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println("Launch FF Browser");
		}

		else if (browser.contains("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			System.out.println("****Launch Edge Browser*******");
		}

		driver.manage().window().maximize();
		System.out.println("************Launch OHRM Application**************");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(4000);

		System.out.println("************Enter User name************");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		System.out.println("**********Enter password*********");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("************Submitted****************");
		Thread.sleep(4000);
		System.out.println("*********Title of the page is: " + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		driver.quit();
		System.out.println("********Browser: " + browser + " closed**********");
	}

}
