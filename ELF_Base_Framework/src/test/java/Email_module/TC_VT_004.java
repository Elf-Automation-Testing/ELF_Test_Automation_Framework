package Email_module;

import org.automation.base.Base_Test;
import org.automation.element_repository.Email_page;
import org.testng.annotations.Test;

public class TC_VT_004 extends Base_Test {
	@Test
	public void ClickOnContacts() {
		Email_page mail=new Email_page(driver);
		mail.getEmailButton().click();
		mail.getContacts().click();
		
	}

}
