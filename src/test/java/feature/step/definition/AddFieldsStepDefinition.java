package feature.step.definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import ui.AnalyzerReportPage;

public class AddFieldsStepDefinition {

  @Steps
  AnalyzerReportPage analyzerReportPage;
  
  @Given("^Admin is in new created analyzer report$")
  public void admin_is_in_new_created_analyzer_report(){
    
  }

  @When("^Admin double clicks on the field$")
  public void admin_double_clicks_on_the_field(){
    analyzerReportPage.addFieldByDoubleClick("Country");
    analyzerReportPage.dragDropFieldInMeasures( "Quantity" );
  }

  @Then("^Admin should see that field is added$")
  public void admin_should_see_that_field_is_added() {
  }
}
