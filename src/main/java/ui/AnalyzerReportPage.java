package ui;

import java.util.List;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AnalyzerReportPage extends PageObject {

  @FindBy( css = "#fieldListTreeContent > .folderContent > .field" )
  protected List<WebElementFacade> fieldFieldItems;

  @FindBy( xpath = "//div[@id='layoutPanel']//div[@class='propPanel_gemBar number propPanelItem']" )
  protected WebElementFacade layoutMeasures;
  
  public void addFieldByDoubleClick( String fieldName ) {

    List<WebElementFacade> elements = fieldFieldItems;

    for ( WebElementFacade option : elements ) {
      System.out.println( option.getText() );

      if ( fieldName.contains( option.getText() ) ) {
        withAction().moveToElement( option ).doubleClick().build().perform();
      }
     }
  }
  
  public void dragDropFieldInMeasures( String fieldName ) {
    List<WebElementFacade> elements = fieldFieldItems;

//    Actions dragAndDrop = new Actions( getDriver() );
//    for ( WebElementFacade option : elements ) {
//      if ( fieldName.contains( option.getText() ) ) {
//        Action action =
//            dragAndDrop.clickAndHold( option.getWrappedElement() ).moveByOffset( 5, 5 ).release( layoutMeasures.getWrappedElement() ).build();
//        try {
//          action.perform();
//        } catch ( MoveTargetOutOfBoundsException e ) {
//          dragAndDrop.release().build().perform();
//        }
//      }
//    }
     for ( WebElementFacade option : elements ) {
     System.out.println( option.getText() );
    
     if ( fieldName.contains( option.getText() ) ) {
     //withAction().dragAndDrop( option.getWrappedElement(), layoutMeasures.getWrappedElement() ).build().perform();
       withAction().clickAndHold(option.getWrappedElement()).moveByOffset( 5, 5 ).release( layoutMeasures.getWrappedElement() ).build().perform();
     }
        }
  }
  
  
//  public void doubleClick(WebElementFacade element){
//    
//    Actions action = new Actions( getDriver() );
//    action.moveToElement( element ).doubleClick().build().perform();
//  }

}
