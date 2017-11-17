package ui;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject {

  @FindBy(id="eval-arrow")
  private WebElement evaluator;
  @FindBy(id="j_username")
  private WebElement userNameField;
  @FindBy(id="j_password")
  private WebElement passwordField;
  @FindBy(xpath = "//button[@type = 'submit']")
  private WebElement loginButton;
  
  public void enterUserName(){
    userNameField.sendKeys( "Admin" );
  }
  public void enterPassword(){
    passwordField.sendKeys( "password" );
  }
  public void clinkOnLoginButton(){
    loginButton.click();
  }
}
