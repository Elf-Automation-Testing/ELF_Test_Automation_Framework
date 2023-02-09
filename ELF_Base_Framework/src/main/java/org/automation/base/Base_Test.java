package org.automation.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.automation.element_repository.Home_Page;
import org.automation.element_repository.Login_Page;
import org.automation.generic_utilities.FrameworkConstants;
import org.automation.generic_utilities.InitObjects;
import org.automation.generic_utilities.ReadTestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

/***
 * 
 * Every Automation script must and should extend Base_Test
 * In this class we have methods for browserSetup, loginToApplication, logoutOfApplication and browserTearDown
 * which is required for all the automation scripts
 * 
 * @author Sumanth
 * @author <a href="mailto:sumanth[dot]l[at]testyanta[dot]com">sumanth.l@testyantra.com</a>
 *
 */
public abstract class Base_Test extends InitObjects implements FrameworkConstants {

	public static WebDriver driver;
	public ReadTestData readData;
	public WebDriverWait explicitWait;
	public InitObjects initClass;
	public Login_Page loginPage;
	public Home_Page homePage;
	public String url;
	public String emailId;
	public String password;

	/**
	 * This function performs the browser setup *
	 * 
	 * @param browserName this method receives the parameter from xml file and based
	 *                    on the value passed it will launch the respective browser,
	 *                    if browser name is not passed from xml file then it will
	 *                    try to take the value from property file with the key
	 *                    <b>browser</b>
	 * @throws InvalidBrowserValueException if browser value is not passed either
	 *                                      from xml or property file then it will
	 *                                      throw Invalid browser exception
	 */
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void browserSetUp(@Optional("noValue") String browserName) throws InvalidBrowserValueException {
		readData = new ReadTestData();
		if (browserName.equalsIgnoreCase("noValue")) {
			browserName = readData.readDataFromPropertyFile("browser");
			if (browserName.equalsIgnoreCase("null")) {
				Reporter.log("Pass a valid browser name from Property file");
				throw new InvalidBrowserValueException();
			}
		} 
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			Reporter.log("Successfully Launched Chrome Browser", true);
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			Reporter.log("Successfully Launched Firefox Browser", true);
		}
		driver.manage().window().maximize();
		Reporter.log("Browser window is maximized successfully", true);
		driver.manage().timeouts().implicitlyWait(IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
		explicitWait = new WebDriverWait(driver, EXPLICIT_TIMEOUT);
		initClass = new InitObjects();
	}

	/**
	 * This function performs login to the application
	 */
	@BeforeMethod(alwaysRun = true)
	public void loginToApplication() {
		
		url = readData.readDataFromPropertyFile("url");
		emailId = readData.readDataFromPropertyFile("emailId");
		password = readData.readDataFromPropertyFile("password");

		driver.get(url);
		loginPage = new Login_Page(driver);
		homePage = loginPage.login(emailId, password);
	}

	/**
	 * this function performs logout action
	 * @throws IOException 
	 */
	@AfterMethod(alwaysRun = true)
	public void logoutOfApplication() throws IOException {
		homePage.logout();
	}

	/**
	 * this function stops the driver instance
	 */
	@AfterClass(alwaysRun = true)
	public void browserTearDown() {
		driver.quit();
	}

// *****************************************************************************
// ==============================Custom Exceptions==============================
// *****************************************************************************

	@SuppressWarnings("serial")
	class InvalidBrowserValueException extends Exception {
		public InvalidBrowserValueException() {
			super("Please provide browser value either in XML file or property file");
		}
	}
}
