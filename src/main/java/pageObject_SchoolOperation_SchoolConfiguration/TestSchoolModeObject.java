package pageObject_SchoolOperation_SchoolConfiguration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestSchoolModeObject {
	@FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/div/div/div[1]/div/nav/div/button[5]")
public  static WebElement clickSchoolMode;
	@FindBy(xpath="//*[@id=\"DataTables_Table_4\"]/tbody/tr[1]/td[4]/input")
	public static WebElement ToggleBtn;
	@FindBy(id = "check_school_mode_online")
	public static WebElement ConfirmationMsg;
	@FindBy(xpath = "/html/body/div[40]/div/div[4]/div/button")
	public static WebElement OkBtn;
	@FindBy(id="check_school_mode_offline")
	public static WebElement ChangeToggleBtn;
	@FindBy(xpath = "/html/body/div[40]/div/div[4]/div/button")
	public static WebElement successMsg;
	//catch
	@FindBy(xpath = "//*[@id=\"check_school_mode_offline\"]")
	public static WebElement TurnOffline;
	@FindBy(xpath="/html/body/div[40]/div/div[4]/div/button")
	public static WebElement TurnOfflineSuccessMsg;
	@FindBy(xpath = "/html/body/div[40]/div/div[3]/div/button")
	public static WebElement errorMsg;
}

