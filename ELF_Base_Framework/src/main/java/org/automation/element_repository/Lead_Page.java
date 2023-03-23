package org.automation.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lead_Page {
	
	public WebDriver driver;
	public Lead_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath="//img[@title='Create Lead...']")
	private WebElement createLeadIcon;
	
	@FindBy(xpath="//img[@title='Search in Leads...']")
	private WebElement searchInLeadsIcon;
	
	@FindBy(xpath="//img[@title='Open Calendar...']")
	private WebElement calendarIcon;
	
	@FindBy(xpath="//img[@title='Show World Clock...']")
	private WebElement clockIcon;
	
	@FindBy(xpath="//img[@title='Open Calculator...']")
	private WebElement calculatorIcon;
	
	@FindBy(xpath="//img[@title='Chat...']")
	private WebElement leadChatIcon;
	
	@FindBy(xpath="//img[@title='Import Leads']")
	private WebElement importLeadIcon;
	
	@FindBy(xpath="//img[@title='Export Leads']")
	private WebElement exportLeadIcon;
	
	@FindBy(xpath="//img[@title='Leads Settings']")
	private WebElement leadSettingsIcon;
	
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement searchTextField;
	
	@FindBy(xpath="//input[@name='submit']")
	private WebElement searchNowButton;
	
	@FindBy(xpath="//div[@id='basicsearchcolumns_real']/select")
	private WebElement inDropDown;
	
	@FindBy(linkText = "Create Filter")
	private WebElement createFilter;
	
	@FindBy(linkText = "Edit")
	private WebElement editFilter;
	
	@FindBy(linkText = "Delete")
	private WebElement deleteFilter;
	
	@FindBy(id="viewname")
	private WebElement filterDropDown;
	
	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement deleteButton;
	
	@FindBy(xpath = "//input[@value='Mass Edit']")
	private WebElement massEditButton;
	
	@FindBy(xpath="//input[@value='Send Mail']")
	private WebElement sendMailButton;
	
	@FindBy(xpath = "//input[@value='Send SMS']")
	private WebElement sendSMSButton;
	
	@FindBy(partialLinkText = "Create Mail Merge templates")
	private WebElement createMailMergeTemplate;
	
	@FindBy(linkText = "Go to Advanced Search")
	private WebElement advanceSearch;
	
	@FindBy(xpath = "//input[@name='selected_id' and @id='38']")
	private WebElement row;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCreateLeadIcon() {
		return createLeadIcon;
	}

	public WebElement getSearchInLeadsIcon() {
		return searchInLeadsIcon;
	}

	public WebElement getCalendarIcon() {
		return calendarIcon;
	}

	public WebElement getClockIcon() {
		return clockIcon;
	}

	public WebElement getCalculatorIcon() {
		return calculatorIcon;
	}

	public WebElement getLeadChatIcon() {
		return leadChatIcon;
	}

	public WebElement getImportLeadIcon() {
		return importLeadIcon;
	}

	public WebElement getExportLeadIcon() {
		return exportLeadIcon;
	}

	public WebElement getLeadSettingsIcon() {
		return leadSettingsIcon;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getSearchNowButton() {
		return searchNowButton;
	}

	public WebElement getInDropDown() {
		return inDropDown;
	}

	public WebElement getCreateFilter() {
		return createFilter;
	}

	public WebElement getEditFilter() {
		return editFilter;
	}

	public WebElement getDeleteFilter() {
		return deleteFilter;
	}

	public WebElement getFilterDropDown() {
		return filterDropDown;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public WebElement getMassEditButton() {
		return massEditButton;
	}

	public WebElement getSendMailButton() {
		return sendMailButton;
	}

	public WebElement getSendSMSButton() {
		return sendSMSButton;
	}

	public WebElement getCreateMailMergeTemplate() {
		return createMailMergeTemplate;
	}

	public WebElement getAdvanceSearch() {
		return advanceSearch;
	}

	public WebElement getRow() {
		return row;
	}
	
	
	
	
	
	
}
