package hub.hub_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HubDropdownPage extends HBasePage{
    public HubDropdownPage(WebDriver driver) {
        super(driver);
    }

    private String pageUrl = "https://selectorshub.com/xpath-practice-page/";
    private By dropdownLocator = By.id("cars");


    public void openChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C://Users//ACER//Downloads//chromedriver.exe");
    }

    public void openSecondPage(){
        openHubUrl(pageUrl);
    }

    public void selectOption(String text){
    WebElement dropdownCars = find(dropdownLocator);
    Select dropdown = new Select(dropdownCars);
    dropdown.selectByVisibleText(text);
    }

    public String getSelectedOption(){
        WebElement dropdownCars = find(dropdownLocator);
        Select dropdown = new Select(dropdownCars);
        String selectedOption = dropdown.getFirstSelectedOption().getText();
        return selectedOption;
    }
}
