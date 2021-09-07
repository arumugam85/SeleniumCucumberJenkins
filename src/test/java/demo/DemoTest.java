package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {

	@Test
	public void loginAplication() throws InterruptedException {

		WebDriver driver = null;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Launch Chrome Browser");

		driver.manage().window().maximize();
		System.out.println("************Launch OHRM Application**************");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);

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

	}

}
