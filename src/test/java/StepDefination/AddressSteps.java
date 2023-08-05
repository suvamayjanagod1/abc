package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.EnterAddress;
import io.cucumber.java.en.Then;

public class AddressSteps extends BaseClass {

	
	@Then("enter Address")
	public void enter_address() {
	    
		EnterAddress enterAddress = new EnterAddress();
		enterAddress.enterLastName("Kolkata");
		
	}
}
