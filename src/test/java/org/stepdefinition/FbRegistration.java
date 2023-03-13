package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.tes.BaseClasss;
import org.tes.SignInpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.*; 
public class FbRegistration extends BaseClasss {
	SignInpojo s;
	@Given("To launch the browser and maximise the window")
	public void to_launch_the_browser_and_maximise_the_window() {
		launchBrowser();
		windowMaximize();
	}
	@When("To launch the url of fb application")
	public void to_launch_the_url_of_fb_application() {
		launchUrl("https://en-gb.facebook.com/");
	}

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() throws InterruptedException {
		
		s = new SignInpojo();
		clickBtn(s.getCreatenewaccountbox());
	}
	@When("To pass first name in firstname text box")
	public void to_pass_first_name_in_firstname_text_box(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
			List<String> l = d.asList();
		s = new SignInpojo();
		passText(l.get(0) ,s.getFirstnamebox());
	}
	@When("To pass secondname in secondname text box")
	public void to_pass_secondname_in_secondname_text_box() {
		s = new SignInpojo();
		passText("Ramakrishnan", s.getLastnamebox());
	}

  @When("to pass mobileno or email in email text box")
	public void to_pass_mobileno_or_email_in_email_text_box(DataTable d) {
List<List<String>> l = d.asLists();
		s = new SignInpojo();
		passText(l.get(0).get(1), s.getRegemailbox());
	}

	@When("To create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box() {
		s = new SignInpojo();
		passText("fghjf", s.getPasswordbox());
	}

	@Then("To close the Chrome browser")
	public void to_close_the_Chrome_browser() {
		// closeEntireBrowser();
	}

}
