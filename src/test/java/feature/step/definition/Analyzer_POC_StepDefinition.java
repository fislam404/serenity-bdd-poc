package feature.step.definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import ui.LoginPage;

public class Analyzer_POC_StepDefinition {
  
  @Steps
  LoginPage loginPage;
  
  @Given("^Admin is logged in as a valid user$")
  @Step
  public void admin_is_logged_in_as_a_valid_user(String userName, String password) {
    loginPage.open();
    loginPage.login( userName, password );
  }


  @Step
  @When("^Admin creates new analyzer report$")
  public void admin_creates_new_analyzer_report() {
    
  }

  @Step
  @When("^Admin selects datasource$")
  public void admin_selects_datasource() {
  }

  @Step
  @Then("^Admin should be in the Analyzer report page$")
  public void admin_should_be_in_the_Analyzer_report_page() {
  }

  @Step
  @When("^Admin adds fields by double clicking$")
  public void admin_adds_fields_by_double_clicking() {
  }

  @Step
  @When("^Admin adds fields by drag and drop$")
  public void admin_adds_fields_by_drag_and_drop() {
  }

  @Step
  @Then("^Admin should see the fields added to Analyzer rport$")
  public void admin_should_see_the_fields_added_to_Analyzer_rport() {
  }
}
