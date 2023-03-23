package org.automation.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Settings_page {
	public Settings_page(WebDriver driver) {
		super();
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="_mbox_helper")
	private WebElement Options;
	public WebElement getOptions() {
		return Options;
	}
	@FindBy(xpath="//select//option[text()=\"Gmail\"]")
	private WebElement Gmail;
	public WebElement getGmail() {
		return Gmail;
	}
	@FindBy(xpath="//select//option[text()=\"Yahoo\"]")
	private WebElement Yahoo;
	public WebElement getYahoo() {
		return Yahoo;
	}
	@FindBy(xpath="//select//option[text()=\"Fastmail\"]")
	private WebElement FastMail;
	public WebElement getFastMail() {
		return FastMail;
	}
	@FindBy(xpath="//select//option[text()=\"Other\"]")
	private WebElement Other;
	public WebElement getOther() {
		return Other;
	}
	@FindBy(xpath="//input[@value=\"Save\"]")
	private WebElement Save;
	public WebElement getSave() {
		return Save;
	}
	

}



