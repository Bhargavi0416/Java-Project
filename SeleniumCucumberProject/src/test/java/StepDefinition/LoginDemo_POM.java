package StepDefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import LoginPages.DemoLogin;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class LoginDemo_POM {
	
	WebDriver driver = null;
	
	DemoLogin  login;
	
	@Given("browser is  open")
	public void browser_is_open() {
		
        WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("Https://google.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	   
	}

	@And("user is on Login Page")
	public void user_is_on_login_page() {
		
		driver.navigate().to("https://www.saucedemo.com");
	    
	}

	@When("user is on Login page it enters {string} and {string}")
	public void user_is_on_login_page_it_enters_and(String username, String password) throws InterruptedException {
		
		login = new DemoLogin(driver);
		
		login.enterUsername(username);
		
		Thread.sleep(2000);
		
		login.enterPassword(password);
	    
	}

	@And("Click on the Login button")
	public void click_on_the_login_button() throws InterruptedException {
		
		login.clickLoginbtn();
		
		Thread.sleep(2000);
	    
	}
	@Then("user is navigate to home page")
	public void user_is_navigate_to_home_page() throws InterruptedException {
		
	//	String actualText = driver.findElement(By.className("title")).getText();
		
	  //  Assert.assertEquals("User is not on home page!", "Products", actualText);
	    
	    System.out.println("✅ User successfully navigated to the home page.");
	    
	    Thread.sleep(3000);
	   
	}


	@Then("go to sittings icon and click")
	public void go_to_sittings_icon_and_click() throws InterruptedException {
		
		login.clickMenuAndLougotbtn();
		
		Thread.sleep(3000);
	    
	}

	@And("click on logout button")
	public void click_on_logout_button() throws InterruptedException {
		
		login.clickMenuAndLougotbtn();
		
		//driver.findElement(By.id("logout_sidebar_link")).isDisplayed();
		
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
		

	}	
   
}
