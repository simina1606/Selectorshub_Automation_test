package hub.hub_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseTestClass;

public class HubAlertsPage extends HBasePage {
    public HubAlertsPage(WebDriver driver) {
        super(driver);
    }

    private String pageUrl = "https://selectorshub.com/xpath-practice-page/";
    private By windowAlertLocator = By.xpath("//button[text()='Click To Open Window Alert']");
    private String allertText ="Press a button!";
    private By result = By.linkText("data:text/javascript;base64,CiAgIHZhciBjID0gZG9jdW1lbnQuZ2V0RWxlbWVudEJ5SWQoImNhbnBybyIpOwogICB2YXIgY3R4ID0gYy5nZXRDb250ZXh0KCIyZCIpOwogICBjdHguZm9udCA9ICIyMHB4IEFyaWFsIjsKICAgY3R4LmZpbGxUZXh0KCJQYWdlIE1hcCIsMTAsNTApOwogICBmdW5jdGlvbiBuYW1lRmllbGQoKXsKICAgICB2YXIgbmFtZSA9IGRvY3VtZW50LnF1ZXJ5U2VsZWN0b3IoIi5uYW1lRmxkIik7CiAgICAgbmFtZS5kaXNhYmxlZCA9IGZhbHNlOwogICB9CgogICBmdW5jdGlvbiB3aW5kb3dBbGVydEZ1bmN0aW9uKCkgewogICAgIHZhciB0eHQ7CiAgICAgaWYgKGNvbmZpcm0oIlByZXNzIGEgYnV0dG9uISIpKSB7CiAgICAgICB0eHQgPSAiWW91IHByZXNzZWQgT0shIjsKICAgICB9IGVsc2UgewogICAgICAgdHh0ID0gIllvdSBwcmVzc2VkIENhbmNlbCEiOwogICAgIH0KICAgfQoKICAgZnVuY3Rpb24gcHJvbXB0QWxlcnRGdW5jdGlvbigpIHsKICAgICBsZXQgdGV4dDsKICAgICBsZXQgcGVyc29uID0gcHJvbXB0KCJEbyB5b3UgaGF2ZSBUZXN0aW5nIERhaWx5IE1vYmlsZSBBcHA/IiwgIlllcyEiKTsKICAgICBpZiAocGVyc29uID09IG51bGwgfHwgcGVyc29uID09ICIiKSB7CiAgICAgICB0ZXh0ID0gIlVzZXIgY2FuY2VsbGVkIHRoZSBwcm9tcHQuIjsKICAgICB9IGVsc2UgewogICAgICAgdGV4dCA9ICJIZWxsbyAiICsgcGVyc29uICsgIiEgSG93IGFyZSB5b3UgdG9kYXk/IjsKICAgICB9Cn0K");


    public void openChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C://Users//ACER//Downloads//chromedriver.exe");
    }

    public void openHomePage(){
        openHubUrl(pageUrl);
    }

    public boolean isWindowAlertVisible(){
        find(windowAlertLocator);
        return true;
    }

    public void clickOnWindowAlert(){
        click(windowAlertLocator);
    }
    public void dismissAlert(){
        switchToAllert(result);
    }



}
