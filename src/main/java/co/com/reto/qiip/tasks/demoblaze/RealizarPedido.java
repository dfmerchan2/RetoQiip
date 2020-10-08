package co.com.reto.qiip.tasks.demoblaze;

import co.com.reto.qiip.models.Usuario;
import co.com.reto.qiip.models.builder.UsuarioBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.reto.qiip.userinterfaces.HomePage.BTN_OPCIONES_MENU;
import static co.com.reto.qiip.userinterfaces.ProductoPage.*;
import static co.com.reto.qiip.utilities.demoblaze.ConstantesDemoblaze.CART;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarPedido implements Task {

    private Usuario usuario;

    public RealizarPedido(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_OPCIONES_MENU.of(CART)),
                Click.on(BTN_REALIZAR_PEDIDO),
                Enter.theValue(usuario.getNombre()).into(TXT_NAME),
                Enter.theValue(usuario.getPais()).into(TXT_PAIS),
                Enter.theValue(usuario.getCiudad()).into(TXT_CIUDAD),
                Enter.theValue(usuario.getTarjetaCredito()).into(TXT_TARJETA_CREDITO),
                Enter.theValue(usuario.getMes()).into(TXT_MES),
                Enter.theValue(usuario.getYear()).into(TXT_YEAR),
                Click.on(BTN_COMPRAR)
        );
    }

    public static Performable deCompra(UsuarioBuilder usuarioBuilder) {
        return instrumented(RealizarPedido.class, usuarioBuilder.builder());
    }
}
