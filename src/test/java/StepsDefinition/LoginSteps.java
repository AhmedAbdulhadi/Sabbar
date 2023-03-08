package StepsDefinition;

import common.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {


    @When("i fill in my login information.")
    public void iFillInMyLoginInformation() throws InterruptedException {

        PageFactory.instance().loginPage().sendKeys(PageFactory.instance().loginPage().getEmailField(),"ahmedwajieh93@gmail.com");
        PageFactory.instance().loginPage().sendKeys(PageFactory.instance().loginPage().getPasswordField(),"Test@1234");
        PageFactory.instance().loginPage().clickOnElement(PageFactory.instance().loginPage().getLoginButton());
    }

    @Then("i should be able to navigate to dashboard app.")
    public void iShouldBeAbleToNavigateToDashboardApp() throws InterruptedException {

        PageFactory.instance().loginPage().getPageCurrentUrl().contains("https://app.ogram.co/uae/");

    }
}
