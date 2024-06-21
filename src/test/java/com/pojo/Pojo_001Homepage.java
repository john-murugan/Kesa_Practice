package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pojo_001Homepage {

	private static Pojo_001Homepage homeinstance;

	private Pojo_001Homepage() {

	}

	public static Pojo_001Homepage gethomeinstance() {
		if (homeinstance == null) {
			homeinstance = new Pojo_001Homepage();
		}
		return homeinstance;

	}

	@FindBy(xpath = "//button[@class='login_setup']")
	private WebElement signinicon;

	@FindBy(id = "username")
	private WebElement usernamefield;

	@FindBy(id = "password")
	private WebElement passwordfield;

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement loginclick;

	@FindBy(xpath = "(//div[@class='navigation_outer'])[4]")
	private WebElement casinologoclick;

	public WebElement getSigninicon() {
		return signinicon;
	}

	public WebElement getUsernamefield() {
		return usernamefield;
	}

	public WebElement getPasswordfield() {
		return passwordfield;
	}

	public WebElement getLoginclick() {
		return loginclick;
	}

	public WebElement getCasinologoclick() {
		return casinologoclick;
	}
}
