package org.automation.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLead_Page {
	
	public WebDriver driver;
	public CreateLead_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(name="firstname")
	private WebElement firstNameTextField;
	
	@FindBy(name="lastname")
	private WebElement lastNameTextField;
	
	@FindBy(name="company")
	private WebElement companyTextField;
	
	@FindBy(id="designation")
	private WebElement titleTextField;
	
	@FindBy(name="leadsource")
	private WebElement leadSource;
	
	@FindBy(name="industry")
	private WebElement industry;
	
	@FindBy(name="annualrevenue")
	private WebElement annualRevenue;
	
	@FindBy(id="noofemployees")
	private WebElement noOfEmployees;
	
	@FindBy(id="secondaryemail")
	private WebElement secondaryEmail;
	
	@FindBy(id="phone")
	private WebElement phoneTextField;
	
	@FindBy(id="mobile")
	private WebElement mobileTextField;
	
	@FindBy(id="fax")
	private WebElement faxTextField;
	
	@FindBy(id="email")
	private WebElement emailTextField;
	
	@FindBy(name="website")
	private WebElement websiteTextField;
	
	@FindBy(name="leadstatus")
	private WebElement leadStatus;
	
	@FindBy(name="rating")
	private WebElement ratingTextField;
	
	@FindBy(name="lane")
	private WebElement streetTextField;
	
	@FindBy(name="code")
	private WebElement postalCodeTextField;
	
	@FindBy(id="country")
	private WebElement countryTextField;
	
	@FindBy(id="pobox")
	private WebElement poboxTextField;
	
	@FindBy(id="city")
	private WebElement cityTextField;
	
	@FindBy(id="state")
	private WebElement stateTextField;
	
	@FindBy(name="description")
	private WebElement descriptionTextField;
	
	@FindBy(xpath="//input[@class=\"crmbutton small save\"]")
	private WebElement saveButton;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getCompanyTextField() {
		return companyTextField;
	}

	public WebElement getTitleTextField() {
		return titleTextField;
	}

	public WebElement getLeadSource() {
		return leadSource;
	}

	public WebElement getIndustry() {
		return industry;
	}

	public WebElement getAnnualRevenue() {
		return annualRevenue;
	}

	public WebElement getNoOfEmployees() {
		return noOfEmployees;
	}

	public WebElement getSecondaryEmail() {
		return secondaryEmail;
	}

	public WebElement getPhoneTextField() {
		return phoneTextField;
	}

	public WebElement getMobileTextField() {
		return mobileTextField;
	}

	public WebElement getFaxTextField() {
		return faxTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getWebsiteTextField() {
		return websiteTextField;
	}

	public WebElement getLeadStatus() {
		return leadStatus;
	}

	public WebElement getRatingTextField() {
		return ratingTextField;
	}

	public WebElement getStreetTextField() {
		return streetTextField;
	}

	public WebElement getPostalCodeTextField() {
		return postalCodeTextField;
	}

	public WebElement getCountryTextField() {
		return countryTextField;
	}

	public WebElement getPoboxTextField() {
		return poboxTextField;
	}

	public WebElement getCityTextField() {
		return cityTextField;
	}

	public WebElement getStateTextField() {
		return stateTextField;
	}

	public WebElement getDescriptionTextField() {
		return descriptionTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

}
