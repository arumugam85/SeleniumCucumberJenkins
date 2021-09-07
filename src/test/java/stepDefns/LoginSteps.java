package stepDefns;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class LoginSteps {

	public static WebDriver driver = null;
	LoginPage login = new LoginPage(Hooks.driver);

	public LoginSteps() {
		driver = Hooks.driver;

	}

	@Given("User open URL {string}")
	public void user_open_URL(String url) {
		System.out.println("************Launch OHRM Application**************");
		driver.get(url);
	}

	@When("User enter user id as {string} and password as {string}")
	public void user_enter_user_id_as_and_password_as(String email, String password) throws InterruptedException {
		Thread.sleep(3000);
		login.setUserName(email);
		login.setPassWord(password);
	}

	@When("Click Login button")
	public void click_Login_button() throws InterruptedException {
		login.clickLogin();
		Thread.sleep(3000);
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(title, driver.getTitle());
	}

	@And("Click logout link")
	public void click_logout_link() {
		login.clickLogout();
	}

}
