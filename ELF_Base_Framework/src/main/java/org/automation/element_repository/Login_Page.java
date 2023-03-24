package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends Base_Page {
	
	public Login_Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name = "user_name")
	private WebElement usernameTextField;
	
	@FindBy(name = "user_password")
	private WebElement passwordTextField;
	
	@FindBy(id = "submitButton")
	private WebElement loginButton;
	
	public void login(String username,String password) {
		usernameTextField.clear();
		usernameTextField.sendKeys(username);
		passwordTextField.clear();
		passwordTextField.sendKeys(password);
		loginButton.click();
	}
}
