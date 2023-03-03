package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pojo.User;

import static org.testng.AssertJUnit.assertEquals;


public class LoginPage extends AbstractPage {

    public LoginPage() {
        InitPage();
    }

    @FindBy(how = How.NAME, using = "UserName")
    private WebElement txtUserName;

    @FindBy(how = How.NAME, using = "Password")
    private WebElement txtPassword;

    @FindBy(how = How.NAME, using = "Login")
    private WebElement btnLogin;

    public LoginPage validateHomePage() {
        assertEquals("Execute Automation", driver.getTitle());
        return this;
    }

    public LoginPage loginIn(User user) {
        txtUserName.sendKeys(user.getUserName());
        txtPassword.sendKeys(user.getPassword());
        return this;
    }

    public LoginPage clickLogin() {
        btnLogin.submit();
        return this;
    }

}
