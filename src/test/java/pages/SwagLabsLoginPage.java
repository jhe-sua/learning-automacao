package pages;

import config.baseclass.BasePage;
import org.openqa.selenium.By;

public class SwagLabsLoginPage extends BasePage
{
    private String url = "https://www.saucedemo.com/v1/";
    private By username = By.id("user-name");
    private By password = By.id("password");
    private By btLogin = By.id("login-button");

    public void openURL(){
        driver.get(url);
    }
    public void fillUsername(String _username){
        driver.findElement(username).sendKeys(_username);
    }
    public void fillPassword(String _password){
        driver.findElement(password).sendKeys(_password);
    }
    public void clickBtLogin(){
        driver.findElement(btLogin).click();
    }
}
