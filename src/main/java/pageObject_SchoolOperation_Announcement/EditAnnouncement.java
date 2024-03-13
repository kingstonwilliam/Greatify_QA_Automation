package pageObject_SchoolOperation_Announcement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAnnouncement {
 @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[7]/img")
public static WebElement ClickEditLogo;
 @FindBy(xpath = "//*[@id=\"update_namew1\"]")
 public static WebElement EditTitle;
 @FindBy(xpath = "//*[@id=\"select2-i3hz-result-wx93-Parents\"]")
 public static WebElement ChooseCategory;
 @FindBy(xpath = "//*[@id=\"update_add_due_date\"]")
 public static WebElement ChooseDate;
 @FindBy(xpath ="//*[@id=\"update_message\"]/div/div/div[2]/div/div/div[6]/textarea")
 public static WebElement ChooseMsg;
 @FindBy(xpath="//*[@id=\"update_message\"]/div/div/div[3]/button[2]")
 public static WebElement UpdateBtn;
 
}
