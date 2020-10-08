package co.com.reto.qiip.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirNavegador implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.relativeUrl("https://www.demoblaze.com/index.html")
        );
    }

    public static Performable deDemoblaze() {
        return instrumented(AbrirNavegador.class);
    }
}
