package StepsDefinition;

import common.PageFactory;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class HomeSteps {

    @Given("Open the orgam site.")
    public void open_the_sis_site() {
        // Write code here that turns the phrase above into concrete actions
        PageFactory.instance().homePage().openSite();
    }
    @When("^Click on (.*?) option in cookies\\.$")
    public void clickOnCookkies(String option) throws InterruptedException {

        PageFactory.instance().homePage().cookiesAction(option);

    }

    @When("Cookies popup should be dismissed.")
    public void verifyCookiesPopup() throws InterruptedException {
        Assert.assertTrue(PageFactory.instance().homePage().verifyCookiesDialogIfDisplayed());
    }

    @When("^I click on industries dropdown list and select (.*?)\\.$")
    public void iClickOnIndustriesDropdownList(String option) throws InterruptedException {
        PageFactory.instance().homePage().selectFromDropdown(option);
    }

    @Then("^I should be navigated to (.*?) page\\.$")
    public void iShouldBeNavigatedToIndustryPage(String page) throws InterruptedException {
        Assert.assertTrue(PageFactory.instance().homePage().getPageCurrentUrl().contains(page.toLowerCase()));
    }

    @When("I click on get started button.")
    public void clickOnGetStartedButton() throws InterruptedException {
        PageFactory.instance().homePage().clickOnGetStarted();
    }

    @When("I click on signin button.")
    public void iClickOnSigninButton() throws InterruptedException {
        PageFactory.instance().homePage().clickOnSigninButton();

    }

}
