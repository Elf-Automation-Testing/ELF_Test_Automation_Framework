package Email_module;

import org.automation.base.Base_Test;
import org.automation.element_repository.Email_page;
import org.automation.generic_utilities.InitObjects;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_VT_002 extends Base_Test {
	@Test
	public void Qualified_mail() {
		//String excepted_result=" Administrator - Email - vtiger CRM 5 - Commercial Open Source CRM";
		Email_page mail=new Email_page(driver);
		
		mail.getEmailButton().click();
//		Assert.assertEquals(driver.getTitle(), excepted_result);
//		Reporter.log(excepted_result);
	    
		
		
	}
	

}
