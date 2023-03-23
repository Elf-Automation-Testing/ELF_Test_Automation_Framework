package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Organization_Page extends Base_Page {

	public Organization_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver=driver;
	}
	
	//Locating the web-elements
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createOrganizationButton;
	
	@FindBy(xpath="//img[@title='Search in Organizations...']")
	private WebElement searhInOrganizationButton;
	
	@FindBy(xpath="//img[@title='Open Calendar...']")
	private WebElement openCalendarButton;

	@FindBy(xpath="//img[@title='Show World Clock...']")
	private WebElement openClockButton;
	
	@FindBy(xpath="//img[@title='Open Calculator...']")
	private WebElement openCalculatorButton;
	
	@FindBy(xpath="//img[@title='Chat...']")
	private WebElement openChatButton;
	
	@FindBy(xpath="//img[@alt='Last Viewed']")
	private WebElement openLastViewedButton;
	
	@FindBy(xpath="//img[@alt='Import Organizations']")
	private WebElement importorganizationButton;
	
	@FindBy(xpath="//img[@title='Find Duplicates']")
	private WebElement findDuplicatesButton;
	
	@FindBy(xpath="//img[@alt='Organizations Settings']")
	private WebElement organizationSetting;
	
	@FindBy(linkText = "Go to Advanced Search")
	private WebElement gotoAdvancedSearchLink;
	
	@FindBy(name = "search_text")
	private WebElement searchFor;
	
	@FindBy(name="search_field")
	private WebElement inField;
	
	@FindBy(name="submit")
	private WebElement searchNow;
	
	@FindBy(id="viewname")
	private WebElement filtersTextField;
	
	@FindBy(linkText = "Create Filter")
	private WebElement createFilterButton;
	
	@FindBy(linkText = "Edit")
	private WebElement editButton;
	
	@FindBy(linkText = "Delete")
	private WebElement deleteFilter;
	
	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement deleteOrganizationButton;
	
	@FindBy(xpath = "//input[@value='Mass Edit']")
	private WebElement massEditButton;
	
	@FindBy(xpath="//input[@value='Send Mail']")
	private WebElement sendMailButton;
	
	@FindBy(xpath="//input[@value='Send SMS']")
	private WebElement sendSMSButton;
	
	@FindBy(xpath="//input[@value='Mailer Export']")
	private WebElement mailerExportButton;
	
	@FindBy(xpath = "//input[@name='selectall']")
	private WebElement selectAllCheckBox;
	
	@FindBy(linkText = "Organization No")
	private WebElement organizationNoButton;
	
	public WebElement getCreateOrganizationButton() {
		return createOrganizationButton;
	}

	public WebElement getSearhInOrganizationButton() {
		return searhInOrganizationButton;
	}

	public WebElement getOpenCalendarButton() {
		return openCalendarButton;
	}

	public WebElement getOpenClockButton() {
		return openClockButton;
	}

	public WebElement getOpenCalculatorButton() {
		return openCalculatorButton;
	}

	public WebElement getOpenChatButton() {
		return openChatButton;
	}

	public WebElement getOpenLastViewedButton() {
		return openLastViewedButton;
	}

	public WebElement getImportorganizationButton() {
		return importorganizationButton;
	}

	public WebElement getFindDuplicatesButton() {
		return findDuplicatesButton;
	}

	public WebElement getOrganizationSetting() {
		return organizationSetting;
	}

	public WebElement getGotoAdvancedSearchLink() {
		return gotoAdvancedSearchLink;
	}

	public WebElement getSearchFor() {
		return searchFor;
	}

	public WebElement getInField() {
		return inField;
	}

	public WebElement getSearchNow() {
		return searchNow;
	}

	public WebElement getFiltersTextField() {
		return filtersTextField;
	}

	public WebElement getCreateFilterButton() {
		return createFilterButton;
	}

	public WebElement getEditButton() {
		return editButton;
	}

	public WebElement getDeleteFilter() {
		return deleteFilter;
	}

	public WebElement getDeleteOrganizationButton() {
		return deleteOrganizationButton;
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

	public WebElement getMailerExportButton() {
		return mailerExportButton;
	}

	public WebElement getSelectAllCheckBox() {
		return selectAllCheckBox;
	}

	public WebElement getOrganizationNoButton() {
		return organizationNoButton;
	}

	public WebElement getOrganizationNameButton() {
		return organizationNameButton;
	}

	public WebElement getBillingCityButton() {
		return billingCityButton;
	}

	public WebElement getWebsiteButton() {
		return websiteButton;
	}

	public WebElement getPhoneButton() {
		return phoneButton;
	}

	public WebElement getAssignedToButton() {
		return assignedToButton;
	}

	@FindBy(linkText = "Organization Name")
	private WebElement organizationNameButton;
	
	@FindBy(linkText = "Billing City")
	private WebElement billingCityButton;
	
	@FindBy(linkText = "Website")
	private WebElement websiteButton;
	
	@FindBy(linkText = "Phone")
	private WebElement phoneButton;
	
	@FindBy(linkText = "Assigned To")
	private WebElement assignedToButton;
	
	
}