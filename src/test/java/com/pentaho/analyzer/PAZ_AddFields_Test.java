package com.pentaho.analyzer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import feature.step.definition.LoginStepDefinition;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class PAZ_AddFields_Test {
  
  @Steps
  LoginStepDefinition loginStepDefinition;

  @Managed
  WebDriver browser;                  
  
  
  @Test
  public void logInPUC(){
    loginStepDefinition.admin_is_on_the_loginpage();
    loginStepDefinition.admin_enters_valid_username();
    loginStepDefinition.admin_enters_valid_password();
    loginStepDefinition.admin_press_Login();
    
  }
  
//  public void createAnalyzerReport(){
//    
//  }

}
