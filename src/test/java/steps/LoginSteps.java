package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import pages.LoginPage;
import pojo.User;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    User user = new User.UserBuilder()
            .setUserName("User")
            .setPassword("MySecretPassword")
            .build();

    @Given("I have navigated to login page")
    public void iHaveNavigatedToLoginPage() {
        loginPage.validateHomePage();
    }

    @And("I login with username and password")
    public void iLoginWithUserNameAndPassword() {
        loginPage.loginIn(user)
                .clickLogin();

    }
}
