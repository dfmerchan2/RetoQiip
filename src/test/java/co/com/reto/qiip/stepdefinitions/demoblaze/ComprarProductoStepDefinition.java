package co.com.reto.qiip.stepdefinitions.demoblaze;

import co.com.reto.qiip.exceptions.ExceptionError;
import co.com.reto.qiip.interactions.AbrirNavegador;
import co.com.reto.qiip.questions.CompraExitosa;
import co.com.reto.qiip.tasks.demoblaze.AgregarProducto;
import co.com.reto.qiip.tasks.demoblaze.RealizarPedido;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import java.util.List;
import java.util.Map;

import static co.com.reto.qiip.utilities.demoblaze.ConstantesDemoblaze.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static co.com.reto.qiip.models.builder.UsuarioBuilder.informacion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ComprarProductoStepDefinition {

    @Dado("^que (.*) ingresa a demoblaze$")
    public void queDiegoIngresaADemoblaze(String actor) {
        theActorCalled(actor).attemptsTo(
                AbrirNavegador.deDemoblaze()
        );
    }

    @Cuando("^agrega los productos al carrito de compras$")
    public void agregaLosProductosAlCarritoDeCompras(List<Map<String, String>> informacion) {
        theActorInTheSpotlight().attemptsTo(
                AgregarProducto.alCarrito(informacion)
        );
    }

    @Entonces("^genera el pedido de la compra$")
    public void generaElPedidoDeLaCompra(List<Map<String, String>> data) {
        theActorInTheSpotlight().attemptsTo(
                RealizarPedido.deCompra(informacion()
                        .conNombre(data.get(0).get("Nombre"))
                        .conPais(data.get(0).get("Pais"))
                        .conCiudad(data.get(0).get("Ciudad"))
                        .conTarjetaCredito(data.get(0).get("TarjetaCredito"))
                        .conMes(data.get(0).get("Mes"))
                        .conYear(data.get(0).get("Year")))
        );
    }

    @Y("^observa la confirmacion del pedido$")
    public void observaLaConfirmacionDelPedido() {
        theActorInTheSpotlight().should(seeThat(CompraExitosa.deProductos())
                .orComplainWith(ExceptionError.class, MS_COMPRA_FALLIDA));
    }

}
