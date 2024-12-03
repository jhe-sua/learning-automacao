package tutu;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class Hooks
{
    public WebDriver driver;

    @Before
    public void antesDoTeste(){
        driver = BrowserFactory.getBrowser();
    }

    @After
    public void depoisDoTeste(){
        driver.quit();
        driver = null;
    }
}
