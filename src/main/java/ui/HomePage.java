package ui;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject {

  public HomePage( WebDriver driver ) {
    super( driver );
  }
  
  @FindBy( xpath = "//button[@id='btnCreateNew']" )
  private WebElementFacade createNewButon;
  @FindBy( xpath = "//iframe[@class='gwt-Frame'][@id='home.perspective']" )
  private WebElementFacade homePerspectiveFrame;
  @FindBy( xpath = "//div[@class='pentaho-busy-indicator-msg-contianer']" )
  private WebElementFacade busyIndicator;
  @FindBy( css = ".popover-content > #createNewanalyzerButton" )
  private WebElementFacade createNewAnalyzer;

  public void switchToHomeFrame() {
    getDriver().switchTo().frame( homePerspectiveFrame );
  }

  public void clickCreateNew() {
    busyIndicator.waitUntilNotVisible();
    switchToHomeFrame();
    //createNewButon.waitUntilEnabled().click();
    
     //evaluateJavascript( "arguments[0].click()", createNewButon );
     JavascriptExecutor executor = (JavascriptExecutor) getDriver();
     executor.executeScript( "arguments[0].click()", createNewButon );

  }

  public void clinkCreateNewAnalyzerReport() {
    createNewAnalyzer.waitUntilClickable();
    //createNewAnalyzer.click();
    //evaluateJavascript( "arguments[0].click()", createNewAnalyzer );
    JavascriptExecutor executor = (JavascriptExecutor) getDriver();
    executor.executeScript( "arguments[0].click()", createNewAnalyzer );
    busyIndicator.waitUntilNotVisible();
  }

}
