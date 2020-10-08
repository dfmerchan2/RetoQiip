package co.com.reto.qiip.stepdefinitions.openuv;

import co.com.reto.qiip.exceptions.ExceptionError;
import co.com.reto.qiip.tasks.openuv.ConsultaNivelUv;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import java.util.List;
import java.util.Map;

import static co.com.reto.qiip.utilities.openuv.ConstantesOpenuv.MS_ERROR_CODIGO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static co.com.reto.qiip.models.builder.ParametrosUvBuilder.parametros;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class ConsultarUvStepDefinition {

    @Dado("^que (.*) quiere consultar el UV con el metodo (.*)$")
    public void queDiegoQuiereConsultarElUVConElMetodoHttpsApiOpenuvIoApiVUv(String actor, String api) {
        theActorCalled(actor).whoCan(CallAnApi.at(api));
    }

    @Cuando("^le proporsiona la informacion solicitada$")
    public void leProporsionaLaInformacionSolicitada(List<Map<String, String>> informacion) {
        theActorInTheSpotlight().attemptsTo(
                ConsultaNivelUv.enTiempoReal(parametros()
                        .conLatitud(informacion.get(0).get("Latitud"))
                        .conLongitud(informacion.get(0).get("Longitud"))
                        .conAltura(informacion.get(0).get("Altura"))
                        .conOzone(informacion.get(0).get("Ozone"))
                        .conFecha(informacion.get(0).get("Fecha"))
                        .conToken(informacion.get(0).get("Token"))
                )
        );
    }

    @Entonces("^observa que se generan los indices de UV con Status (.*)$")
    public void observaQueSeGeneranLosIndicesDeUVConStatus(int status) {
        theActorInTheSpotlight().should(
                seeThatResponse(
                        response -> response.statusCode(status))
                        .orComplainWith(ExceptionError.class, MS_ERROR_CODIGO)
        );

    }

    @Entonces("^observa que se una exceptions con Status (.*)$")
    public void observaQueSeUnaExceptionsConStatus(int status) {
        theActorInTheSpotlight().should(
                seeThatResponse(
                        response -> response.statusCode(status))
                        .orComplainWith(ExceptionError.class, MS_ERROR_CODIGO)
        );
    }
}
