package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessfulOnBoardMsgObject {
  @FindBy(xpath="//*[@id=\"exampleModal\"]/div/div/div[2]/div/a/button")
  public static WebElement clickSuccessfullyMsg;
}
