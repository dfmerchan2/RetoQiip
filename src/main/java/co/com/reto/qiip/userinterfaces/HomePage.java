package co.com.reto.qiip.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    private HomePage() {
    }

    public static final Target BTN_CATEGORIA = Target.the("Boton de categorias").locatedBy("//a[@class='list-group-item' and contains (.,'{0}')]");
    public static final Target BTN_PRODUCTO = Target.the("Boton de productos").locatedBy("//a[@class='hrefch' and contains (.,'{0}')]");
    public static final Target BTN_OPCIONES_MENU = Target.the("Boton de opciones de menu").locatedBy("//a[@class='nav-link' and contains (.,'{0}')]");
}
