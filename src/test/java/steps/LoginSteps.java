package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPage;
import pojo.User;

public class LoginSteps {

    RegisterPage registerPage = new RegisterPage();

    User user = new User.UserBuilder()
            .setFirstName("Andrei")
            .setLastName("Pop")
            .build();

    @Given("I have navigated to register page")
    public void iHaveNavigatedToRegisterPage() {
        registerPage.validateRegisterPage();
    }

    @When("I enter first and last name to Full Name box")
    public void iRegisterWithFirstNameAndLastName() {
        registerPage.acceptConsent();
        registerPage.registerUser(user);
    }

    @Then("I refresh the page and navigate to Home Page")
    public void iRefreshThePage() throws InterruptedException {
        registerPage.clickRefresh();
        registerPage.goToHomePage();
        Thread.sleep(5000);
    }
}
