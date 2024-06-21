package com.stepdefinition;

import com.pojo.Pojo_001Homepage;
import com.pojo.Pojo_002ezugiprovider;
import com.utility.Utility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition {
	// TC01
	@Given("The user click the casino category and click the livecasino and casino1.")
	public void the_user_click_the_casino_category_and_click_the_livecasino_and_casino1() {
		Pojo_001Homepage.gethomeinstance().getSigninicon().click();
		Commonstepdefinition.login();
		Pojo_001Homepage.gethomeinstance().getCasinologoclick().click();
		Pojo_002ezugiprovider.getezugiinstance().getLivecasinoicon().click();
		Pojo_002ezugiprovider.getezugiinstance().getCasinoicon().click();
	}

	@When("Users click ezugi provider and view the games displayed1")
	public void users_click_ezugi_provider_and_view_the_games_displayed1() {
		Pojo_002ezugiprovider.getezugiinstance().getEzugiicon().click();
	}

	// TC02
	@Given("The user click the casino category and click the casino service page2")
	public void the_user_click_the_casino_category_and_click_the_casino_service_page2() {
		Commonstepdefinition.login();
		Pojo_001Homepage.gethomeinstance().getCasinologoclick().click();
		Pojo_002ezugiprovider.getezugiinstance().getCasinoicon().click();

	}

	@When("User click the ezugi provider2")
	public void user_click_the_ezugi_provider2() {
		Pojo_002ezugiprovider.getezugiinstance().getEzugiicon().click();
	}

	@Then("The user click the casino category and click the livecasino service page2")
	public void the_user_click_the_casino_category_and_click_the_livecasino_service_page2() {
		Pojo_001Homepage.gethomeinstance().getCasinologoclick().click();
		Pojo_002ezugiprovider.getezugiinstance().getLivecasinoicon().click();

	}

	@And("User click the ezugi provider2-")
	public void user_click_the_ezugi_provider21() {
		Pojo_002ezugiprovider.getezugiinstance().getEzugiicon().click();
	}

	// TC03
	@Given("The user click the casino category and click the ezugi provider3")
	public void the_user_click_the_casino_category_and_click_the_ezugi_provider3() {
		Commonstepdefinition.login();
		Pojo_001Homepage.gethomeinstance().getCasinologoclick().click();
		Pojo_002ezugiprovider.getezugiinstance().getEzugiicon().click();

	}

	@When("Users should be able to access all ezugi provider games seamlessly3")
	public void users_should_be_able_to_access_all_ezugi_provider_games_seamlessly3() {
		Pojo_002ezugiprovider.getezugiinstance().getOnedayteenpatti().click();
	}

	// TC04
	@Given("The user click the casino category and click the ezugi provider4")
	public void the_user_click_the_casino_category_and_click_the_ezugi_provider4() {
		Commonstepdefinition.login();
		//Pojo_001Homepage.gethomeinstance().getLoginclick().click();
		Pojo_001Homepage.gethomeinstance().getCasinologoclick().click();
		Pojo_002ezugiprovider.getezugiinstance().getEzugiicon().click();
	}

	@When("The user click the game inside the ezugi provider and check it open without login4")
	public void the_user_click_the_game_inside_the_ezugi_provider_and_check_it_open_without_login4() {
		Pojo_001Homepage.gethomeinstance().getCasinologoclick().click();
		Pojo_002ezugiprovider.getezugiinstance().getEzugiicon().click();
		Pojo_002ezugiprovider.getezugiinstance().getBlackjackgame().click();
	}

	// TC05
	@Given("The user click the casino category and click the ezugi provider5")
	public void the_user_click_the_casino_category_and_click_the_ezugi_provider5() {
		Commonstepdefinition.login();
		//Pojo_001Homepage.gethomeinstance().getLoginclick().click();
		Pojo_001Homepage.gethomeinstance().getCasinologoclick().click();
		Pojo_002ezugiprovider.getezugiinstance().getEzugiicon().click();
	}

	@When("The user click the game inside the ezugi provider and check it open with low balance5")
	public void the_user_click_the_game_inside_the_ezugi_provider_and_check_it_open_with_low_balance5() {

	}

	// TC06
	@Given("The user click the casino category and click the ezugi provider6")
	public void the_user_click_the_casino_category_and_click_the_ezugi_provider6() {
		Commonstepdefinition.login();
		//Pojo_001Homepage.gethomeinstance().getLoginclick().click();
		Pojo_001Homepage.gethomeinstance().getCasinologoclick().click();
		Pojo_002ezugiprovider.getezugiinstance().getEzugiicon().click();
	}

	@When("Users should be able to access all ezugi provider games seamlessly6")
	public void users_should_be_able_to_access_all_ezugi_provider_games_seamlessly6() {
		Pojo_002ezugiprovider.getezugiinstance().getAndarbaharlobbygame().click();
	}

//TC07
	@Given("The user click the casino category and click the ezugi provider7")
	public void the_user_click_the_casino_category_and_click_the_ezugi_provider7() {
		Commonstepdefinition.login();
		//Pojo_001Homepage.gethomeinstance().getLoginclick().click();
		Pojo_001Homepage.gethomeinstance().getCasinologoclick().click();
		Pojo_002ezugiprovider.getezugiinstance().getEzugiicon().click();
	}

	@When("User should able to access the game7")
	public void user_should_able_to_access_the_game7() {
		Pojo_002ezugiprovider.getezugiinstance().getPokergame().click();
	}

	@Then("User logout7")
	public void user_logout7() {
		Pojo_002ezugiprovider.getezugiinstance().getMyaccount().click();
		Utility.scrolltoBottomPage();
		Pojo_002ezugiprovider.getezugiinstance().getLogout().click();

	}

//TC08
	@Given("The user click the casino category and click the ezugi provider8")
	public void the_user_click_the_casino_category_and_click_the_ezugi_provider8() {
		Commonstepdefinition.login();
		//Pojo_001Homepage.gethomeinstance().getLoginclick().click();
		Pojo_001Homepage.gethomeinstance().getCasinologoclick().click();
		Pojo_002ezugiprovider.getezugiinstance().getEzugiicon().click();
	}

	@When("User click the onedayteenpaati game and it should open8")
	public void user_click_the_onedayteenpaati_game_and_it_should_open8() {
		Pojo_002ezugiprovider.getezugiinstance().getOnedayteenpatti().click();
	}
}
