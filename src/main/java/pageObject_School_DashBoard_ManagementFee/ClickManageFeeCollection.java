package pageObject_School_DashBoard_ManagementFee;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickManageFeeCollection {
     @FindBy(xpath = "//*[@id=\"sideFeeCollection\"]/a/span")
	public static WebElement ClickManageFeeCollection;
     @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[10]/div/a")
 	public static WebElement ClickManagePayment;
     @FindBy(xpath = "//*[@id=\"mana_pay_1\"]/tbody/tr/td[1]/div[1]/p")
 	public static WebElement AddDiscount;
     @FindBy(xpath = "//*[@id=\"mana_pay_1\"]/tbody/tr/td[1]/div[1]/div[1]/div[1]/select/option[1]")
 	public static WebElement ClickFlat;
     @FindBy(xpath = "//*[@id=\"mana_pay_1\"]/tbody/tr/td[1]/div[1]/div[1]/div[2]/input")
 	public static WebElement EnterAmount1;
     @FindBy(xpath = "//*[@id=\"mana_pay_1\"]/tbody/tr/td[1]/div[1]/div[1]/div[4]/input")
 	public static WebElement EnterName;
     @FindBy(xpath = "//*[@id=\"mana_pay_1\"]/tbody/tr/td[1]/div[1]/div[1]/div[5]/button")
 	public static WebElement SubmitBtn;
     @FindBy(xpath = "//*[@id=\"mana_pay_1\"]/tbody/tr/td[8]/div[1]/div[1]/input")
 	public static WebElement EnterAmount2;
     @FindBy(xpath = "//*[@id=\"mana_pay_1\"]/tbody/tr/td[8]/div[1]/div[2]/select/option[2]")
 	public static WebElement PaymentMode1;
     @FindBy(xpath = "//*[@id=\"mana_pay_1\"]/tbody/tr/td[8]/div[2]/a")
 	public static WebElement AddAnotherPayment;
     @FindBy(xpath = "//*[@id=\"mana_pay_1\"]/tbody/tr/td[8]/div[2]/div/div[1]/input")
 	public static WebElement EnterAmount3;
     @FindBy(xpath = "//*[@id=\"mana_pay_1\"]/tbody/tr/td[8]/div[2]/div/div[2]/select/option[1]")
 	public static WebElement PaymentMode2;
     @FindBy(xpath = "//*[@id=\"faq\"]/div/div[3]/div/button[2]")
 	public static WebElement UpdatePayment;
     @FindBy(xpath = "/html/body/div[2]/div/div[4]/div/button")
 	public static WebElement UpdateSuccessMsg;
     //delete
     @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[2]/section/div/div[1]/ul/li[1]/div/div/div/table/tbody/tr/td[6]/div/img")
 	public static WebElement ClickDeleteLogo;
     @FindBy(xpath = "/html/body/div[2]/div/div[3]/div[2]/button")
 	public static WebElement DeleteConfirmation;
     @FindBy(xpath = "/html/body/div[2]/div/div[4]/div/button")
     public static WebElement DeleteSuccessMsg;
     @FindBy(xpath = "//*[@id=\"auditTrail\"]/a/span")
     public static WebElement ClickAuditTrail;
}
