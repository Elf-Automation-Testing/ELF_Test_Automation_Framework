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
public class Base_Page {

	public WebDriver driver;
	public Base_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//================Web elements or Property================
	@FindBy(linkText="Log in") 
	private WebElement loginLink;
	
	@FindBy(linkText="Register") 
	private WebElement registerLink;
	
	@FindBy(linkText="Shopping cart") 
	private WebElement shoppingCartLink;
	
	@FindBy(linkText="Wishlist") 
	private WebElement wishListLink;
	
	@FindBy(partialLinkText="BOOKS") 
	private WebElement booksModule;
	
	@FindBy(partialLinkText="COMPUTERS") 
	private WebElement computersModule;
	
	@FindBy(partialLinkText="ELECTRONICS") 
	private WebElement electronicsModule;
	
	@FindBy(partialLinkText="APPARELS") 
	private WebElement apparelsAndShoesModule;
	
	@FindBy(partialLinkText="DIGITAL DOWNLOADS") 
	private WebElement digitalDownloadsModule;
	
	@FindBy(partialLinkText="JEWELLERY") 
	private WebElement jewelleryModule;
	
	@FindBy(partialLinkText="GIFT CARDS") 
	private WebElement giftCardsModule;
	
	@FindBy(id="small-searchterms")
	private WebElement searchStoreTextBox;
	
	@FindBy(xpath="//*[@value='Search']")
	private WebElement searchButton;
	
	@FindBy(xpath="//img[@alt='Tricentis Demo Web Shop']")
	private WebElement demoWebShopLogo;
	
	//================Getters or Public services================
	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWishListLink() {
		return wishListLink;
	}

	public WebElement getBooksModule() {
		return booksModule;
	}

	public WebElement getComputersModule() {
		return computersModule;
	}

	public WebElement getElectronicsModule() {
		return electronicsModule;
	}

	public WebElement getApparelsAndShoesModule() {
		return apparelsAndShoesModule;
	}

	public WebElement getDigitalDownloadsModule() {
		return digitalDownloadsModule;
	}

	public WebElement getJewelleryModule() {
		return jewelleryModule;
	}

	public WebElement getGiftCardsModule() {
		return giftCardsModule;
	}

	public WebElement getSearchStoreTextBox() {
		return searchStoreTextBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getDemoWebShopLogo() {
		return demoWebShopLogo;
	}
		
}
