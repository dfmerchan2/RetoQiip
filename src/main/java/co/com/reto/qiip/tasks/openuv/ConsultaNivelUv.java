package co.com.reto.qiip.tasks.openuv;

import co.com.reto.qiip.models.ParametrosUv;
import co.com.reto.qiip.models.builder.ParametrosUvBuilder;
import co.com.reto.qiip.utilities.openuv.GenerarUrl;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static co.com.reto.qiip.utilities.openuv.ConstantesOpenuv.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultaNivelUv implements Task {

    private ParametrosUv parametro;

    public ConsultaNivelUv(ParametrosUv parametro) {
        this.parametro = parametro;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Get.resource(GenerarUrl.apiUv(parametro.getLatitud(), parametro.getLongitud(), parametro.getAltura(), parametro.getOzone(), parametro.getFecha()))
                        .with(request -> request
                                .header(ACCESS_TOKEN, parametro.getToken())
                        )
        );
        SerenityRest.lastResponse().print();
    }

    public static Performable enTiempoReal(ParametrosUvBuilder parametrosUvBuilder) {
        return instrumented(ConsultaNivelUv.class, parametrosUvBuilder.builder());
    }
}
