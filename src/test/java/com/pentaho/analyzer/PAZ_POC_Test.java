package com.pentaho.analyzer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import feature.step.definition.Analyzer_POC_StepDefinition;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value="src/test/resources/AnalyzerReportCsv.csv") //Data From CSV file
public class PAZ_POC_Test {

  /*
   * When you annotated a member variable of this class with the @Steps annotation, 
   * Serenity will automatically instantiate it
   */
  @Steps
  Analyzer_POC_StepDefinition stepsToExecute;
  
  /*
   * Serenity manages WebDriver instance, including opening the appropriate driver at the start of each test, 
   * and shutting it down when the test is finished. We just need to provide a WebDriver variable in test.
   */
  @Managed
  WebDriver browser;
  
  private String userName, password;
  
  public void setUserName(String username ) {
    this.userName = username;
  }
  public void setPassword(String password){
    this.password = password;
  }

  @Test
  public void createAnalyzerReport(){
    stepsToExecute.admin_is_logged_in_as_a_valid_user( userName, password );
  }
  
}
