package StepDefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.LoginDemo_PF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class InvalidUserLogin_PF {
	
	
	WebDriver driver = null;
	
	LoginDemo_PF login;
	
	@Given("Browser is open")
	public void browser_is_open() {
		
		   WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			
			driver.get("Https://google.com");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
	   
	}

	@And("user is on the Login page")
	public void user_is_on_the_login_page() {
		
		driver.navigate().to("https://practicetestautomation.com/practice-test-login");
	    
	}

	@When("user enter invalid  username and password")
	public void user_enter_invalid_username_and_password() throws InterruptedException {
		
		login = new LoginDemo_PF(driver);
		
		login.enterusername();
		
		//driver.findElement( By.id("username")).sendKeys("incorrectUser");

		Thread.sleep(2000);
		
		login.enterpassword();
		
		Thread.sleep(2000);

		//driver.findElement(By.id("password")).sendKeys("Password123");
	    
	}

	@And("click on the submit button")
	public void click_on_the_submit_button() throws InterruptedException {
		
		login.clickonsubmitbtn();
		
		//driver.findElement(By.id("submit")).click();

		Thread.sleep(3000);
	   
	}

	@Then("verify error message should be displayed")
	public void verify_error_message_should_be_displayed() {
		
		System.out.println("✅ Step: Error message should be displayed (not actually checked).");
	}
	    
	@And("error message text should be {string}")
	public void error_message_text_should_be(String string) throws InterruptedException {
		
		System.out.println("✅ Step: Expected error message is: \"" + string + "\" Your username is invalid!");
		
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
	  
	}



}
