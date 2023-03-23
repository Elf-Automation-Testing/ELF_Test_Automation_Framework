package org.automation.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Compose_page {
	public Compose_page(WebDriver driver) {
		super();
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="cc_name")
	private WebElement CC_Name;
	public WebElement getCC_Name() {
		return CC_Name;
	}
	@FindBy(id="bcc_name")
	private WebElement BCC_Name;
	public WebElement getBCC_Name() {
		return BCC_Name;
	}
	@FindBy(id="subject")
	private WebElement Subject;
	public WebElement getSubject() {
		return Subject;
	}
	@FindBy(xpath="//input[@title=\"Select Email Template\" and @accesskey=\"Select Email Template\" ]")
	private WebElement SelectEmailTemplate;
	public WebElement getSelectEmailTemplate() {
		return SelectEmailTemplate;
	}
	@FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")
	private WebElement Save;
	public WebElement getSave() {
		return Save;
	}
	@FindBy(xpath="//input[@name=\"Send\"]")
	private WebElement Send;
	public WebElement getSend() {
		return Send;
	}
	@FindBy(xpath="//input[@name=\"Cancel [Alt+X]\"]")
	private WebElement Cancel;
	public WebElement getCancel() {
		return Cancel;
	}
	
	

}

 

