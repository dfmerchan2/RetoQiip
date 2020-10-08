package co.com.reto.qiip.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductoPage {

    private ProductoPage() {
    }

    public static final Target BTN_AGREGAR = Target.the("Boton agregar al carrito").located(By.xpath("//a[contains (text(),'Add to cart')]"));
    public static final Target BTN_REALIZAR_PEDIDO = Target.the("Boton realizar pedido").located(By.xpath("//button[ contains (.,'Place Order')]"));
    public static final Target TXT_NAME = Target.the("Campo nombre").located(By.id("name"));
    public static final Target TXT_PAIS = Target.the("Campo pais").located(By.id("country"));
    public static final Target TXT_CIUDAD = Target.the("Campo ciudad").located(By.id("city"));
    public static final Target TXT_TARJETA_CREDITO = Target.the("Campo tarjeta de credito").located(By.id("card"));
    public static final Target TXT_MES = Target.the("Campo mes").located(By.id("month"));
    public static final Target TXT_YEAR = Target.the("Campo año").located(By.id("year"));
    public static final Target BTN_COMPRAR = Target.the("Boton comprar").located(By.xpath("//button[contains (.,'Purchase')]"));
}
