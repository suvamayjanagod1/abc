package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.PhoneNoPage;
import io.cucumber.java.en.When;

public class PhoneNoPageStep extends BaseClass{

	PhoneNoPage phoneno;
	@When("user enter phone")
	public void user_enter_phone() {
	    
		phoneno = new PhoneNoPage();
		phoneno.validatePhoneno("21486321563");
	}
}
