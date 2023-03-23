package org.automation.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MailManager_page {
	MailManager_page(WebDriver driver){
		super();
	}
	@FindBy(xpath=" //input[@value=\" Delete\"]")
	private WebElement Delete;
	public WebElement getDelete() {
		return Delete;
	}
	

}
