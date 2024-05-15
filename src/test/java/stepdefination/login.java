package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {

	WebDriver driver;

	@Given("open browser and enter url")
	public void open_browser_and_enter_url() {
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");

	}

	@When("user enter valid username")
	public void user_enter_valid_username() {
		WebElement usernameField = driver.findElement(By.id("Email"));
		usernameField.clear();
		usernameField.sendKeys("admin@yourstore.com");
	}

	@And("User enter  valid password")
	public void User_enter_valid_password() {
		WebElement passwordFiled = driver.findElement(By.id("Password"));
		passwordFiled.clear();
		passwordFiled.sendKeys("admin");
	}

	@When("user click on loginButton")
	public void user_click_on_loginButton() {
		WebElement btn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		btn.click();
	}

	@Then("it should naviagate to Dashboardpage")
	public void it_should_naviagate_to_Dashboardpage() {

		String actualvalue = driver.getTitle();
		String Expectedvalue = "Dashboard / nopCommerce administration";
		Assert.assertEquals(Expectedvalue, actualvalue);

	}

	@When("user enter invalid username")
	public void user_enter_invalid_username() {
		WebElement usernameField = driver.findElement(By.id("Email"));
		usernameField.clear();
		usernameField.sendKeys("scjsbcsbcks");
	}

	@When("user enter invalid password")
	public void user_enter_invalid_password() {
		WebElement passwordFiled = driver.findElement(By.id("Password"));
		passwordFiled.clear();
		passwordFiled.sendKeys("scjsbc");
	}

	@Then("it should throw error message as Invalid username and password")
	public void error_message() {

		String actual = driver.findElement(By.id("Email-error")).getText();
		String Expected = "invalid username and password";
		Assert.assertEquals(Expected, actual);

	}

	@When("user click on catalog")
	public void user_click_on_catalog() {
		driver.findElement(By.xpath("//i[@class=\"nav-icon fas fa-book\"]")).click();
	}

	@And("User click on Product link")
	public void User_click_on_Product_link() throws InterruptedException {
		driver.findElement(By.xpath("//a[@href=\"/Admin/Product/List\"]")).click();
		Thread.sleep(2000);
	}

	@Then("it should naviagte to Productpage and title product nop commerces")
	public void it_should_naviagte_to_Productpage_and_title() {
		String Expected = "Products / nopCommerce administration";
		String actual = driver.getTitle();
		System.out.println(actual);
		Assert.assertEquals(actual, Expected);
	}
	
	@When("user enter {string}")
	public void user_enter(String uname) {
		WebElement usernameField = driver.findElement(By.id("Email"));
		usernameField.clear();
		usernameField.sendKeys(uname);
	}
	@When("user entered {string}")
	public void user_entered(String pwd) {
		WebElement passwordFiled = driver.findElement(By.id("Password"));
		passwordFiled.clear();
		passwordFiled.sendKeys(pwd);
	}

	@Then("it should display the result")
	public void it_should_display_the_result() {
		System.out.println("result");
	}
	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	}



}
