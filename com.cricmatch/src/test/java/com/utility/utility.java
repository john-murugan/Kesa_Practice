package com.utility;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stat.Stat;



import common.stepdefinition.Browsersetup;

public class utility {
	
	
	private static utility utilinstance = null;

	private utility() {
	}
	public static utility getinstance() {
		if (utilinstance == null)
			utilinstance = new utility();
		return utilinstance;
	}
	
	public void Loadproperties() {
		
		Properties prop= new Properties();
		try {
			prop.load(getClass().getResourceAsStream("/Stat.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	Stat.APP_URL=prop.getProperty("APP_URL");
	Stat.BROWSER=prop.getProperty("BROWSER");
	Stat.USERNAME=prop.getProperty("USERNAME");
	Stat.PASSWORD=prop.getProperty("PASSWORD");	
	}
	
	public void initwebelement() {
		//PageFactory.initElements(Browsersetup.getDriver(), Pojo_001Homepage.gethomeinstance());
		//PageFactory.initElements(Browsersetup.getDriver(), Pojo_002ezugiprovider.getezugi());
			
	}
	public void takescreenshot() {
		File Screenshot = ((TakesScreenshot) Browsersetup.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(Screenshot,
					new File("C:\\Karthickraja_MS\\Automation\\Demo\\SampleAutomation\\target\\Screenshot\\SSImg.png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void highlightelement(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) Browsersetup.getDriver();
		executor.executeScript("arguments[0].setAttribute('style','border: 3px solid blue');", element);
	}

	// Random strings

	public String randomeString(int stringcount) {
		String generatedString = RandomStringUtils.randomAlphabetic(stringcount);
		return (generatedString);
	}

	public String randomNumber(int numbercount) {
		String generatedString2 = RandomStringUtils.randomNumeric(numbercount);
		return (generatedString2);
	}

	public String randomAlphaNumber(int alphavalue, int numbervalue) {
		String st = RandomStringUtils.randomAlphabetic(alphavalue);
		String num = RandomStringUtils.randomNumeric(numbervalue);
		return (st + "@" + num);
	}

	public String randomAlphaNumberswspcase() {
		String st = RandomStringUtils.randomAlphabetic(4);
		String num = RandomStringUtils.randomNumeric(3);
		return (st + num);
	}

	public String randomNumberbelowtend() {
		String generatedString2 = RandomStringUtils.randomNumeric(1);
		return (generatedString2);
	}

	// Navigation forward backward refresh

	public static void navigationCommands(String options) {
		try {
			if (options.equalsIgnoreCase("back")) {
				Browsersetup.getDriver().navigate().back();
			} else if (options.equalsIgnoreCase("forward")) {
				Browsersetup.getDriver().navigate().forward();
			} else if (options.equalsIgnoreCase("refresh")) {
				Browsersetup.getDriver().navigate().refresh();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void scrollUpandDownusingCoordinates(int top, int height) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) Browsersetup.getDriver();
			js.executeScript("window.scrollBy(" + top + "," + height + ")");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();

		}
	}
	
	public static void getUrl(String url) throws Throwable {
		try {
			Browsersetup.getDriver().get(url);
			Browsersetup.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	}
	public static void implicitlyWait(long time) throws Throwable {
		try {
			Browsersetup.getDriver().manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	public static void assertequalsbase(WebElement element, String string) {
		try {
			Assert.assertEquals(element.getText(), string);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}		
//Add this line for test commit
}
