package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.utility.Utility;
import commonbrowser.Commonbrowser;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Kesavan R\\eclipse-workspace\\com.cricmatch1\\src\\test\\resources\\Features\\Ezugi.feature", glue = {
		"com.stepdefinition" }, dryRun = false, monochrome = true,tags="@login1")

public class Runner {
	@BeforeClass
	public static void launch() {
		Utility.getinstance().Loadproperties();
		Utility.getinstance().initwebelement();
		Commonbrowser.launchBrowser();
	}

	@AfterClass
	public static void Quit() {
		Commonbrowser.getDriver().quit();
	}
}
