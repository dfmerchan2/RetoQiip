package co.com.reto.qiip.runners.demoblaze;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/demoblaze/comprar_producto.feature",
        glue = "co.com.reto.qiip.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class ComprarProductoRunner {
}
