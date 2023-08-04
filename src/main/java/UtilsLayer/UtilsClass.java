package UtilsLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass {

	public static void sendData(WebElement wb,String firstname) {
		
		if(wb.isDisplayed() && wb.isEnabled())
		{
			wb.sendKeys(firstname);
		}
		
		

	}

}
