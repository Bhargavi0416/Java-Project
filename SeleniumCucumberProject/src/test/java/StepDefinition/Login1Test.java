package StepDefinition;

import io.cucumber.java.en.And;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login1Test {

	@Given("^User is on login page$") // here we using the regexp for start ^ and End $
	public void user_is_on_login_page() {

		System.out.println("User is on login page");

	}
	@When("the user is on login enters username and password")
	public void the_user_is_on_login_enters_username_and_password() {

		System.out.println("User enters the username and password on  login page");

	}
	@And("click the login button")
	public void click_the_login_button() {


		System.out.println(" here click on the login button ");

	}
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {


		System.out.println(" user is rediredted to the home page ");


	}}
