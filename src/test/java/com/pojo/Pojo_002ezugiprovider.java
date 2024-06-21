package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pojo_002ezugiprovider {

	private static Pojo_002ezugiprovider ezugiinstance;

	private Pojo_002ezugiprovider() {

	}

	public static Pojo_002ezugiprovider getezugiinstance() {
		if (ezugiinstance == null) {
			ezugiinstance = new Pojo_002ezugiprovider();
		}
		return ezugiinstance;
	}

	@FindBy(xpath = "(//p[@class='side_menu_label '])[1]")
	private WebElement livecasinoicon;

	@FindBy(xpath = "//p[@class='side_menu_label active']")
	private WebElement casinoicon;

	@FindBy(xpath = "//div[@class='mutiple_games_cont_casino active ']")
	private WebElement ezugiicon;

	@FindBy(xpath = "(//div[@class='ImageContainer ImageGridBGSkelton'])[1]")
	private WebElement blackjackgame;

	@FindBy(xpath = "(//div[@class='ImageContainer ImageGridBGSkelton'])[2]")
	private WebElement Andarbaharlobbygame;

	@FindBy(xpath = "(//div[@class='ImageContainer ImageGridBGSkelton'])[3]")
	private WebElement pokergame;

	@FindBy(xpath = "(//div[@class='ImageContainer ImageGridBGSkelton'])[70]")
	private WebElement onedayteenpatti;
	
	@FindBy(xpath="(//div[@class='navigation_outer'])[5]")
	private WebElement myaccount;
	
	@FindBy(xpath="//p[text()='Logout']")
	private WebElement Logout;
	

	
	
	
	
	
	
	

	public WebElement getLivecasinoicon() {
		return livecasinoicon;
	}

	public WebElement getCasinoicon() {
		return casinoicon;
	}

	public WebElement getEzugiicon() {
		return ezugiicon;
	}

	public WebElement getBlackjackgame() {
		return blackjackgame;
	}

	public WebElement getAndarbaharlobbygame() {
		return Andarbaharlobbygame;
	}

	public WebElement getPokergame() {
		return pokergame;
	}

	public WebElement getOnedayteenpatti() {
		return onedayteenpatti;
	}
	public WebElement getMyaccount() {
		return myaccount;
	}

	public WebElement getLogout() {
		return Logout;
	}
}
