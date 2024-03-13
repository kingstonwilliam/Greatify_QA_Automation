package pageObject_SchoolOperation_ManageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditManageClass {
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[1]/a")
public static WebElement ClickStandard;
	@FindBy(xpath = "//*[@id=\"pills-home\"]/div[1]/button")
	public static WebElement ClickEditClass;
	@FindBy(id = "namew8")
	public static WebElement ClickInputClassId;
	@FindBy(id = "namew9")
	public static WebElement ClickSeatingCapacity;
	@FindBy(xpath = "//*[@id=\"edit_class\"]/div/div/div[2]/div[1]/div[3]/button[2]")
	public static WebElement ClickContinueBtn1;
	@FindBy(xpath = "/html/body/div[6]/div/div/div[2]/div[2]/div/div[3]/button[2]")
	public static WebElement ClickContinueBtn2;
	@FindBy(xpath = "/html/body/div[6]/div/div/div[2]/div[3]/div[4]/button[2]")
	public static WebElement ClickUpdateBtn;
	@FindBy(xpath = "/html/body/div[7]/div/div[4]/div/button")
	public static WebElement editSuccessMsg;
	@FindBy(xpath = "/html/body/div[7]/div/div[2]/div/button")
	public static WebElement ClickOkBtn;
	@FindBy(xpath = "//*[@id=\"edit_class\"]/div/div/div[2]/div[3]/div[4]/button[1]")
	public static WebElement CancelBtn;
}
