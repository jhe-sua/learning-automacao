package tutu;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Runner extends Hooks
{
    @Test
    public void teste() throws InterruptedException{
        driver.get("https//www.google.com.br");
        Thread.sleep(4000);
    }

}
