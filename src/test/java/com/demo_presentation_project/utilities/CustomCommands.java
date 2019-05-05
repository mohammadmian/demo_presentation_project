package com.demo_presentation_project.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomCommands {

	static WebDriverWait wait = new WebDriverWait(Driver.getInstance(), 20);
	
	public static boolean waitForElementVisible(WebElement element) {
		if(element != null) {
			try {
				wait.until(ExpectedConditions.visibilityOf(element));
				return true;
			} catch (Exception e) {
				return false;
			}
		} else {
			return false;
		}
	}
}
