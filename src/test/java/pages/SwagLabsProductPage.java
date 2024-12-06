package pages;

import config.baseclass.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class SwagLabsProductPage extends BasePage
{
    // (//div[@class='inventory_item_name']) names xpaht
    Random rn = new Random();

    private String url = "https://www.saucedemo.com/v1/inventory.html";
    private By carrinho = By.cssSelector("#shopping_cart_container > a");
    private WebElement filtro;
    private By leftBar = By.cssSelector("#menu_button_container > div > div:nth-child(3) > div > button");
    private By title = By.cssSelector("#inventory_filter_container > div");
        private By lbAllItens;
        private By lbAbout;
        private By lbLogout;
        private By lbResetAppState;
    private By itemName = By.xpath("(//div[@class='inventory_item_name'])");
        private By itemImg;
        private By itemAddToCart = By.xpath("(//button[@class='btn_primary btn_inventory'])");
        private By itemTitle;
        private int randomNumber;

    public void openURL(){
        driver.get(url);
    }

    public void clickCarrinho(){
        driver.findElement(carrinho).click();
    }

    public void clickFiltroWihtIndex(int index){
        this.filtro = driver.findElement(By.cssSelector("#inventory_filter_container > select"));
        Select wicht = new Select(filtro);
        wicht.selectByIndex(index);
    }

    public void openLeftBarWI(int index){
        driver.findElement(leftBar).click();
        By xpaht = By.xpath("(//a[@class='bm-item menu-item'])"+"["+index+"]");
        driver.findElement(xpaht).click();
    }
    public String getTitleProduct(){
        return driver.findElement(title).getText();
    }
    public void addCartRandomItem(){
        List<WebElement> addButtons = driver.findElements(itemAddToCart);
        randomNumber = rn.nextInt(addButtons.size());
        WebElement randomButton = addButtons.get(randomNumber);
        randomButton.click();
    }
    public String getNameRandomItem(){
        List<WebElement> addName = driver.findElements(itemName);
        WebElement randomName = addName.get(randomNumber);
        return randomName.getText();
    }
}


