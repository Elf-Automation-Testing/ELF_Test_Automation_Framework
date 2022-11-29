package org.automation.generic_utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * 
 * @author Sumanth
 *
 */
public class ActionsUtil {

	Actions actions ;
	
	public ActionsUtil(WebDriver driver) {
		actions = new Actions(driver);
	}
	
	public void enterDataIntoTextField(WebElement targetElement , String dataToEnter) {
		targetElement.clear();
		actions.sendKeys(targetElement,dataToEnter).perform();
	}
	
	public void mouseHoverOnElement(WebElement targetElement) {
		actions.moveToElement(targetElement).perform();
	}
	
	public void mouseHoverOnElementCoordinates(WebElement targetElement, int xOffset , int yOffset) {
		actions.moveToElement(targetElement, xOffset, yOffset).perform();
	}
	
	public void moveCursorBy(int xOffset , int yOffset) {
		actions.moveByOffset(xOffset, yOffset).perform();
	}
	
	public void clickOnElement(WebElement targetElement) {
		actions.click(targetElement).perform();
	}

	public void doubleClickOnElement(WebElement targetElement) {
		actions.doubleClick(targetElement).perform();
	} 
	
	public void rightClickOnElement(WebElement targetElement) {
		actions.contextClick(targetElement).perform();
	}
	
	public void dragAndDropAnElement(WebElement sourcetElement , WebElement destElement) {
		actions.dragAndDrop(sourcetElement, destElement).perform();
	}
	
	public void dragAndDropAnElementToCoordinate(WebElement sourcetElement , int xOffset , int yOffset) {
		actions.dragAndDropBy(sourcetElement, xOffset , yOffset).perform();
	}
	
}
