package features.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith( CucumberWithSerenity.class )
@CucumberOptions( features = "src/test/resources/features/analyzer_poc.feature",
    glue = "src/test/java/feature.step.definition/Analyzer_POC_StepDefinition" )
public class Analyzer_POC_Runner {
}
