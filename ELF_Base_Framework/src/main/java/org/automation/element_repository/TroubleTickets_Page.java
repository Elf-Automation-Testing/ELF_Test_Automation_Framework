package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TroubleTickets_Page extends Base_Page{
	
	public TroubleTickets_Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//img[@title='Create Ticket...']")
	private WebElement createTicketIcon;
	
	@FindBy(xpath = "//img[@title='Search in Trouble Tickets...']")
	private WebElement searchIcon;
	
	@FindBy(xpath = "//img[@title='Open Calendar...']")
	private WebElement calenderIcon;
	
	@FindBy(xpath = "//img[@title='Show World Clock...']")
	private WebElement clockIcon;
	
	@FindBy(xpath = "//img[@title='Open Calculator...']")
	private WebElement calculatorIcon;
	
	@FindBy(xpath = "//img[@title='Last Viewed']")
	private WebElement lastViewedIcon;
	
	@FindBy(xpath = "//img[@title='Import Trouble Tickets']")
	private WebElement importTroubleTicketsIcon;
	
	@FindBy(xpath = "//img[@title='Export Trouble Tickets']")
	private WebElement exportTroubleTicketsIcon;
	
	@FindBy(xpath = "//img[@title='Find Duplicates']")
	private WebElement findDuplicatesIcon;
	
	@FindBy(xpath = "//img[@title='Trouble Tickets Settings']")
	private WebElement troubleTicketsSettingsIcon;
	
	@FindBy(name = "search_text")
	private WebElement searchTextField;
	
	@FindBy(name = "search_field")
	private WebElement searchFieldDropDown;
	
	@FindBy(xpath = "//input[@value=' Search Now ' and @name='submit']")
	private WebElement searchNowButton;
	
	@FindBy(id = "viewname")
	private WebElement filterDropDown;
	
	@FindBy(linkText = "Create Filter")
	private WebElement createFilterLink;
	
	@FindBy(linkText = "Edit")
	private WebElement editLink;
	
	@FindBy(linkText = "Delete")
	private WebElement deleteLink;
	
	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement deleteButton;
	
	@FindBy(xpath = "//input[@value='Mass Edit']")
	private WebElement massEditButton;
	
	@FindBy(name = "selectall")
	private WebElement selectAllCheckbox;
	
	@FindBy(linkText = "del")
	private WebElement delLink;
	
	@FindBy(linkText = "Create Mail Merge templates ")
	private WebElement createMailMergeTemplatesLink;
	
	@FindBy(xpath = "//a[@title='Contacts']")
	private WebElement contactsLink;
	
//	getters

	public WebElement getCreateTicketIcon() {
		return createTicketIcon;
	}

	public WebElement getSearchIcon() {
		return searchIcon;
	}

	public WebElement getCalenderIcon() {
		return calenderIcon;
	}

	public WebElement getClockIcon() {
		return clockIcon;
	}

	public WebElement getCalculatorIcon() {
		return calculatorIcon;
	}

	public WebElement getLastViewedIcon() {
		return lastViewedIcon;
	}

	public WebElement getImportTroubleTicketsIcon() {
		return importTroubleTicketsIcon;
	}

	public WebElement getExportTroubleTicketsIcon() {
		return exportTroubleTicketsIcon;
	}

	public WebElement getFindDuplicatesIcon() {
		return findDuplicatesIcon;
	}

	public WebElement getTroubleTicketsSettingsIcon() {
		return troubleTicketsSettingsIcon;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getSearchFieldDropDown() {
		return searchFieldDropDown;
	}

	public WebElement getSearchNowButton() {
		return searchNowButton;
	}

	public WebElement getFilterDropDown() {
		return filterDropDown;
	}

	public WebElement getCreateFilterLink() {
		return createFilterLink;
	}

	public WebElement getEditLink() {
		return editLink;
	}

	public WebElement getDeleteLink() {
		return deleteLink;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public WebElement getMassEditButton() {
		return massEditButton;
	}

	public WebElement getSelectAllCheckbox() {
		return selectAllCheckbox;
	}

	public WebElement getDelLink() {
		return delLink;
	}

	public WebElement getCreateMailMergeTemplatesLink() {
		return createMailMergeTemplatesLink;
	}

	public WebElement getContactsLink() {
		return contactsLink;
	}
}
