package org.automation.generic_utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;

/**
 * 
 * @author Sumanth
 *
 */
public class UtilityMethods implements FrameworkConstants {

	/**
	 * This method is used to switch the driver control to a window based on the
	 * title
	 * 
	 * @param title of the expected page
	 */
	public void switchToASpecificTitledWindow(WebDriver driver, String title) {
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		for (String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			if (driver.getTitle().equalsIgnoreCase(title)) {
				break;
			}
		}
	}

	/**
	 * This method is used to switch the driver control to window based on an
	 * element
	 * 
	 * @param element that is present on the required page
	 */
	public void switchToASpecificWindow(WebDriver driver, WebElement element) {
		String parent = driver.getWindowHandle();
		Set<String> allWid = driver.getWindowHandles();
		allWid.remove(parent);
		for (String sessionID : allWid) {
			driver.switchTo().window(sessionID);
			if (element.isDisplayed()) {
				break;
			}
		}
	}

	/**
	 * This method is used to take the screenshot and save it in .png format with
	 * date and time along with test case name
	 * 
	 * @param driver
	 */
	public void captureScreen(WebDriver driver, ITestResult result) {
		LocalDateTime systemDate = LocalDateTime.now();
		String timeStamp = systemDate.toString().replaceAll(":", "-");
		TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
		File tempFile = takeScreenShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File(SCREENSHOT_PATH + result.getName() + timeStamp + ".png");
		try {
			FileUtils.copyFile(tempFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/***
	 * This method will select drop down based on index, value and visible text
	 * 
	 * @param listbox pass the drop down element
	 * @param data    it can be index or value or visible text
	 */
	public void selectDropDown(WebElement listbox, String option) {
		Select select = new Select(listbox);
		int counter = 0;

		try {
			int index = Integer.parseInt(option);
			select.selectByIndex(index);
			counter++;
		} catch (Exception e) {
			System.out.println("It is not a index");
		}

		if (counter == 0) {
			try {
				select.selectByVisibleText(option);
			} catch (Exception e) {
				select.selectByValue(option);
			}
		}
	}

	/**
	 * This method helps to switch the control to a particular frame based on
	 * index/name/id
	 * 
	 * @param driver        pass the driver instance
	 * @param indexNameOrId
	 */
	public void switchToFrame(WebDriver driver, String indexNameOrId) {
		try {
			int index = Integer.parseInt(indexNameOrId);
			driver.switchTo().frame(index);
		} catch (NumberFormatException e) {
			driver.switchTo().frame(indexNameOrId);
		}
	}
	
	/**
	 * This method will generate a random number within the boundary which is passed
	 * @param boundary upper limit of your random number
	 * @return
	 */
	public int giveRandomNumber(int boundary) {
		Random random = new Random();
		return random.nextInt(boundary);
	}
	
	/**
	 * This method will give the system date
	 * @return
	 */
	public Date giveSystemDate() {
		return new Date();
	}
}
