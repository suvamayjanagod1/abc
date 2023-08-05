package PageLayer;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

import static UtilsLayer.UtilsClass.*;

public class LastNamePage  extends BaseClass{

	@FindBy(name="lastName")
	private WebElement lastName;

	public LastNamePage() {

		PageFactory.initElements(driver, this);
	}

	public void enterLastName(String name)
	
	{
		sendData(lastName,name);
		
	}
}
