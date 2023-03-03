package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AbstractPage;

public class Hook extends AbstractPage {

    private String appUrl = "http://www.executeautomation.com/demosite/Login.html";

    @Before
    public void InitializeTest() {
        driver = new ChromeDriver();
        driver.navigate().to(appUrl);
        driver.manage().window().maximize();
    }

    @After
    public void TearDownTest() {
        driver.quit();
    }
}
