package com.demo_presentation_project.pages;

import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo_presentation_project.utilities.ConfigurationReader;
import com.demo_presentation_project.utilities.CustomCommands;
import com.demo_presentation_project.utilities.Driver;

import junit.framework.Assert;

public class LoginPage {

	private WebDriver driver;
	
	String url = "https://hulu.com";

	public LoginPage() {
		this.driver = Driver.getInstance();
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "input[name=email]")
	public WebElement usernameField;
	
	@FindBy(css = "input[name=password]")
	public WebElement passwordField;
	
	@FindBy(css = "button[class='jsx-3924730314 login-button']")
	public WebElement loginButton;
	
	@FindBy(css = "div[class='jsx-3924730314 error-message']")
	public WebElement ivalidCredentialsMessage;

	public void navigateToLoginPage() {
		driver.get(url);
	}
	
	public void checkLoginPageLoaded() {
		assertTrue(CustomCommands.waitForElementVisible(usernameField));
		assertTrue(CustomCommands.waitForElementVisible(passwordField));
	}

	public void login(String username, String password) {
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		loginButton.click();
	}

	public void assertInvalidLoginMessageIsVisible(String text) {
		assertTrue(CustomCommands.waitForElementVisible(ivalidCredentialsMessage));
		String actual = ivalidCredentialsMessage.getText();
		String expected = text;
		assertEquals(expected, actual);
	}
}
