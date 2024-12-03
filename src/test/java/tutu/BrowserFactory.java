package tutu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory {
    public static WebDriver getBrowser(){
        //Aqui criamos a variavel google e options. google é o navegador
        //e options são as configurações dele
        WebDriver google;
        ChromeOptions options;

        //Inicializando options
        options = new ChromeOptions();

        //Passando parametros "configurando"
        options.addArguments("--disable-crash-reporter");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-dev-shm");
        options.addArguments("--disable-notifications");

        //Inicializando o Navegador com as configurações criadas
        //maximizando a janela
        google = new ChromeDriver(options);
        google.manage().window().maximize();

        //Retornamos o navegador para que possa ser aberto pelo selenium
        return google;
    }
}
