

import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleLoginSteps {
	
	 
	WebDriver driver = null;
	
	
	@Given("browser is to open")
	public void browser_is_to_open() {
		
		System.out.println("Browser is on open");
		
		WebDriverManager.chromedriver().setup();
		
		driver =  new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	   
	}

	@And("user is on Login page")
	public void user_is_on_login_page() {
		
		driver.navigate().to("https://gmail.com");
	    
	}

	@When("user is on login page enters the username and Password")
	public void user_is_on_login_page_enters_the_username_and_password() {
		
		//Actions Action = new Actions(driver);
		WebElement Signinbtn = driver.findElement(By.xpath("//a[@class='button button--medium header__aside__button button--desktop button--tablet button--mobile']"
                + "//span[@class='button__label'][normalize-space()='Sign in']"));
		
		//Action.moveToElement(Signinbtn).click().perform();
		
		
		//WebElement emailbox = 
				
		driver.findElement(By.id("//input[@id='identifierId']")).sendKeys("bhargavibingi03@gmail.com");
	   // emailbox.sendKeys("bhargavibingi03@gmail.com");
	   
	}
	@And("user click on login page")
	public void user_click_on_login_page() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		
		//Thread.sleep(20000);
		
	   
	}

	@Then("it will redirect to the homepage")
	public void it_will_redirect_to_the_homepage() {
		
		
		driver.close();
		driver.quit();
	   
	}



}
