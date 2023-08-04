package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class PhoneNoPage extends BaseClass{

	@FindBy(name="phone")
	private WebElement Phone;
	
	public PhoneNoPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void validatePhoneno(String no) {
		UtilsClass.sendData(Phone, no);
	}
}
