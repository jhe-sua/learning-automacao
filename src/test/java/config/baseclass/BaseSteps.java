package config.baseclass;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import config.support.BrowserFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseSteps {
    public static WebDriver driver;
    public static Scenario scenario;

    public static void openBrownser() {
        if (driver != null) return;
        driver = BrowserFactory.getBrowser();
    }

    public static void closeBrownser() {
        if (driver == null) return;
        try {
            driver.quit();
            driver.close();
        } catch (Exception e) {}
        driver = null;
    }

    public static void screenshot() {
        try {
            String dataHora = (new SimpleDateFormat("yyyy-MM-dd_-_HH-mm-ss-SSS")).format(new Date());
            byte[] screenshot = ((TakesScreenshot) BaseSteps.driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", dataHora + "_screenshot.png");
        } catch (ClassCastException cce) {
            cce.printStackTrace();
        }
    }
}