package org.stepdefinition;

import org.tes.BaseClasss;
import org.tes.FbLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class PositiveandNegativeOfFb extends BaseClasss{
	FbLoginPojo f;
	@Given("To launch the Chrome browser and maximize window")
	public void to_launch_the_Chrome_browser_and_maximize_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("To launch the Url of the Facebook Application")
	public void to_launch_the_Url_of_the_Facebook_Application() {
		launchUrl("https://en-gb.facebook.com/");
	    	}

	@When("To pass the invalid username in email field")
	public void to_pass_the_invalid_username_in_email_field() {
		f= new FbLoginPojo();
	    passText("nandini@gmail.com", f.getEmail());
	}

	@When("To pass the invalid password in password Field")
	public void to_pass_the_invalid_password_in_password_Field() {
		f= new FbLoginPojo();
		passText("jhgffd",f.getPassword());
	    	}

	@When("To Check whether navigate to homepage or not")
	public void to_Check_whether_navigate_to_homepage_or_not() {
		System.out.println("Check your Login Credientials");
	    	}
}
