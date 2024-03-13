package PageObject_Non_Teaching_Staffs_Create_Non_Teaching_Staff;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NonTeachhingUploadDocument {
     @FindBy(xpath = "//*[@id=\"student_con_non_teacher_add\"]/div[3]/div/div[1]/label[1]/img")
	public static WebElement UploadDocument1;
     @FindBy(xpath = "//*[@id=\"student_con_non_teacher_add\"]/div[3]/div/div[1]/label[2]/img")
 	public static WebElement UploadDocument2;
     @FindBy(xpath = "//*[@id=\"student_con_non_teacher_add\"]/div[3]/div/div[1]/label[3]/img")
 	public static WebElement UploadDocument3;
     @FindBy(xpath = "//*[@id=\"student_con_non_teacher_add\"]/div[3]/div/div[1]/label[4]/img")
 	public static WebElement UploadDocument4;
     @FindBy(xpath = "//*[@id=\"student_con_non_teacher_add\"]/div[3]/div/div[1]/label[5]/img")
 	public static WebElement UploadDocument5;
     @FindBy(xpath = "//*[@id=\"student_con_non_teacher_add\"]/div[3]/div/div[2]/div[1]/div[1]/label/p")
     public static WebElement UploadOtherDocument;
     @FindBy(xpath = "//*[@id=\"student_con_non_teacher_add\"]/div[3]/div/div[2]/div[2]/button")
     public static WebElement SubmitBtn;
     @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/button")
     public static WebElement SuccessMsg;
     @FindBy(xpath = "/html/body/div[6]/div/div[3]/div/button")
     public static WebElement CancelOkBtn;
}
