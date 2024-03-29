package hub;

import hub.hub_pages.HubAlertsPage;
import hub.hub_pages.HubFormPage;
import hub.hub_pages.HubPickADatePage;
import hub.hub_pages.HubDropdownPage;
import org.junit.Assert;
import org.junit.Test;
import utils.BaseTestClass;

public class HubTests extends BaseTestClass {

    @Test

    public void completeFieldsTest(){
        HubFormPage hubWelcomePage = new HubFormPage(driver);
        hubWelcomePage.openChromeBrowser();
        hubWelcomePage.openHubHomePage();

        Assert.assertTrue(hubWelcomePage.isEmailFieldVisible());
        hubWelcomePage.completeFields("email@email.com", "Password123!", "Company", "0000000000");
        hubWelcomePage.clickSubmit();

        Assert.assertTrue(hubWelcomePage.isSubmitButtonClicked());
        hubWelcomePage.quit();
    }

@Test

    public void dropdownTest(){
    HubDropdownPage hubSecondPage = new HubDropdownPage(driver);
    hubSecondPage.openChromeBrowser();
    hubSecondPage.openSecondPage();
    hubSecondPage.selectOption("Audi");
    Assert.assertEquals("Audi", hubSecondPage.getSelectedOption());
    hubSecondPage.quit();
}

@Test
    public void datePickerTest(){
    HubPickADatePage hubPickADatePage = new HubPickADatePage(driver);
    hubPickADatePage.openChromeBrowser();
    hubPickADatePage.openHomePage();
    hubPickADatePage.pickADate("06/16/1991");
    hubPickADatePage.quit();
}

@Test

    public void alertsTest(){
    HubAlertsPage hubAlertsPage = new HubAlertsPage(driver);
    hubAlertsPage.openChromeBrowser();
    hubAlertsPage.openHomePage();
    Assert.assertTrue(hubAlertsPage.isWindowAlertVisible());
    hubAlertsPage.clickOnWindowAlert();
    hubAlertsPage.dismissAlert();
    hubAlertsPage.quit();

}
}
