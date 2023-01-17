package org.automation.element_repository;

import org.automation.base.Base_Page;
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

	public Home_Page(WebDriver driver) {
		super(driver);
	}

	//================Web elements or Property================
	@FindBy(linkText="Log out") 
	private WebElement logoutButton;
	
	//================Getters or Public services================
	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getCustomerProfileLink(String emailId) {
		return driver.findElement(By.xpath("//a[@class='account' and contains(text(),'"+ emailId +"')]"));
	}

	//================Business Logic or Action methods or Behavior================
	public void logout() {
		logoutButton.click();
	}
}
