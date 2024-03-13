package pageObject_SchoolOperation_ManageSchool;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickManageClassObject {
	@FindBy(css = "#sideClass > a > span")
 public static WebElement ClickManageClass;
	@FindBy(css = "body > div.mani > main > div > div.add-new-style > div.class_manag > div.header_titel > div.grid-down-btns > div:nth-child(4) > button")
	public static WebElement CreateClass;
}
