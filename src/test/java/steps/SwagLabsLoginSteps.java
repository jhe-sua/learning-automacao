package steps;

import config.baseclass.BaseSteps;
import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.SwagLabsLoginPage;
import pages.SwagLabsProductPage;

public class SwagLabsLoginSteps extends BaseSteps
{
    SwagLabsLoginPage login = new SwagLabsLoginPage();
    SwagLabsProductPage pt = new SwagLabsProductPage();

    @Dado("que o usuario esta no site Swag Labs na pagina de login")
    public void queOUsuarioEstaNoSiteSwagLabsNaPaginaDeLogin()
    {
        login.openURL();
    }

    @Quando("o usuario prencher username com {string}")
    public void o_usuario_prencher_username_com(String _user)
    {
        login.fillUsername(_user);
    }

    @Quando("o usuario preencher password com {string}")
    public void o_usuario_preencher_password_com(String _pass)
    {
        login.fillPassword(_pass);
    }

    @Quando("o usuario logar")
    public void o_usuario_logar() throws InterruptedException {
        login.clickBtLogin();
    }

    @Entao("a Pagina Swag Labs exibe a pagina de produtos")
    public void a_pagina_swag_labs_exibe_a_pagina_de_produtos()
    {
        Assert.assertEquals("Products",pt.getTitleProduct());
    }
}
