package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Email_page extends Base_Page {
	public Email_page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
		// TODO Auto-generated constructor stub
	}

	@FindBy(linkText="Email")
	private WebElement EmailButton;
	
	
	
	public WebElement getEmailButton() {
		return EmailButton;
	}

	@FindBy(linkText = "Compose")
	private WebElement Composelink;

	public WebElement getComposelink() {
		return Composelink;
	}

	@FindBy(linkText = "Incoming Mail Server Settings")
	private WebElement IncomingMailServersettings;

	public WebElement getIncomingMailServersettings() {
		return IncomingMailServersettings;
	}
	
	@FindBy(xpath="//img[@alt=\"Open Calendar...\"]")
	private WebElement openCalendar;

	public WebElement getOpenCalendar() {
		return openCalendar;
	}
	@FindBy(xpath="//img[@alt=\"Show World Clock...\"]")
	private WebElement worldClock;

	public WebElement getWorldClock() {
		return worldClock;
	}
	@FindBy(xpath="//img[@alt=\"Chat...\"]")
	private WebElement chat;

	public WebElement getChat() {
		return chat;
	}
	@FindBy(xpath="//img[@alt=\"Last Viewed\"]")
	private WebElement LastViewed;

	public WebElement getLastViewed() {
		return LastViewed;
	}
	@FindBy(linkText="Qualified Mails (As Contacts)")
	private WebElement QualifiedMails;

	public WebElement getQualifiedMails() {
		return QualifiedMails;
	}
	@FindBy(linkText="My Mails")
	private WebElement MyMails;

	public WebElement getMyMails() {
		return MyMails;
	}
	@FindBy(xpath="//a[text()='All Mails']")
	private WebElement MyMails1;

	public WebElement getMyMails1() {
		return MyMails1;
	}
	@FindBy(linkText="To Contacts")
	private WebElement ToContacts;

	public WebElement getToContacts() {
		return ToContacts;
	}
	@FindBy(linkText="To Organizations")
	private WebElement ToOrganisation;

	public WebElement getToOrganisation() {
		return ToOrganisation;
	}
	@FindBy(linkText="To Leads")
	private WebElement ToLeads;

	public WebElement getToLeads() {
		return ToLeads;
	}
	@FindBy(linkText="To Users")
	private WebElement ToUsers;

	public WebElement getToUsers() {
		return ToUsers;
	}
	@FindBy(xpath="//input[@value=\" Delete\"]")
	private WebElement Delete;

	public WebElement getDelete() {
		return Delete;
	}
	@FindBy(id="search_text")
	private WebElement SearchTextField;

	public WebElement getSearchTextField() {
		return SearchTextField;
	}
	@FindBy(xpath="//input[@name=\"selectall\"]")
	private WebElement SelectcheckBox;

	public WebElement getSelectcheckBox() {
		return SelectcheckBox;
	}
	@FindBy(id="search_field")
	private WebElement SearchField;

	public WebElement getSearchField() {
		return SearchField;
	}
	@FindBy(xpath="//input[@name=\"find\"]")
	private WebElement FindButton;

	public WebElement getFindButton() {
		return FindButton;
	}
	
	


}



