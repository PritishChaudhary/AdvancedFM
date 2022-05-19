package com.practice.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("User launches the App")
	public void user_launches_the_app() {
	    System.out.println("User launches the App");
	}

	@When("User enters correct credentials")
	public void user_enters_correct_credentials() {
	    System.out.println("User enters correct credentials");
	}

	@Then("User should see success message")
	public void user_should_see_success_message() {
	    System.out.println("User should see success message");
	}

	@When("User enters invalid credentials")
	public void user_enters_invalid_credentials() {
	   System.out.println("User enters invalid credentials");
	}

	@Then("User should see error message")
	public void user_should_see_error_message() {
	    System.out.println("User should see error message");
	}

}
