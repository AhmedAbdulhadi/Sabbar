package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {

    protected static WebDriver driver = null;
    protected static WebDriverWait wait;



    public PageBase(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 60);
        PageFactory.initElements(driver, this);
    }

    public void clickOnElement(WebElement element) throws InterruptedException {

        try {

            // Check the presence of alert
            Alert alert = driver.switchTo().alert();
            // if present consume the alert
            alert.accept();

        } catch (NoAlertPresentException ex) {
            //code to do if not exist.
        }
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

    }

    public String getPageCurrentUrl() throws InterruptedException {

        Thread.sleep(5000);
        return driver.getCurrentUrl();
    }

    public boolean verifyElementIsDisplayed(WebElement element){

        return wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void sendKeys(WebElement element, String value){

        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(value);
    }
    public void sendKeyCharByChar(WebElement element, String Value) {
        for (int i = 0; i <Value.length(); i++) {
            element.sendKeys(String.valueOf(Value.charAt(i)));
        }
    }

    public WebElement waitElement(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitElement(WebElement element, int seconds ){
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void refresh() {
        driver.navigate().refresh();
    }
    public void CloseDriver() {
        driver.quit();
    }

}
