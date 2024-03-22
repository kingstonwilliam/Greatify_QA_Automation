package pageObject_School_DashBoard_ManagementFee;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickAdmissionAndFee {
	@FindBy(css = "#leadManagementSection > p > svg")
	public static WebElement ClickAdmissionAndFee;
	@FindBy(xpath = "//*[@id=\"sideFee\"]/a/span")
	public static WebElement ClickManageFee;
	@FindBy(xpath = "//*[@id=\"pills-home\"]/div[1]/div[2]/div[2]/button")
	public static WebElement ClickAddFee;
	@FindBy(xpath = "//*[@id=\"names1\"]")
	public static WebElement EnterName;
	@FindBy(xpath = "//*[@id=\"names2\"]")
	public static WebElement EnterAmount;
	@FindBy(xpath = "//*[@id=\"add_fee\"]/div/div/div[2]/div[1]/div[2]/div[1]/div/span/span[1]/span/ul")
	public static WebElement ClickSelectClass;
	@FindBy(xpath = "/html/body/span/span/span/ul/li[1]")
	public static WebElement SelectClass;
	@FindBy(xpath = "//*[@id=\"add_fee_pickers1\"]")
	public static WebElement SelectDate;
	//(//label[text()='Yes'])[1]
	@FindBy(xpath = "(//label[text()='Yes'])[1]")
	public static WebElement GstOption;
	@FindBy(xpath = "//*[@id=\"names4\"]")
	public static WebElement EnterGstPercentage;
	@FindBy(xpath = "//*[@id=\"names5\"]")
	public static WebElement TutionFeeName1;
	@FindBy(xpath = "//*[@id=\"slot_1\"]/div[2]/label/input")
	public static WebElement SplitAmount1;
	@FindBy(xpath = "//*[@id=\"add_fee\"]/div/div/div[2]/div[2]/div[2]/p")
	public static WebElement AddFeeBreakDown;
	@FindBy(xpath = "//*[@id=\"names8\"]")
	public static WebElement TutionFeeName2;
	@FindBy(xpath = "//*[@id=\"names9\"]")
	public static WebElement SplitAmount2;
	@FindBy(xpath = "//*[@id=\"add_fee\"]/div/div/div[3]/button[2]")
	public static WebElement ClickCreateBtn;
	@FindBy(xpath = "/html/body/div[10]/div/div[4]/div/button")
	public static WebElement CreateSuccessBtn;
	@FindBy(css = "body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div > button")
	public static WebElement CreateSuccessBtn2;
	// Edit
	@FindBy(css = "#DataTables_Table_0 > tbody > tr:nth-child(1) > td:nth-child(9) > div.edit_text.edit_year > svg")
	public static WebElement ClickEditLogo;
	@FindBy(xpath = "//*[@id=\"manage_fee_name1\"]")
	public static WebElement EditFeeName;
	@FindBy(xpath = "//*[@id=\"manage_fee_amount1\"]")
	public static WebElement Amount;
	@FindBy(xpath = "//*[@id=\"manage_fee_edit\"]/div/div/div[2]/div[1]/div[3]/div[1]/div/p[2]/label")
	public static WebElement GstOptionNo;
	@FindBy(xpath = "//*[@id=\"edit_amount2\"]")
	public static WebElement EditBalanceAmount;
	@FindBy(xpath = "//*[@id=\"manage_fee_edit\"]/div/div/div[3]/button[2]")
	public static WebElement ClickUpdateBtn;
	@FindBy(xpath = "/html/body/div[9]/div/div[3]/div/button")
	public static WebElement ClickEditSuccessMsg;
	//Delete
	@FindBy(css = "#DataTables_Table_0 > tbody > tr:nth-child(1) > td:nth-child(9) > div.delete_text > svg")
	public static WebElement ClickDeleteFeeLogo;
	@FindBy(xpath = "/html/body/div[9]/div/div[3]/div[2]/button")
	public static WebElement DeleteConfirmMsg;
	@FindBy(css = "body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div > button")
	public static WebElement DeleteSuccessMsg;
	// publishNow
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[8]/a")
	public static WebElement PublishNow;
	@FindBy(xpath = "/html/body/div[9]/div/div[3]/div[2]/button")
	public static WebElement PublishCofirmationBtn;
	@FindBy(xpath = "/html/body/div[9]/div/div[4]/div/button")
	public static WebElement PublishSuccessMsg;

}
