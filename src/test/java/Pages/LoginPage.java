package Pages;

import common.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /* ######### WEB ELEMENTS DEFINITION ######## */
    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailField;
    public WebElement getEmailField() {
        return emailField;
    }

    @FindBy( xpath = "//input[@type='password']")
    private WebElement passwordField;
    public WebElement getPasswordField() {
        return passwordField;
    }

    @FindBy( xpath = "//*[@id=\"main_layout\"]/main/div[2]/button")
    private WebElement loginButton;
    public WebElement getLoginButton() {
        return loginButton;
    }


    public void fillForm(String email, String password){

        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getLoginButton().click();

        }

}
