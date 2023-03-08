package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends PageBase {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    /* ######### WEB ELEMENTS DEFINITION ######## */
    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    private WebElement allowAllButton;
    public WebElement getAllowAllButton(){
        return allowAllButton;
    }


    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[1]/div[1]/nav/div[1]")
    private WebElement industries;
    public WebElement getIndustries() {
        return industries;
    }

    @FindAll({
            @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[1]/div[1]/nav/div[1]/div/a[1]"),
            @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[1]/div[1]/nav/div[1]/div/a[2]"),
            @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[1]/div[1]/nav/div[1]/div/a[3]"),
            @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[1]/div[1]/nav/div[1]/div/a[4]"),
    })
    private List<WebElement> industriesDropdown;
    public List<WebElement> getIndustriesDropdown() {
        return industriesDropdown;
    }

    @FindBy(xpath = "//*[@id=\"CybotCookiebotDialog\"]")
    private WebElement cookiesPopUpMessage;
    public WebElement getCookiesPopUpMessage() {
        return cookiesPopUpMessage;
    }


    @FindBy(id = "CybotCookiebotDialogBodyButtonDecline")
    private WebElement denyButton;
    public WebElement getDenyButton() {
        return denyButton;
    }
    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[1]/div[2]/div[3]")
    private WebElement startButton;
    public WebElement getStartButton() {
        return startButton;
    }
    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[7]/div[2]/div/a[2]/div[2]/span/a")
    private WebElement signInButton;
    public WebElement getSignInButton() {
        return signInButton;
    }


    /* ######### WEB ELEMENTS ACTION METHODS ######## */
    public void openSite() {
        driver.get("https://www.ogram.co/uae/en/");
    }

    public void cookiesAction(String option) throws InterruptedException {
        switch (option) {
            case "allow":
                clickOnElement(getAllowAllButton());
                break;
            case "deny":
                clickOnElement(getDenyButton());
                break;
            default:
                System.err.println("wrong");
        }
    }
    public boolean verifyCookiesDialogIfDisplayed() throws InterruptedException {

        Thread.sleep(5000);
        return verifyElementIsDisplayed(getCookiesPopUpMessage());
    }

    public void selectFromDropdown(String option) throws InterruptedException {

        clickOnElement(getIndustries());
        switch (option){
            case "Hospitality":
                clickOnElement(getIndustriesDropdown().get(0));
                break;
            case "Retail":
                clickOnElement(getIndustriesDropdown().get(1));
                break;
            case "Warehousing":
                clickOnElement(getIndustriesDropdown().get(2));
                break;
            case "Logistics":
                clickOnElement(getIndustriesDropdown().get(3));
                break;

            default:
                System.out.println("ERROR!");
                break;

        }
    }

    public void clickOnGetStarted(){

        wait.until(ExpectedConditions.visibilityOf(startButton)).click();
    }

}
