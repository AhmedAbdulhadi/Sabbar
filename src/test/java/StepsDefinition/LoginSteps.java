package StepsDefinition;

import common.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {


    @When("i fill in my login information email is {string} and password is {string}.")
    public void fillLogin(String email, String password) throws InterruptedException {

        PageFactory.instance().loginPage().fillForm(email, password);

    }

    @Then("i should be able to navigate to dashboard app.")
    public void iShouldBeAbleToNavigateToDashboardApp() throws InterruptedException {

        Assert.assertTrue(PageFactory.instance().loginPage().getPageCurrentUrl().contains("https://app.ogram.co/uae/"));

    }

}
