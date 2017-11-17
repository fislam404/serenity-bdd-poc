package ui;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject {
  @FindBy(id="filemenu")
  private WebElement fileMenu;
  
  public void clinkOnfielMenu(){
    fileMenu.click();
  }

}
