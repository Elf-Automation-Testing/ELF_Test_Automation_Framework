package troubleTickets;

import org.automation.base.Base_Test;
import org.automation.element_repository.TroubleTickets_Page;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_VT_002_Test extends Base_Test {
	@Test
	public void toOpenNewTicketPage() {
		String expectedTroubleTicketsPage = "Administrator - Trouble Tickets - vtiger CRM 5 - Commercial Open Source CRM";
		TroubleTickets_Page troubleTickets = new TroubleTickets_Page(driver);
		troubleTickets.getTroubleTicketsLink().click();
		Assert.assertEquals(driver.getTitle(), expectedTroubleTicketsPage, "Trouble Ticket page is not displayed");
		Reporter.log("Trouble Ticket Page is displayed", true);
		troubleTickets.getCreateTicketIcon().click();
		String creatingNewTicketPage = driver.findElement(By.xpath("//span[text()='Creating New Ticket']")).getText();
		Assert.assertEquals(creatingNewTicketPage, "Creating New Ticket", "Creating New Ticket page is not displayed");
		Reporter.log("Creating New Ticket page is displayed", true);
	}
}