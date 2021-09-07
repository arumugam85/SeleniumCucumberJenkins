package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

	public static WebDriver driver;

	public LoginPage(WebDriver driver) {
		LoginPage.driver = driver;
	}

	By txtUsername = By.id("txtUsername");
	By txtPassword = By.id("txtPassword");
	By btnLogin = By.id("btnLogin");
	By btnLogOut = By.linkText("Logout");

	public void setUserName(String email) {
		driver.findElement(txtUsername).clear();
		driver.findElement(txtUsername).sendKeys(email);
		// txtUsername.clear();
		// txtUsername.sendKeys(email);

	}

	public void setPassWord(String password) {
		driver.findElement(txtPassword).clear();
		driver.findElement(txtPassword).sendKeys(password);
		// txtPassword.clear();
		// txtPassword.sendKeys(password);

	}

	public void clickLogin() {
		driver.findElement(btnLogin).click();

	}

	public void clickLogout() {
		driver.findElement(btnLogOut).click();

	}

}
