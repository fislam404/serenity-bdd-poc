package feature.step.definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import ui.LoginPage;

public class LoginStepDefinition {
  LoginPage loginPage;

  
  @Given("^Admin is on the loginpage$")
  @Step
  public void admin_is_on_the_loginpage() {
    loginPage.open();
  }

  @Step
  @When("^Admin enters valid username$")
  public void admin_enters_valid_username() {
    loginPage.enterUserName();
  }

  @Step
  @When("^Admin enters valid password$")
  public void admin_enters_valid_password() {
    loginPage.enterPassword();
  }

  @Step
  @When("^Admin press Login$")
  public void admin_press_Login() {
    loginPage.clinkOnLoginButton();
  }

  @Step
  @Then("^Admin should successfully logged in$")
  public void admin_should_successfully_logged_in() {
  }

}
