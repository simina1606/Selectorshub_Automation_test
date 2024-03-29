package hub.hub_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HubFormPage extends HBasePage{
    public HubFormPage(WebDriver driver){
        super(driver);
    }

    private String pageUrl = "https://selectorshub.com/xpath-practice-page/";
    private By emailLocator = By.xpath("//input[@placeholder='Enter email']");
    private By passwordLocator = By.id("pass");
    private By companyLocator = By.xpath("//input[@placeholder='Enter your company']");
    private By phoneLocator = By.xpath("//input[@placeholder='Enter your mobile number']");
    private By submitLocator = By.xpath("//button[@value='Submit' and text()='Submit']");

    public void openChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C://Users//ACER//Downloads//chromedriver.exe");
    }

    public void openHubHomePage(){
        openHubUrl(pageUrl);
    }
    public boolean isEmailFieldVisible(){
        find(emailLocator);
        return true;
    }

    public void completeFields(String email, String password, String company, String phone){
        type(emailLocator, email);
        type(passwordLocator, password);
        type(companyLocator, company);
        type(phoneLocator, phone);
    }

    public void clickSubmit(){
        click(submitLocator);
    }

    public boolean isSubmitButtonClicked(){
        find(submitLocator).isSelected();
        return true;
    }

}
