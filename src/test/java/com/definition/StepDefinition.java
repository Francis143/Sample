package com.definition;



import com.base.BaseClass;
import com.pages.Login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition extends Login {
	@Given("user launches the Adaction url")
	public void user_launches_the_Adaction_url() {
	  BaseClass bs=new BaseClass();
	 bs.launchBrowser();
	}

	@When("user enters valid username and valid passworld")
	public void user_enters_valid_username_and_valid_passworld() {
	  
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
	   
	}

}
