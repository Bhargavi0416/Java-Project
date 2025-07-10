package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginDemo_PF {
	
	
	@FindBy(xpath = "//input[@id='username']")
	WebElement txt_username;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement txt_password;
	
	@FindBy(xpath = "//button[@id='submit']")
	WebElement submit_btn;
	
	WebDriver driver;
	
	public LoginDemo_PF(WebDriver driver1) {
		
		this.driver = driver1;	
		PageFactory.initElements(driver,this);
		
	}
	
	public void enterusername() {
		
		txt_username.sendKeys("incorrectUser",Keys.ENTER);
		
	}
	public void enterpassword() {
		
		txt_password.sendKeys("Password123",Keys.ENTER);
		
	}
	
	public void clickonsubmitbtn() throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		action.moveToElement(submit_btn).click().perform();
		
		Thread.sleep(2000);
	}
	
}
