package co.com.reto.qiip.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReciboCompraPage {
    private ReciboCompraPage() {
    }

    public static final Target LBL_COMPRA_EXITOSA = Target.the("Texto compra exitosa").located(By.xpath("//h2[contains(.,'Thank you for your purchase!')]"));
}
