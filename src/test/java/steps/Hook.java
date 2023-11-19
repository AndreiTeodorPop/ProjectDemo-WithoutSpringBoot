package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.AbstractPage;

public class Hook extends AbstractPage {

    @Before
    public void InitializeTest() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        String appUrl = "https://demo.automationtesting.in/Register.html";
        driver.navigate().to(appUrl);
        driver.manage().window().maximize();
    }

    @After
    public void TearDownTest() {
        driver.quit();
    }

}
