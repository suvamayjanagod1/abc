package PageLayer;

import static UtilsLayer.UtilsClass.sendData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class EnterAddress extends BaseClass {

	
	@FindBy(name="address1")
	private WebElement address11;

	public EnterAddress() {

		PageFactory.initElements(driver, this);
	}

	public void enterLastName(String name2)
	
	{
		sendData(address11,name2);
		
	}
}
