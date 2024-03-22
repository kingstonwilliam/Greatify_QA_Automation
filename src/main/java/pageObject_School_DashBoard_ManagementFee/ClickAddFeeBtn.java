package pageObject_School_DashBoard_ManagementFee;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickAddFeeBtn {
	@FindBy(xpath = "//*[@id=\"pills-profile-tab\"]")
public static WebElement ClickAddOnfee;
	@FindBy(xpath = "//*[@id=\"pills-profile\"]/div[1]/div[2]/div[2]/button")
	public static WebElement CreateAddOnFee;
	@FindBy(xpath = "//*[@id=\"names7\"]")
	public static WebElement EnterFeeName;
	@FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/div[1]/div[2]/label/input")
	public static WebElement FeeAmount;
	@FindBy(xpath = "//*[@id=\"add_fee_pickers2\"]")
	public static WebElement ChooseDate;
	@FindBy(xpath = "//*[@id=\"names10\"]")
	public static WebElement GstPercentage;
	@FindBy(xpath = "//*[@id=\"add_on_fee\"]/div/div/div[2]/div[1]/div[5]/div[1]/a")
	public static WebElement DownloadSampleCsv;
	@FindBy(xpath = "//*[@id=\"add_on_fee\"]/div/div/div[2]/div[1]/div[5]/div[2]/div/div/label")
	public static WebElement UploadCsv;
	@FindBy(css = "body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div > button")
	public static WebElement fileUploadSuccess;
	@FindBy(xpath = "//*[@id=\"add_on_fee\"]/div/div/div[3]/button[2]")
	public static WebElement FeeCreate;
	@FindBy(css = "body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div > button")
	public static WebElement FeeCreateSuccess;
	
	
}
