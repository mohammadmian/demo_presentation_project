package com.demo_presentation_project.step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.demo_presentation_project.utilities.Driver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	
	@Before
	public void setUp(){
		Driver.getInstance().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown(Scenario scenario){
		if(scenario.isFailed()){
			final byte[] screenshot = ((TakesScreenshot)Driver.getInstance()).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png" );
		}
		Driver.closeDriver();
	}

}
