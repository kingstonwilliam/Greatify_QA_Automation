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
         @FindBy(xpath = "//*[@id=\"message\"]/div/div/div[2]/div/div/div[2]/div/span/span[1]/span/ul/li/input")
         public static WebElement ChooseCategory;
         @FindBy(id = "add_due_date")
         public static WebElement ChooseDate;
         @FindBy(xpath = "//*[@id=\"message\"]/div/div/div[2]/div/div/div[5]/div/span/span[1]/span/ul/li[1]")
         public static WebElement SelectClass;
         @FindBy(xpath = "//*[@id=\"message\"]/div/div/div[2]/div/div/div[6]/textarea")
         public static WebElement EnterMessage;
         @FindBy(xpath = "//*[@id=\"message\"]/div/div/div[3]/button[2]")
         public static WebElement CreateMsg;
         @FindBy(xpath="/html/body/div[7]/div/div[4]/div/button")
         public static WebElement SuccessMsg;
        
         //EDIT
          @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[7]/img")
          public static WebElement ClickEditLogo;
          @FindBy(xpath = "//*[@id=\"update_namew1\"]")
          public static WebElement EditTitle;
          @FindBy(xpath = "//*[@id=\"update_message\"]/div/div/div[2]/div/div/div[2]/div/span/span[1]/span/ul")
          public static WebElement EditChooseCategory;
          @FindBy(xpath = "//*[@id=\"update_add_due_date\"]")
          public static WebElement EditChooseDate;
          @FindBy(xpath ="//*[@id=\"update_message\"]/div/div/div[2]/div/div/div[6]/textarea")
          public static WebElement ChooseMsg;
          @FindBy(xpath = "//*[@id=\"update_message\"]/div/div/div[2]/div/div/div[5]/div/span/span[1]/span/ul/li[2]/input")
          public static WebElement EditSelectClass;
          @FindBy(xpath="//*[@id=\"update_message\"]/div/div/div[3]/button[2]")
          public static WebElement UpdateBtn;
          @FindBy(xpath = "/html/body/div[6]/div/div[4]/div/button")
          public static WebElement EditSuccessBtn;
          //DELETE
          @FindBy(css = "#DataTables_Table_0 > tbody > tr:nth-child(1) > td:nth-child(6) > div > svg")
          public static WebElement DeleteLogo;
          @FindBy(xpath = "/html/body/div[6]/div/div[3]/div[2]/button")
          public static WebElement DeleteConfimation; 
          @FindBy(xpath = "/html/body/div[6]/div/div[4]/div/button")
          public static WebElement DeleteSuccessOkBtn;
}         

