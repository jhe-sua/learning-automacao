package config.support;

import config.baseclass.BaseSteps;
import io.cucumber.java.*;

public class Hooks extends BaseSteps {
    @Before
    public void antesDoTeste(Scenario _scenario) {
        scenario = _scenario;
    }

    @Before("@resetBrowser")
    public void resetBrowser() {
        closeBrownser();
        openBrownser();
    }

    @After
    public void depoisDoTeste() {
        if (scenario.isFailed())
            screenshot();
    }

    @BeforeAll
    public static void antesDeTudo() {
        openBrownser();
    }

    @AfterAll
    public static void depoisDeTudo() {
        closeBrownser();
    }
}
