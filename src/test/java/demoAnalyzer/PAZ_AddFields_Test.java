package demoAnalyzer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import feature.step.definition.AddFieldsStepDefinition;
import feature.step.definition.CreateAnalyzerReportStepDefinition;
import feature.step.definition.LoginStepDefinition;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;


@RunWith(SerenityRunner.class)
public class PAZ_AddFields_Test {
  
  @Steps
  LoginStepDefinition loginStepDefinition;
  @Steps
  CreateAnalyzerReportStepDefinition createAnalyzerReportStepDefinition;
  @Steps
  AddFieldsStepDefinition addFieldsStepDefinition;

  @Managed
  WebDriver browser;
  
  @Test
  public void logInPUC(){
    loginStepDefinition.admin_is_on_the_loginpage();
    loginStepDefinition.admin_enters_valid_username();
    loginStepDefinition.admin_enters_valid_password();
    loginStepDefinition.admin_press_Login();
    loginStepDefinition.admin_should_successfully_logged_in();
    createAnalyzerReportStepDefinition.admin_choose_new_Analysis_report();
    createAnalyzerReportStepDefinition.choose_data_source();
    addFieldsStepDefinition.admin_double_clicks_on_the_field();
    }
  
//  @Test
//  public void createAnalyzerReport(){
//    createAnalyzerReportStepDefinition.admin_is_o_the_file_menu();
//  }

}
