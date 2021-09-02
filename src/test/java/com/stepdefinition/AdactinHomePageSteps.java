package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.HomePagePojo;
import com.pom.Lib_Global;

import io.cucumber.java.en.*;

public class AdactinHomePageSteps extends com.utils.Lib_Global {

	@Given("User launch the browser and navigate to adactin page")
	public void user_launch_the_browser_and_navigate_to_adactin_page() {

		getDriver();
		getUrl("https://adactinhotelapp.com/");

	}

	@When("user enters the username and password in adactin homepage")
	public void user_enters_the_username_and_password_in_adactin_homepage() {

	insertType(new HomePagePojo().getUserName(),"Vignesh");
	insertType(new HomePagePojo().getPassword(), "1234");
	}

	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
		click(new HomePagePojo().getLogin());
	}

	@Then("user validates the error message")
	public void user_validates_the_error_message() {

	}

}
