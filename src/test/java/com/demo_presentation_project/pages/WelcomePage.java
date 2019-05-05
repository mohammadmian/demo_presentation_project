package com.demo_presentation_project.pages;

import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo_presentation_project.utilities.CustomCommands;
import com.demo_presentation_project.utilities.Driver;

public class WelcomePage {
	
	private WebDriver driver;
	
	private String url = "https://www.hulu.com/welcome";

	public WelcomePage() {
		this.driver = Driver.getInstance();
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "div>a.navigation__action-button[href]")
	public WebElement loginButton;
	
	public void navigateToWelcomePage() {
		driver.get(url);
	}

	public void assertLoginButtonIsVisible() {
		assertTrue(CustomCommands.waitForElementVisible(loginButton));
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
}
