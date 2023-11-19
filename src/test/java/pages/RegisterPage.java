package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pojo.User;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;


public class RegisterPage extends AbstractPage {

    public RegisterPage() {
        InitPage();
    }

    @FindBy(how = How.XPATH, using = "//input[@ng-model='FirstName']")
    private WebElement firstName;
    @FindBy(how = How.XPATH, using = "//input[@ng-model='LastName']")
    private WebElement lastName;
    @FindBy(how = How.XPATH, using = "//button[@id='Button1']")
    private WebElement refresh;
    @FindBy(how = How.XPATH, using = "(//p[@class='fc-button-label'])[1]")
    private WebElement consent;
    @FindBy(how = How.XPATH, using = "//a[contains(@href,'Index.html')]")
    private WebElement homePageButton;

    public RegisterPage validateRegisterPage() {
        assertEquals("Register", driver.getTitle());
        return this;
    }

    public RegisterPage acceptConsent() {
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
        w.until(ExpectedConditions.visibilityOf(consent));
        consent.click();
        return this;
    }

    public RegisterPage registerUser(User user) {
        firstName.sendKeys(user.getFirstName());
        lastName.sendKeys(user.getLastName());
        return this;
    }

    public RegisterPage clickRefresh() {
        refresh.submit();
        return this;
    }

    public HomePage goToHomePage() {
        homePageButton.click();
        return new HomePage();
    }

}
