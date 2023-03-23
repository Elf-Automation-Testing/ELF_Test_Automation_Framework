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
	
	public WebDriver driver;
	
	public Login_Page(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	//================Web elements or Property================
	@FindBy(name = "user_name") 
	private WebElement usernameTextField;
	
	@FindBy(name = "user_password") 
	private WebElement passwordTextField;
	
	@FindBy(id = "submitButton") 
	private WebElement loginButton;

	//================Getters or Public services================
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//================Business Logic or Action methods or Behavior================
	public Home_Page login(String username, String password) {
		getLoginButton().click();
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
		
		//landing Page Object
		return new Home_Page(driver);
	}

	
}
