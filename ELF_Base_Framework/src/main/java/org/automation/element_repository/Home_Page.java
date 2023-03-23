package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.automation.generic_utilities.ActionsUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/***
 * 
 * @author Sumanth
 *
 */
public class Home_Page extends Base_Page {
	
	ActionsUtil action=new ActionsUtil(driver);

	public Home_Page(WebDriver driver) {
		super(driver);
	}

	//================Web elements or Property================
	@FindBy(xpath = "//td[@onmouseout=\"fnHideDrop('ondemand_sub');\"]")
	private WebElement administratorIcon;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signOut;
	
	//================Getters or Public services================
	public WebElement getAdministratorIcon() {
		return administratorIcon;
	}

	public WebElement getSignOut() {
		return signOut;
	}


	
	
	//================Business Logic or Action methods or Behavior================
	
	public WebElement getCustomerProfileLink(String emailId) {
		return driver.findElement(By.xpath("//a[@class='account' and contains(text(),'"+ emailId +"')]"));
	}

	public void logout() {
		action.mouseHoverOnElement(administratorIcon);
		signOut.click();
	}
}
