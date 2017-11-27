package ui;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject {
  
  @FindBy(xpath = "//td[@class='gwt-MenuItem'][@id='filemenu']")
  private WebElementFacade fileMenu;
  //@FindBy( id = "btnCreateNew" )
  @FindBy (xpath = "//button[@id='btnCreateNew']")
  private WebElementFacade createNewButon;
  @FindBy(xpath = "//iframe[@class='gwt-Frame'][@id='home.perspective']")
  private WebElementFacade homePerspectiveFrame;
  @FindBy(xpath = "//div[@class='pentaho-busy-indicator-msg-contianer']")
  private WebElementFacade busyIndicator;
  @FindBy(css=".popover-content > #createNewanalyzerButton")
  private WebElement createNewAnalyzer;
  

  
  public void clinkOnfielMenu(){
    fileMenu.waitUntilClickable().click();
    //fileMenu.waitUntilVisible().click();
  }
  
  public void switchToHomeFrame(){
    getDriver().switchTo().frame( homePerspectiveFrame );
  }
  
  public void clickCreateNew(){
    busyIndicator.waitUntilNotVisible();
    switchToHomeFrame();
//    System.out.println( createNewButon.isDisplayed() );
    createNewButon.click();
    
 //   evaluateJavascript( "arguments[0].click()", createNewButon );
    
  //  createNewButon.waitUntilVisible().click();
    
//    JavascriptExecutor executor = (JavascriptExecutor) getDriver();
//    executor.executeScript( "arguments[0].click()", createNewButon );
    
  }
  
  public void clinkCreateNewAnalyzerReport(){
    createNewAnalyzer.click();
    //evaluateJavascript( "arguments[0].click()", createNewAnalyzer );
    busyIndicator.waitUntilNotVisible();
  }

}
