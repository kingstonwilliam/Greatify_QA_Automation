package PageObject_Non_Teaching_Staffs_Create_Non_Teaching_Staff;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditNonTeachingEmp {
	@FindBy(xpath = "//*[@id=\"sideNonTeaching\"]/a/span")
	public static WebElement ClickNonTeachingStaffBtn;
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[1]/a")
    public static WebElement ClickEmpProfile;
	@FindBy(xpath = "//*[@id=\"student_view\"]/div[3]/div[1]/div[2]/div/div[1]")
	public static WebElement ClickEditBtn;
	@FindBy(xpath = "//*[@id=\"names1\"]")
	public static WebElement EditName;
	@FindBy(xpath = "//*[@id=\"names5\"]")
	public static WebElement  EditEmail;
	@FindBy(xpath = "//*[@id=\"edit_student_view\"]/div[3]/div[1]/div[3]/div[1]/div/select/option[4]")
	public static WebElement EditBloodGroup;
	@FindBy(xpath = "//*[@id=\"edit_student_view\"]/div[3]/div[2]/button")
	public static WebElement ContinueBtn;
	@FindBy(xpath = "//*[@id=\"continue_edit\"]/div[3]/div/div[2]/div[2]/button")
	public static WebElement SubmitBtn;
	@FindBy(xpath = "/html/body/div[6]/div/div[4]/div/button")
	public static WebElement SuccessMsg;
	
}
