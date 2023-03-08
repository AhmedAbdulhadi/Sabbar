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

        switch (option) {
            case "allow":
                PageFactory.instance().homePage().clickOnElement(PageFactory.instance().homePage().getAllowAllButton());
                break;
            case "deny":
                PageFactory.instance().homePage().clickOnElement(PageFactory.instance().homePage().getDenyButton());
                break;
            default:
                System.err.println("wrong");
        }

    //    PageFactory.instance().homePage().cookiesAction(option);
        PageFactory.instance().homePage().cookiesAction(option);
    }

    @When("Cookies popup should be dismissed.")
    public void verifyCookiesPopup() throws InterruptedException {
        Assert.assertTrue(PageFactory.instance().homePage().verifyElementIsDisplayed(PageFactory.instance().homePage().getCookiesPopUpMessage()));
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
    public void iClickOnGetStartedButton() throws InterruptedException {
        PageFactory.instance().homePage().clickOnElement(PageFactory.instance().homePage().getStartButton());
    }

    @When("I click on signin button.")
    public void iClickOnSigninButton() throws InterruptedException {
        PageFactory.instance().homePage().clickOnElement(PageFactory.instance().homePage().getSignInButton());

    }

}
