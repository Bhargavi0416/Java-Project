package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultiUserLogin {
	
	WebDriver  driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
		
		
        WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("Https://google.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	    
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
	   
		
		 driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		
	}

	@When("user is on Login page enters {string} and {string}")
	public void user_is_on_login_page_enters_username_and_password(String username, String password) throws InterruptedException {
		
	   driver.findElement(By.id("username")).clear();
       driver.findElement( By.id("username")).sendKeys(username);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
	   
		Thread.sleep(2000);
		
	}

	@And("click the sumbit button")
	public void click_the_sumbit_button() throws InterruptedException {
		
		
      driver.findElement(By.id("submit")).click();
		
		Thread.sleep(3000);
		
	   
	}

	@Then("it will navigate to home page")
	public void it_will_navigate_to_home_page() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("logged-in-successfully"));
		
		String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue("User not redirected to home page", currentUrl.contains("logged-in-successfully"));
		
	   
	}

	@And("user need to click the Logout button")
	public void user_need_to_click_the_logout_button() throws InterruptedException  {
		
		
		driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
	    
	}




}
