package org.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefCalss extends BaseClass {
	@Given("User in Hompage without login {string}")
	public void user_in_hompage_without_login(String string) {
		getDriver(string);
		launchurl("https://www.brandalley.co.uk/");
		Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		PomLogin p = new PomLogin();
		p.getSignUpIcon().click();
	}


	@When("User Entering HomePage and Clicking Signup Icon")
	public void user_entering_home_page_and_clicking_signup_icon() {
		System.out.println("after clicking signup button");
	
	}
	@When("Signup Page Popup and User Clicking Already member Button")
	public void signup_page_popup_and_user_clicking_already_member_button() {
		PomLogin p =new PomLogin();
		p.getAlreadyMember().click();
	
	
	}
	@When("Login Page Popup")
	public void login_page_popup() {
System.out.println("LoginPage Sucessfully PopUp");
	
	
	}
	@When("User Starts to Enter the Details {string} and {string} and Clicking Login Button")
	public void user_starts_to_enter_the_details_and_and_clicking_login_button(String string, String string2) {

	PomLogin p = new PomLogin();
		p.getUsername().sendKeys(string);
		p.getPassword().sendKeys(string2);
		p.getLogin().click();
	
	}
	@Then("User SuccessFully Enter into HomePage")
	public void user_success_fully_enter_into_home_page() throws InterruptedException {
		System.out.println("user Login Successful in chrome");
	}
	@Given("User mouseover to Mens")
	public void user_mouseover_to_mens() throws InterruptedException {
	PomLogin p = new PomLogin();
	Thread.sleep(3000);
	WebElement locator = locator("xpath", "(//span[text()='Men'])[1]");
	actions("mouseOver", locator);
	}
	@When("user clicking AllClothing and clicking")
	public void user_clicking_all_clothing_and_clicking() throws InterruptedException {
		System.out.println("mouseover Popup");
	}
	@When("clicking Activewear")
	public void clicking_activewear() {
		PomLogin p  = new PomLogin();
		p.getActivewear().click();
	}
	@When("User selecting first product")
	public void user_selecting_first_product() {
		PomLogin p= new PomLogin();
		p.getFirstProduct().click();
		
	}
	@Then("user add product to basket and view basket")
	public void user_add_product_to_basket_and_view_basket() {
PomLogin p = new PomLogin();
p.getShirtSize().click();
p.getAddTOBasket().click();
WebElement locator = locator("id", "develo-mini-cart-content");
actions("mouseOver", locator);
p.getViewBasket().click();
	}



}




