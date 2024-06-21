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

import com.github.dockerjava.api.command.StartContainerCmd;
import com.pojo.Pojo_001Homepage;
import com.pojo.Pojo_002ezugiprovider;
import com.stat.Stat;
import commonbrowser.Commonbrowser;

public class Utility {

	private static Utility utilinstance = null;

	private Utility() {
	}

	public static Utility getinstance() {
		if (utilinstance == null)
			utilinstance = new Utility();
		return utilinstance;
	}

	public void Loadproperties() {
		Properties prop = new Properties();
		try {

			prop.load(getClass().getResourceAsStream("/stat.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		Stat.BROWSER = prop.getProperty("BROWSER");
		Stat.APP_URL = prop.getProperty("APP_URL");
		Stat.USERNAME = prop.getProperty("USERNAME");
		Stat.PASSWORD = prop.getProperty("PASSWORD");

	}
   public void initwebelement() {
	   PageFactory.initElements(Commonbrowser.getDriver(), Pojo_001Homepage.gethomeinstance());
	   PageFactory.initElements(Commonbrowser.getDriver(), Pojo_002ezugiprovider.getezugiinstance());
   }
   
	public void takescreenshot(String screen) {
		File Screenshot = ((TakesScreenshot) Commonbrowser.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(Screenshot,
					new File("C:\\Users\\Kesavan R\\eclipse-workspace\\com.cricmatch1\\Screenshots\\Passed scenarios\\"
							+ screen + ".png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void highlightelement(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) Commonbrowser.getDriver();
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
				Commonbrowser.getDriver().navigate().back();
			} else if (options.equalsIgnoreCase("forward")) {
				Commonbrowser.getDriver().navigate().forward();
			} else if (options.equalsIgnoreCase("refresh")) {
				Commonbrowser.getDriver().navigate().refresh();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void scrollUpandDownusingCoordinates(int top, int height) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) Commonbrowser.getDriver();
			js.executeScript("window.scrollBy(" + top + "," + height + ")");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();

		}
	}
	
	public static void scrolltoBottomPage() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) Commonbrowser.getDriver();
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
 
		}
	}
	public static void getUrl(String url) throws Throwable {
		try {
			Commonbrowser.getDriver().get(url);
			Commonbrowser.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	}
	public static void implicitlyWait(long time) throws Throwable {
		try {
			Commonbrowser.getDriver().manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
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
}
