
package StepDefinition;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

//import dev.failsafe.internal.util.Assert;

import java.time.Duration;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;

public class PraticeLogin {


	WebDriver driver = null;
	@Given("Browser  is  open")
	public void browser_page_is_to_open() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("Https://google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}	
	@And("user is on the login page")
	public void user_is_on_the_login_page() {

		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");

	}
	
	@When("user is on login page enters username and Password")
	public void user_is_on_login_page_enters_username_and_password() throws InterruptedException {

		driver.findElement( By.id("username")).sendKeys("student");

		Thread.sleep(5000);

		driver.findElement(By.id("password")).sendKeys("Password123");

	}
	@And("user click the submit button")
	public void user_click_the_submit_button() throws InterruptedException {

		driver.findElement(By.id("submit")).click();

		Thread.sleep(3000);

	}
	@Then("it will navigate to the home page")
	public void it_will_navigate_to_the_home_page() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("logged-in-successfully"));

		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("User not redirected to home page", currentUrl.contains("logged-in-successfully"));
		// assertEquals(currentUrl.contains("logged-in-successfully"), "User not redirected to home page");

		//Thread.sleep(3000);

	}

	@And("URL should contain {string}")
	public void url_should_contain(String string) throws InterruptedException{//(String expectedUrlPart) {

		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("URL does not contain expected text!", currentUrl.contains(string));

		//.assertEquals(currentUrl.contains(string), "URL does not contain expected text!");

		//Thread.sleep(3000);
	}

	@And("page should display success message")
	public void page_should_display_success_message() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  
		
		WebElement heading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
		String successText = heading.getText();
		System.out.println("✅ Page Heading Text: " + successText);
		Assert.assertTrue("❌ Success message not found! Actual text: " + successText,
				successText.toLowerCase().contains("logged in successfully"));
	}	    
	@Then("Click on the Logout")
	public void click_on_the_logout() throws InterruptedException {
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			// Wait for the logout button to be visible and clickable
			WebElement logoutBtn = wait.until(ExpectedConditions.elementToBeClickable(

					By.xpath("//a[normalize-space()='Log out']")));

			logoutBtn.click();  // Click safely after wait

			// Optionally verify logout by checking URL or login button
			wait.until(ExpectedConditions.urlContains("practice-test-login")); // Redirect back to login page

		} catch (Exception e) {
			System.out.println("Logout failed: " + e.getMessage());
			Assert.fail("Logout step failed due to exception.");

		} finally {
			Thread.sleep(3000); // Let browser settle before closing
			driver.quit(); 


		}


	}}
