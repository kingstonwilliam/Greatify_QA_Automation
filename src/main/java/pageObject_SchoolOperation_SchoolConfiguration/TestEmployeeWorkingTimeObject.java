package pageObject_SchoolOperation_SchoolConfiguration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestEmployeeWorkingTimeObject {
	@FindBy(id = "nav-contact-tab")
public static WebElement ClickEmployeeWorkingTime;
	@FindBy(css = "#DataTables_Table_2 > tbody > tr.odd > td.edit_text.\\30 .edit")
	public static WebElement ClickEmployeeEditBtn;
	@FindBy(id = "w-name")
	public static WebElement TeachingCheckInTime;
	@FindBy(id = "w-name2")
	public static WebElement TeachingCheckOutTime;
	@FindBy(id = "w-name3")
	public static WebElement TeachingCheckInBufferTime;
	@FindBy(id = "w-name4")
	public static WebElement TeachingCheckOutBufferTime;
	
	@FindBy(id = "//*[@id=\"edit_working_time\"]/div/div/div[3]/button[2]")
	public static WebElement ClickEmployeeUpdateBtn;
	@FindBy(css = "body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div > button")
	public static WebElement EmployeeEditSuccessMsg;
	@FindBy(xpath = "/html/body/div[40]/div/div[3]/div/button")
	public static WebElement ErrorMsg;
	
	//Non-Teaching Employees
	@FindBy(css = "#DataTables_Table_2 > tbody > tr.even > td.edit_text.\\30 .edit")
	public static WebElement NonTeachingTimeEdit;
	@FindBy(id = "w-name")
    public static WebElement NonTeachingCheckInTime;
	@FindBy(id = "w-name2")
	public static WebElement NonTeachingCheckOutTime;
	@FindBy(id = "w-name3")
	public static WebElement NonTeachingCheckInBufferTime;
	@FindBy(id = "w-name4")
	public static WebElement NonTeachingCheckOutBufferTime;
	@FindBy(xpath = "/html/body/div[40]/div/div[4]/div/button")
	public static WebElement NonTeaachingSuccessMsg;

	
	
}
