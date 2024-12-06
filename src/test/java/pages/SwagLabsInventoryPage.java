package pages;

import config.baseclass.BasePage;
import config.baseclass.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SwagLabsInventoryPage extends BasePage
{
    SwagLabsProductPage home = new SwagLabsProductPage();

    WebElement itemAdicionado;
    By randomItemAdded = By.xpath("(//div[@class='inventory_item_name'])");

    public String getNameRandomItemAdded(){
        List<WebElement> itemsAdded = driver.findElements(randomItemAdded);
        for (WebElement item: itemsAdded){
            if (item.getText().contains(home.getNameRandomItem())){
                itemAdicionado = item;
                break;
            }
        }
        String rName = itemAdicionado.getText();
        return rName;
    }
}
