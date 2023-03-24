package org.automation.base;

import org.jsoup.internal.FieldsAreNonnullByDefault;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/***
 * 
 * Every Page class must and should extend Base Page
 * In this page you will find all common elements of the vtiger App
 * 
 * @author Abhijith S
 * 
 */
public abstract class Base_Page {
	public WebDriver driver;
	
	public Base_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy(linkText = "Calendar")
	private WebElement calenderLink;

	@FindBy(linkText = "Leads")
	private WebElement leadsLink;

	@FindBy(linkText = "Organizations")
	private WebElement organizationsLink;

	@FindBy(linkText = "Contacts")
	private WebElement contactsLink;

	@FindBy(linkText = "Opportunities")
	private WebElement opportunitiesLink;

	@FindBy(linkText = "Products")
	private WebElement productsLink;

	@FindBy(linkText = "Documents")
	private WebElement documentsLink;

	@FindBy(linkText = "Email")
	private WebElement emailLink;

	@FindBy(linkText = "Trouble Tickets")
	private WebElement troubleTicketsLink;

	@FindBy(linkText = "Dashboard")
	private WebElement dashboardLink;
	
	@FindBy(linkText = "More")
	private WebElement moreDropDown;
	
	@FindBy(name = "SMSNotifier")
	private WebElement smsNotifierLink;
	
	@FindBy(name = "Our Sites")
	private WebElement ourSitesLink;
	
	@FindBy(name = "Integration")
	private WebElement integrationLink;
	
	@FindBy(name = "Mail Manager")
	private WebElement mailManagerLink;
	
	@FindBy(name = "PBX Manager")
	private WebElement PBXManagerLink;
	
	@FindBy(name = "Comments")
	private WebElement commentsLink;
	
	@FindBy(name = "Recycle Bin")
	private WebElement recycleBinLink;
	
	@FindBy(name = "RSS")
	private WebElement RSSLink;
	
	@FindBy(name = "Reports")
	private WebElement reportsLink;
	
	@FindBy(name = "Campaigns")
	private WebElement campaignsLink;
	
	@FindBy(name = "Service Contracts")
	private WebElement serviceContractssLink;
	
	@FindBy(name = "Project Milestones")
	private WebElement projectMilestonesLink;
	
	@FindBy(name = "Project Tasks")
	private WebElement projectTasksLink;
	
	@FindBy(name = "Projects")
	private WebElement projectsLink;
	
	@FindBy(name = "FAQ")
	private WebElement FAQLink;
	
	@FindBy(name = "Services")
	private WebElement servicesLink;
	
	@FindBy(name = "Assets")
	private WebElement assetsLink;
	
	@FindBy(name = "Purchase Order")
	private WebElement purchaseOrderLink;
	
	@FindBy(name = "Price Books")
	private WebElement priceBooksLink;
	
	@FindBy(name = "Vendors")
	private WebElement vendorsLink;
	
	@FindBy(name = "Invoice")
	private WebElement invoiceLink;
	
	@FindBy(name = "Sales Order")
	private WebElement salesOrderLink;
	
	@FindBy(name = "Quotes")
	private WebElement quotesLink;
	
	@FindBy(id = "qccombo")
	private WebElement quickCreateDropDown;
	
	@FindBy(xpath = "//img[@onmouseout=\"fnRemoveWindow();\"]")
	private WebElement plusIcon;
	
	@FindBy(xpath = "//img[@title='Open Calendar...']")
	private WebElement calenderIcon;
	
	@FindBy(xpath = "//img[@title='Show World Clock...']")
	private WebElement clockIcon;
	
	@FindBy(xpath = "//img[@title='Open Calculator...']")
	private WebElement calculatorIcon;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCalenderLink() {
		return calenderLink;
	}

	public WebElement getLeadsLink() {
		return leadsLink;
	}

	public WebElement getOrganizationsLink() {
		return organizationsLink;
	}

	public WebElement getContactsLink() {
		return contactsLink;
	}

	public WebElement getOpportunitiesLink() {
		return opportunitiesLink;
	}

	public WebElement getProductsLink() {
		return productsLink;
	}

	public WebElement getDocumentsLink() {
		return documentsLink;
	}

	public WebElement getEmailLink() {
		return emailLink;
	}

	public WebElement getTroubleTicketsLink() {
		return troubleTicketsLink;
	}

	public WebElement getDashboardLink() {
		return dashboardLink;
	}

	public WebElement getMoreDropDown() {
		return moreDropDown;
	}

	public WebElement getSmsNotifierLink() {
		return smsNotifierLink;
	}

	public WebElement getOurSitesLink() {
		return ourSitesLink;
	}

	public WebElement getIntegrationLink() {
		return integrationLink;
	}

	public WebElement getMailManagerLink() {
		return mailManagerLink;
	}

	public WebElement getPBXManagerLink() {
		return PBXManagerLink;
	}

	public WebElement getCommentsLink() {
		return commentsLink;
	}

	public WebElement getRecycleBinLink() {
		return recycleBinLink;
	}

	public WebElement getRSSLink() {
		return RSSLink;
	}

	public WebElement getReportsLink() {
		return reportsLink;
	}

	public WebElement getCampaignsLink() {
		return campaignsLink;
	}

	public WebElement getServiceContractssLink() {
		return serviceContractssLink;
	}

	public WebElement getProjectMilestonesLink() {
		return projectMilestonesLink;
	}

	public WebElement getProjectTasksLink() {
		return projectTasksLink;
	}

	public WebElement getProjectsLink() {
		return projectsLink;
	}

	public WebElement getFAQLink() {
		return FAQLink;
	}

	public WebElement getServicesLink() {
		return servicesLink;
	}

	public WebElement getAssetsLink() {
		return assetsLink;
	}

	public WebElement getPurchaseOrderLink() {
		return purchaseOrderLink;
	}

	public WebElement getPriceBooksLink() {
		return priceBooksLink;
	}

	public WebElement getVendorsLink() {
		return vendorsLink;
	}

	public WebElement getInvoiceLink() {
		return invoiceLink;
	}

	public WebElement getSalesOrderLink() {
		return salesOrderLink;
	}

	public WebElement getQuotesLink() {
		return quotesLink;
	}

	public WebElement getQuickCreateDropDown() {
		return quickCreateDropDown;
	}

	public WebElement getPlusIcon() {
		return plusIcon;
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

	public WebElement getChatIcon() {
		return chatIcon;
	}

	public WebElement getLastViewedIcon() {
		return lastViewedIcon;
	}

	public WebElement getCahngeLayoutIcon() {
		return cahngeLayoutIcon;
	}

	public WebElement getAdministratorIcon() {
		return administratorIcon;
	}

	public WebElement getHelpIcon() {
		return helpIcon;
	}

	public WebElement getSettingsIcon() {
		return settingsIcon;
	}

	public WebElement getMyPreferencesLink() {
		return myPreferencesLink;
	}

	public WebElement getSignOutLink() {
		return signOutLink;
	}

	public WebElement getHelpLink() {
		return helpLink;
	}

	public WebElement getFeedbackLink() {
		return feedbackLink;
	}

	public WebElement getCRMSettingsLink() {
		return CRMSettingsLink;
	}

	@FindBy(xpath = "//img[@title='Chat...']")
	private WebElement chatIcon;
	
	@FindBy(xpath = "//img[@title='Last Viewed']")
	private WebElement lastViewedIcon;
	
	@FindBy(xpath = "//img[@title='Change layout']")
	private WebElement cahngeLayoutIcon;
	
	@FindBy(xpath = "//td[@onmouseout=\"fnHideDrop('ondemand_sub');\"]")
	private WebElement administratorIcon;
	
	@FindBy(xpath = "//td[@onmouseout=\"fnHideDrop('usersettings');\"]")
	private WebElement helpIcon;
	
	@FindBy(xpath = "//td[@onmouseout=\"fnHideDrop('mainsettings');\"]")
	private WebElement settingsIcon;
	
	@FindBy(id = "_my_preferences_")
	private WebElement myPreferencesLink;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signOutLink;
	
	@FindBy(linkText = "Help")
	private WebElement helpLink;
	
	@FindBy(linkText = "Feedback")
	private WebElement feedbackLink;
	
	@FindBy(linkText = "CRM Settings")
	private WebElement CRMSettingsLink;	
}
