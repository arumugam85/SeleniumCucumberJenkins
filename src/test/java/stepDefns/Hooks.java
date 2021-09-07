package stepDefns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks  {

	public static WebDriver driver=null ;

	@Before()
	public void setup() throws InterruptedException {
		System.out.println("Inside Setup method");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Launch Chrome Browser");
		driver.manage().window().maximize();	

	}

	@After()
	public void tearDown() {
		driver.quit();
	}

}
