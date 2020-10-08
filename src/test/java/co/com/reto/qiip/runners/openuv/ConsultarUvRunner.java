package co.com.reto.qiip.runners.openuv;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/openuv/consultar_uv.feature",
        glue = "co.com.reto.qiip.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class ConsultarUvRunner {
}
