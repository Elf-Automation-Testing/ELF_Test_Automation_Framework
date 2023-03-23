package org.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/***
 * 
 * Every Page class must and should extend Base Page
 * In this page you will find all common elements of the Web App
 * 
 * @author Sumanth
 * 
 */
public  class Base_Page {

	public WebDriver driver;
	public Base_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	//================Web elements or Property================
	@FindBy(linkText = "Calendar")
	private WebElement calendar;
	
	@FindBy(linkText = "Leads")
	private WebElement leads;
	
	@FindBy(linkText = "Organizations")
	private WebElement organizations;
	
	@FindBy(linkText = "Contacts")
	private WebElement contacts;
	
	@FindBy(linkText = "Opportunities")
	private WebElement opportunities;
	
	@FindBy(linkText = "Products")
	private WebElement products;
	
	@FindBy(linkText = "Documents")
	private WebElement documents;
	
	@FindBy(linkText = "Trouble Tickets")
	private WebElement troubleTickets;
	
	@FindBy(linkText = "Dashboard")
	private WebElement dashboard;
	
	@FindBy(linkText = "More")
	private WebElement more;
	
	@FindBy(id = "qccombo")
	private WebElement quickCreateDropDown;
	
	

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCalendar() {
		return calendar;
	}

	public WebElement getLeads() {
		return leads;
	}

	public WebElement getOrganizations() {
		return organizations;
	}

	public WebElement getContacts() {
		return contacts;
	}

	public WebElement getOpportunities() {
		return opportunities;
	}

	public WebElement getProducts() {
		return products;
	}

	public WebElement getDocuments() {
		return documents;
	}

	public WebElement getTroubleTickets() {
		return troubleTickets;
	}

	public WebElement getDashboard() {
		return dashboard;
	}

	public WebElement getMore() {
		return more;
	}

	public WebElement getQuickCreateDropDown() {
		return quickCreateDropDown;
	}

	
}
