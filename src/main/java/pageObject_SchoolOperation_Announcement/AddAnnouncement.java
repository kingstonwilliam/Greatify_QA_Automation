package pageObject_SchoolOperation_Announcement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddAnnouncement {
	   @FindBy(xpath="//*[@id=\"sideAnnouncement\"]/a/span")
       public static WebElement ClickAnnouncement;
         @FindBy(xpath = "/html/body/div[1]/main/div[2]/div/div[1]/div[2]/div[2]/button")
           public static WebElement AddNewMessage;
        @FindBy(id = "namew1")
           public static WebElement EnterTitle;
         @FindBy(xpath = "//*[@id=\"select2-8bc3-result-7l07-Teachers\"]")
           public static WebElement ChooseCategory;
         @FindBy(xpath = "add_due_date")
           public static WebElement ChooseDate;
         @FindBy(xpath = "//*[@id=\"message\"]/div/div/div[2]/div/div/div[6]/textarea")
           public static WebElement EnterMessage;
         @FindBy(xpath = "//*[@id=\"message\"]/div/div/div[3]/button[2]")
         public static WebElement CreateMsg;
         @FindBy(xpath="/html/body/div[6]/div/div[4]/div/button")
         public static WebElement SuccessMsg;
}         

