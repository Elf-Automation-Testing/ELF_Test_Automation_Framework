 package org.automation.generic_utilities;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;

/**
 * 
 * @author Sumanth
 *
 */
public class InitObjects {

//	public WebDriver driver;
//	public InitObjects(WebDriver driver) {
//		this.driver=driver;
		//super(driver);
		// TODO Auto-generated constructor stub
//	}     
	
	public WebDriver driver;

	
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
