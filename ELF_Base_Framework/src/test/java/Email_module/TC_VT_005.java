package Email_module;

import org.automation.base.Base_Test;
import org.automation.element_repository.Email_page;
import org.testng.annotations.Test;

public class TC_VT_005 extends Base_Test {
	@Test
	public void ToOrganisation() {
		Email_page email=new Email_page(driver);
		email.getEmailButton().click();
		email.getOrganizations().click();
		
	}

}
