package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.LastNamePage;
import io.cucumber.java.en.Then;

public class LastNameSteps extends BaseClass{

	
	@Then("enter last name")
	public void enter_last_name() {
	    LastNamePage lastNamePage = new LastNamePage();
	    lastNamePage.enterLastName("agarwal");
	}
}
