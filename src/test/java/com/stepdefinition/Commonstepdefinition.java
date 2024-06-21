package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.pojo.Pojo_001Homepage;
import com.stat.Stat;
import com.utility.Utility;

import commonbrowser.Commonbrowser;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class Commonstepdefinition {

	// public static WebDriver driver;
	public static WebDriver driver;

	@Before
	public void Beforescenario() {
		try {
			Utility.getinstance().Loadproperties();
			Utility.getinstance().initwebelement();
			Commonbrowser.getDriver().get(Stat.APP_URL);
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public static void login() {
		try {
			Thread.sleep(10000);
			Pojo_001Homepage.gethomeinstance().getUsernamefield().sendKeys(Stat.USERNAME);
			Pojo_001Homepage.gethomeinstance().getPasswordfield().sendKeys(Stat.PASSWORD);
			Pojo_001Homepage.gethomeinstance().getLoginclick().click();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	

	}

	@AfterStep
	public void Attachscreenshot() {

	}

	@After
	public void Teardown() {
		Commonbrowser.getDriver().close();
	}

}
