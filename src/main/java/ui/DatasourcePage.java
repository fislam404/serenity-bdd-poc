package ui;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DatasourcePage extends PageObject {

  public DatasourcePage( WebDriver driver ) {
    super( driver );
  }
  
  @FindBy(css="#datasources option")
  private WebElementFacade datasourceDropdown;
  
  @FindBy(xpath = "//iframe[@class='gwt-Frame'][@name='frame_0']")
  private WebElementFacade homePerspectiveFrame;
  
  @FindBy(xpath="//option[@value=8]")
  private WebElement datasourDirect;
  
  @FindBy(id = "btnNext")
  private WebElement buttonOK;
  
  
  
  public void makeClickable() {
    // magic fix to make element clickable if div is on the front
    try {
      String css = "body > div[style*='display: block']";
      List<WebElement> elements = getDriver().findElements( By.cssSelector( css ) );
      if ( !elements.isEmpty() ) {
        WebElement elem = elements.get( 0 );
        //click( "makeClickable", elem );]
            elem.click();

      }
    } catch ( Exception e ) {
    }
  }
  public void chooseDatasource(String datasourceName){
    getDriver().switchTo().defaultContent();
    getDriver().switchTo().frame( homePerspectiveFrame );
    
   // makeClickable();
    
   // datasourceDropdown.selectByVisibleText( datasourceName );
//    
//    Select selectD = new Select( datasourceDropdown );
////    selectD.selectByVisibleText( datasourceName );
//    List <WebElement> elementCount = selectD.getOptions();
//    int size = elementCount.size();
//    
//    for(int i =0; i<size ; i++){
//      String sValue = elementCount.get(i).getText();
//      System.out.println(sValue);
//      }
//   
//    for (WebElement option : elementCount) {
//      System.out.println( option.getText() );
//        if(datasourceName.contains( option.getText() ));
//            option.click();
//    }
    datasourDirect.click();
  }
  
  public void clickOnOkButton(){
    evaluateJavascript( "arguments[0].click()", buttonOK );
    //buttonOK.click();
  }
  
}
