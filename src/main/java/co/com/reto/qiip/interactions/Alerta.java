package co.com.reto.qiip.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Alerta implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).withDriver(getDriver()).waitFor(ExpectedConditions.alertIsPresent());
        BrowseTheWeb.as(actor).withDriver(getDriver()).getAlert().accept();
    }

    public static Performable aceptar() {
        return instrumented(Alerta.class);
    }
}
