package steps;

import config.baseclass.BaseSteps;
import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.SwagLabsInventoryPage;
import pages.SwagLabsLoginPage;
import pages.SwagLabsProductPage;

public class SwagLabsProductSteps extends BaseSteps
{
    SwagLabsLoginPage login = new SwagLabsLoginPage();
    SwagLabsProductPage home = new SwagLabsProductPage();
    SwagLabsInventoryPage inv = new SwagLabsInventoryPage();
    String randomName;

    //"(//button[@class='btn_primary btn_inventory'])" vetor xpaht botao add to cart
    @Dado("que o usuario esta na home")
    public void que_o_usuario_esta_na_home() {
        login.openURL();
        login.fillUsername("standard_user");
        login.fillPassword("secret_sauce");
        login.clickBtLogin();
        screenshot();
    }
    @Quando("o usuario acrescentar um item no carrinho")
    public void o_usuario_acrescentar_um_item_no_carrinho() {
        home.addCartRandomItem();
        randomName = home.getNameRandomItem();
        screenshot();
    }
    @Quando("o usuario abrir a pagina do carrinho")
    public void o_usuario_abrir_a_pagina_do_carrinho() throws InterruptedException {
        home.clickCarrinho();
        Thread.sleep(4000);
    }
    @Entao("o sistema exibira os itens acrescentados pelo usuario")
    public void o_sistema_exibira_os_itens_acrescentados_pelo_usuario() {
        String real = inv.getNameRandomItemAdded();
        Assert.assertEquals(randomName,real);
        screenshot();
    }
}
