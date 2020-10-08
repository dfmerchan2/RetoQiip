package co.com.reto.qiip.questions;

import co.com.reto.qiip.userinterfaces.ReciboCompraPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CompraExitosa implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        if (ReciboCompraPage.LBL_COMPRA_EXITOSA.resolveFor(actor).isVisible())
            return true;
        return false;
    }

    public static CompraExitosa deProductos() {
        return new CompraExitosa();
    }
}
