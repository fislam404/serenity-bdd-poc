package feature.step.definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import ui.DatasourcePage;
import ui.HomePage;

public class CreateAnalyzerReportStepDefinition {

  @Steps
  HomePage homepage;
  @Steps
  DatasourcePage datasourcePage;

  @Given("^Admin is o the file menu$")
  public void admin_is_o_the_file_menu(){
    homepage.clinkOnfielMenu();
    //homepage.clinkCreateNew();
  }


  @When("^Admin choose new Analysis report$")
  public void admin_choose_new_Analysis_report(){
    homepage.clinkCreateNew();
    homepage.clinkCreateNewAnalyzerReport();
  }

  @When("^Choose data source$")
  public void choose_data_source(){
    datasourcePage.chooseDatasource( "SteelWheels: SteelWheelsSales" );
    datasourcePage.clickOnOkButton();
  }

  @Then("^Admin should be in analysis report page$")
  public void admin_should_be_in_analysis_report_page(){
  }
}
