package feature.step.definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ui.HomePage;

public class CreateAnalyzerReportStepDefinition {

  HomePage homepage;

  @Given("^Admin is o the file menu$")
  public void admin_is_o_the_file_menu(){
    homepage.clinkOnfielMenu();
  }


  @When("^Admin choose new Analysis report$")
  public void admin_choose_new_Analysis_report(){
  }

  @When("^Choose data source$")
  public void choose_data_source(){
  }

  @Then("^Admin should be in analysis report page$")
  public void admin_should_be_in_analysis_report_page(){
  }
}
