package pageObject_SchoolOperation_SchoolConfiguration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickSchoolOperationObject {
   @FindBy(id="schoolManagementSection")
   public static WebElement clickSchoolOperationBtn;
   
   @FindBy(xpath = "//*[@id=\"sideSchool\"]/a/span")
   public static WebElement clickSchoolConfiguration;
   
}
