package LoginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DemoLogin {

	WebDriver driver = null;

	public DemoLogin (WebDriver driver) {

		this.driver = driver ;
	}

	By txt_username = By.xpath("//input[@id='user-name']");

	By txt_password = By.xpath("//input[@id='password']");

	By btn_login = By.xpath("//input[@id='login-button']");

    By menu_btn = By.id("react-burger-menu-btn");
    
    By logout_btn = By.id("logout_sidebar_link");
	
	public void enterUsername(String username) {

		driver.findElement(txt_username).sendKeys(username);

	}

	public void enterPassword(String password) {

		driver.findElement(txt_password).sendKeys(password);

	}
	public void clickLoginbtn() {

		driver.findElement(btn_login).click();

	}
	
	public void clickMenuAndLougotbtn () throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		WebElement menu = driver.findElement(menu_btn);
		
		action.moveToElement(menu).click().perform();
		
		Thread.sleep(3000);
		
		WebElement Logout = driver.findElement(logout_btn);
		
		action.moveToElement(Logout).click().perform();
		
}	
	} 
	
