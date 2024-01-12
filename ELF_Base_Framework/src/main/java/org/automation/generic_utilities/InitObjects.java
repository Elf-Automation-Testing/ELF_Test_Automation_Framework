package org.automation.generic_utilities;

import org.automation.element_repository.Home_Page;
import org.automation.element_repository.Login_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author Sumanth
 *
 */
public class InitObjects {

	public static WebDriver driver;
	public ReadTestData readData;
	public WebDriverWait explicitWait;
	public InitObjects initClass;
	public Login_Page loginPage;
	public Home_Page homePage;
	public String url;
	public String emailId;
	public String password;
	
	public ActionsUtil getActionsUtil(WebDriver driver) {
		return new ActionsUtil(driver);
	}
	
	public JavaScriptUtil getJavaScriptUtil(WebDriver driver) {
		return new JavaScriptUtil(driver);
	}
	
	public ReadTestData getReadTestData() {
		return new ReadTestData();
	}
	
	public UtilityMethods getUtilityMethods() {
		return new UtilityMethods();
	}
}
