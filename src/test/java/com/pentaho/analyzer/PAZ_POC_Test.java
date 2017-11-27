package com.pentaho.analyzer;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import feature.step.definition.Analyzer_POC_StepDefinition;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;

@RunWith( SerenityParameterizedRunner.class )
@UseTestDataFrom( value = "src/test/resources/AnalyzerReportCsv.csv" ) // Data From CSV file
public class PAZ_POC_Test {

  /*
   * When you annotated a member variable of this class with the @Steps annotation, Serenity will automatically
   * instantiate it
   */
  @Steps
  Analyzer_POC_StepDefinition stepsToExecute;

  /*
   * Serenity manages WebDriver instance, including opening the appropriate driver at the start of each test, and
   * shutting it down when the test is finished. We just need to provide a WebDriver variable in test.
   */
  @Managed
  WebDriver browser;

  private String userName, password, datasourceName, analyzerReportTabName, fieldName, layoutToDnD, fieldToDnd;
  private List<String> rowTitles = Arrays.asList( "Country", "City", "Vendor", "Type");
  private List<String> columnTitles = Arrays.asList("Quantity", "Sales");
  public void setUserName( String username ) {
    this.userName = username;
  }

  public void setPassword( String password ) {
    this.password = password;
  }

  public void setDatasourceName( String datasourceName ) {
    this.datasourceName = datasourceName;
  }

  public void setAnalyzerReportTabName( String analyzerReportTabName ) {
    this.analyzerReportTabName = analyzerReportTabName;
  }

  public void setFieldName( String analyzerReportTabName ) {
    this.fieldName = analyzerReportTabName;
  }

  public void setLayoutToDnd( String layoutToDnD ) {
    this.layoutToDnD = layoutToDnD;
  }

  public void setFieldToDnD( String fieldToDnd ) {
    this.fieldToDnd = fieldToDnd;
  }

  @Test
  public void createAnalyzerReport() {
    stepsToExecute.admin_is_logged_in_as_a_valid_user( userName, password );
    stepsToExecute.admin_creates_new_analyzer_report();
    stepsToExecute.admin_selects_datasource( datasourceName );
    stepsToExecute.admin_should_be_in_the_Analyzer_report_page( analyzerReportTabName );
    stepsToExecute.admin_adds_fields_by_double_clicking( fieldName );
    stepsToExecute.admin_adds_fields_by_drag_and_drop( layoutToDnD, fieldToDnd );
    stepsToExecute.admin_should_see_the_fields_added_to_Analyzer_rport( rowTitles, columnTitles );
  }

}
