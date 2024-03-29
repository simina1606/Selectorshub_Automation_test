package hub.hub_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Date;

public class HubPickADatePage extends HBasePage{
    public HubPickADatePage(WebDriver driver) {
        super(driver);
    }

    private String pageUrl = "https://selectorshub.com/xpath-practice-page/";
    private By datePickerLocator = By.name("the_date");
    private String selectedDate = "06/16/1991";


    public void openChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C://Users//ACER//Downloads//chromedriver.exe");
    }

    public void openHomePage(){
        openHubUrl(pageUrl);
    }

    public void pickADate(String text){
        type(datePickerLocator, text);
    }

}
