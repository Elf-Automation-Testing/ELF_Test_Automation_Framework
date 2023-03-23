package org.automation.generic_utilities;

import org.openqa.selenium.WebDriver;

/**
 * 
 * @author Sumanth
 *
 */
public class InitObjects {

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