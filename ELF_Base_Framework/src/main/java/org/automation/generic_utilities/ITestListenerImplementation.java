package org.automation.generic_utilities;

import org.automation.base.Base_Test;
import org.testng.ISuite;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

/***
 * 
 * Listener class to log the execution details of every test and also to take the screenshot of failed script.
 * 
 * @author Sumanth
 *
 */
public class ITestListenerImplementation extends Base_Test implements ITestListener {

	public void onFinish(ISuite suite) {					
		Reporter.log("About to end executing Suite [" + suite.getName() + "]");
	}
	
	public void onStart(ISuite suite) {								
		Reporter.log("About to begin executing Suite [" + suite.getName() + "]");
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {								
		//not implemented
	}

	public void onTestFailure(ITestResult result) {	
		initClass.getUtilityMethods().captureScreen(Base_Test.static_driver_ref, result);  		
	}		

	public void onTestSkipped(ITestResult result) {					
		Reporter.log("Test [" + result.getName() + "] skipped");
	}		

	public void onTestStart(ITestResult result) {					
		Reporter.log("Execution of the test [" + result.getName() + "] started");
	}	
	
	public void onTestSuccess(ITestResult result) {					
		Reporter.log("Test [" + result.getName() + "] passed");
	}
}
