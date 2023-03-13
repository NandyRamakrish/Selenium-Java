

package org.stepdefinition;

import org.tes.BaseClasss;
import org.tes.FbLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin extends BaseClasss {
	FbLoginPojo f;
	@Then("To close the browser")
	public void to_close_the_browser() {
	    closeEntireBrowser();
	}

	@Given("User has to launch the Browser and maximize the window")
	public void user_has_to_launch_the_Browser_and_maximize_the_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("User has to hit the Facebook Url")
	public void user_has_to_hit_the_Facebook_Url() {
		launchUrl("https://en-gb.facebook.com/");
	    	}

	@When("User has to pass the data{string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String em) {
		f= new FbLoginPojo();
	    passText(em, f.getEmail() );
	}

	@When("User has to launch the data{string} in password field")
	public void user_has_to_launch_the_data_in_password_field(String pass) {
		f= new FbLoginPojo();
	   passText(pass, f.getPassword());
	}

	@When("User has to Click the login button")
	public void user_has_to_Click_the_login_button() {
		f= new FbLoginPojo();
	    clickBtn(f.getLoginBtn());
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
		closeEntireBrowser();
	    	}

}
