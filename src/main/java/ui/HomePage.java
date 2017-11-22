package ui;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject {
  
  @FindBy(xpath = "//td[@id='filemenu']")
  private WebElement fileMenu;
  @FindBy( id = "btnCreateNew" )
  private WebElementFacade createNewButon;
  @FindBy(xpath = "//iframe[@class='gwt-Frame'][@id='home.perspective']")
  private WebElementFacade homePerspectiveFrame;
  @FindBy(xpath = "//div[@class='pentaho-busy-indicator-msg-contianer']")
  private WebElementFacade busyIndicator;
  @FindBy(css=".popover-content > #createNewanalyzerButton")
  private WebElement createNewAnalyzer;
  

  
  public void clinkOnfielMenu(){
    fileMenu.click();
    //fileMenu.waitUntilVisible().click();
  }
  
  public void switchToHomeFrame(){
    getDriver().switchTo().frame( homePerspectiveFrame );
  }
  
  public void clinkCreateNew(){
    busyIndicator.waitUntilNotVisible();
    switchToHomeFrame();
    createNewButon.click();
  }
  
  public void clinkCreateNewAnalyzerReport(){
    createNewAnalyzer.click();
    busyIndicator.waitUntilNotVisible();
  }

}
