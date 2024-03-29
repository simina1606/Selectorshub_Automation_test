package hub.hub_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HBasePage {
    protected WebDriver driver;

    public HBasePage(WebDriver driver){
        this.driver = driver;
    }

    protected void openHubUrl(String url){
        driver.get(url);
    }

    protected WebElement find(By locator){
        waitForElementToBeVisible(locator, 5);
        return driver.findElement(locator);
    }

    protected List<WebElement> findAll(By locator){
        waitForElementToBeVisible(locator, 5);
        return driver.findElements(locator);
    }

    protected void click(By locator){
        waitForElementToBeVisible(locator, 5);
        find(locator).click();
    }

    protected void type(By locator, String text){
        waitForElementToBeVisible(locator, 5);
        find(locator).sendKeys(text);
    }

    public String getPageUrl(){
        return driver.getCurrentUrl();
    }

    public void waitForElementToBeVisible(By locator, int timeout){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void switchToNewWindowByTitle(String expectedTitle){
        String firstWindow = driver.getWindowHandle();
        Set<String> allWindowsOpened = driver.getWindowHandles();
        Iterator<String> windowIterator = allWindowsOpened.iterator();

        while(windowIterator.hasNext()){
            String windowHandle = windowIterator.next().toString();
            if(!windowHandle.equals(firstWindow)){
                driver.switchTo().window(windowHandle);
                if(driver.getTitle().equals(expectedTitle));
                break;
            }
        }
    }

    public void switchToAllert(By locator){
        waitForElementToBeVisible(locator, 5);
        driver.switchTo().alert().dismiss();
    }

    protected void actionsMove(By locator){
        waitForElementToBeVisible(locator, 5);
        Actions actions = new Actions(driver);
        actions.moveToElement((WebElement) locator)
                .click().build().perform();
    }

    public void quit(){
        driver.quit();
    }

}
