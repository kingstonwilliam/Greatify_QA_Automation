package pageObject_School_DashBoard_ManagementFee;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickConcession {
	@FindBy(xpath = "//*[@id=\"pills-time-table\"]")
	public static WebElement ClickConcession;
	@FindBy(xpath = "//*[@id=\"pills-table\"]/div[1]/div[2]/div[2]/button")
	public static WebElement ClickAddDiscount;
	@FindBy(xpath = "//*[@id=\"discount1\"]/option[1]")
	public static WebElement SelectClass;
	@FindBy(xpath = "//*[@id=\"discount2\"]/option[2]")
	public static WebElement ChooseFeeName;
	@FindBy(xpath = "//*[@id=\"discount3\"]")
	public static WebElement DiscountName;
	@FindBy(xpath = "//*[@id=\"discount4\"]")
	public static WebElement DiscountPercentage;
	@FindBy(xpath = "//*[@id=\"discount5\"]")
	public static WebElement EnterAmount;
	@FindBy(xpath = "//*[@id=\"add_fee_pickers4\"]")
	public static WebElement ChooseDate;
	@FindBy(xpath = "//*[@id=\"add_discount\"]/div/div/div[2]/div[1]/div[3]/div[1]/a")
	public static WebElement ClickSampleCSV;
	@FindBy(xpath = "//*[@id=\"add_discount\"]/div/div/div[2]/div[1]/div[3]/div[2]/div/div/label" )	
	public static WebElement UploadCSV;
	@FindBy(xpath = "/html/body/div[9]/div/div[4]/div/button")
	public static WebElement UploadSuccessMsg;
	@FindBy(xpath = "//*[@id=\"add_discount\"]/div/div/div[3]/button[2]")
	public static WebElement ClickCreate;
	@FindBy(css = "body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div > button")
	public static WebElement ConfirmationMsg;
	
}
