package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 
 * @author Sumanth
 *
 */
public class Login_Page extends Base_Page {
	
	public Login_Page(WebDriver driver) {
		super(driver);
	}
	
	//================Web elements or Property================
	@FindBy(id="Email") 
	private WebElement emailTextField;
	
	@FindBy(id="Password") 
	private WebElement passwordTextField;
	
	@FindBy(xpath="//input[@value='Log in']") 
	private WebElement loginButton;

	//================Getters or Public services================
	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//================Business Logic or Action methods or Behavior================
	public Home_Page login(String username, String password) {
		getLoginLink().click();
		emailTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
		
		//landing Page Object
		return new Home_Page(super.driver);
	}
}
