package com.demo_presentation_project.step_definitions;

import org.openqa.selenium.WebDriver;

import com.demo_presentation_project.pages.LoginPage;
import com.demo_presentation_project.pages.WelcomePage;
import com.demo_presentation_project.utilities.ConfigurationReader;
import com.demo_presentation_project.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoStepDefinitions {
	
	WebDriver driver = Driver.getInstance();
	WelcomePage welcomePage = new WelcomePage();
	LoginPage loginPage = new LoginPage();
	
	@Given("^The user has navigated to the login page$")
	public void the_user_has_navigated_to_the_ligin_page() throws Throwable {
	    welcomePage.navigateToWelcomePage();
	    welcomePage.assertLoginButtonIsVisible();
	    welcomePage.clickLoginButton();
	    loginPage.checkLoginPageLoaded();
	    
	}

	@When("^The user clicks login after entering invalid username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void the_user_clicks_login_after_entering_invalid_username_and_password(String username, String password) throws Throwable {
		loginPage.login(username, password);
	}
	
	@Then("^The user should see the invalid username or password message as \"([^\"]*)\"$")
	public void the_user_should_see_the_invalid_username_or_password_message_as(String text) throws Throwable {
		loginPage.assertInvalidLoginMessageIsVisible(text);
	}



}
