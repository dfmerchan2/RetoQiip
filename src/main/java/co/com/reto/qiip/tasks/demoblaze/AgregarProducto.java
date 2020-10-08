package co.com.reto.qiip.tasks.demoblaze;

import co.com.reto.qiip.interactions.Alerta;
import co.com.reto.qiip.userinterfaces.HomePage;
import co.com.reto.qiip.userinterfaces.ProductoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static co.com.reto.qiip.utilities.demoblaze.ConstantesDemoblaze.HOME;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class AgregarProducto implements Task {

    private List<Map<String, String>> articulos;

    public AgregarProducto(List<Map<String, String>> articulos) {
        this.articulos = articulos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        IntStream.range(0, articulos.size())
                .forEach(
                        datos ->
                                actor.attemptsTo(
                                        WaitUntil.the(HomePage.BTN_CATEGORIA.of(articulos.get(datos).get("Categoria")), isCurrentlyVisible()),
                                        Click.on(HomePage.BTN_CATEGORIA.of(articulos.get(datos).get("Categoria"))),
                                        Scroll.to(HomePage.BTN_PRODUCTO.of(articulos.get(datos).get("Producto"))),
                                        Click.on(HomePage.BTN_PRODUCTO.of(articulos.get(datos).get("Producto"))),
                                        WaitUntil.the(ProductoPage.BTN_AGREGAR, isEnabled()),
                                        MoveMouse.to(ProductoPage.BTN_AGREGAR).andThen(actions -> actions.click()),
                                        Alerta.aceptar(),
                                        WaitUntil.the(HomePage.BTN_OPCIONES_MENU.of(HOME), isEnabled()),
                                        Click.on(HomePage.BTN_OPCIONES_MENU.of(HOME))
                                )
                );
    }

    public static Performable alCarrito(List<Map<String, String>> articulos) {
        return instrumented(AgregarProducto.class, articulos);
    }
}
