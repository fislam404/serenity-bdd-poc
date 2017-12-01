package ui;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AnalyzerReportPage extends PageObject {
  
  public AnalyzerReportPage( WebDriver driver ) {
    super( driver );
  }

  @FindBy( css = "#fieldListTreeContent > .folderContent > .field" )
  protected List<WebElementFacade> fieldFieldItems;

  @FindBy(
      xpath = "//div[@id='layoutPanel']//div[@class='propPanel_gemBar number propPanelItem'][contains(./@id, 'measures_')]//div[contains(./@class, 'gemPlaceholder')]" )
  protected WebElementFacade layoutMeasures;

  @FindBy(
      xpath = "//div[@id='layoutPanel']//div[@class='propPanel_gemBar string propPanelItem'][contains(./@id, 'rows_')]//div[contains(./@class, 'gemPlaceholder')]" )
  protected WebElementFacade layoutRows;

  @FindBy(
      xpath = "//div[@id='layoutPanel']//div[@class='propPanel_gemBar string propPanelItem'][contains(./@id, 'columns_')]//div[contains(./@class, 'gemPlaceholder')]" )
  protected WebElementFacade layoutColumn;

  @FindBy( xpath = "//div[@class='pentaho-tabWidgetLabel']" )
  protected WebElementFacade analysisReportTab;

  @FindBy( xpath = "//iframe[@class='gwt-Frame'][@name='frame_0']" )
  private WebElementFacade frame0;

  public void addFieldByDoubleClick( String fieldName ) {
    getDriver().switchTo().frame( frame0 );

    List<WebElementFacade> elements = fieldFieldItems;

    for ( WebElementFacade option : elements ) {
      //System.out.println( option.getText() );

      if ( fieldName.contains( option.getText() ) ) {
        withAction().moveToElement( option ).doubleClick().build().perform();
      }
    }
  }

  public void dragDropFieldInMeasures( String fieldName ) {

    List<WebElementFacade> elements = fieldFieldItems;

    for ( WebElementFacade option : elements ) {
      System.out.println( option.getText() );

      if ( fieldName.contains( option.getText() ) ) {
        // withAction().dragAndDrop( option.getWrappedElement(), layoutMeasures.getWrappedElement() ).build().perform();

        withAction().clickAndHold( option.getWrappedElement() ).moveByOffset( 5, 5 )
            .release( layoutMeasures.getWrappedElement() ).build().perform();
      }
    }
  }

  public void dragDropFieldInRows( String fieldName ) {
    List<WebElementFacade> elements = fieldFieldItems;

    for ( WebElementFacade option : elements ) {
      System.out.println( option.getText() );

      if ( fieldName.contains( option.getText() ) ) {
        withAction().clickAndHold( option.getWrappedElement() ).moveByOffset( 5, 5 )
            .release( layoutRows.getWrappedElement() ).build().perform();
      }
    }
  }

  public void dragDropFieldInColumn( String fieldName ) {
    List<WebElementFacade> elements = fieldFieldItems;

    for ( WebElementFacade option : elements ) {
      System.out.println( option.getText() );

      if ( fieldName.contains( option.getText() ) ) {
        withAction().clickAndHold( option.getWrappedElement() ).moveByOffset( 5, 5 )
            .release( layoutColumn.getWrappedElement() ).build().perform();
      }
    }
  }

  // public void doubleClick(WebElementFacade element){
  //
  // Actions action = new Actions( getDriver() );
  // action.moveToElement( element ).doubleClick().build().perform();
  // }

  public void verifyAnalyzerReportTab( String expectedTabName ) {
    getDriver().switchTo().defaultContent();
    analysisReportTab.shouldContainText( expectedTabName );
  }

  public void verifyRowHeader( List<String> pivotTableRowTitle ) {

    for ( String title : pivotTableRowTitle ) {
      $( "//td[@class='pivotTableRowLabelHeaderContainer']//*[@title=('" + title + "')]" ).shouldBePresent();
    }
  }

  public void verifyColumnHeader( List<String> pivotTableColumnTitle ) {
    for ( String title : pivotTableColumnTitle ) {
      $( "//td[@class='pivotTableColumnHeaderSection']//*[@title=('" + title + "')]" ).shouldBePresent();
    }
  }
}
