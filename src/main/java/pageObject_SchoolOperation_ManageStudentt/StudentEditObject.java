package pageObject_SchoolOperation_ManageStudentt;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentEditObject {
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[2]/td[2]/div/a")
    public static WebElement ClickProfileBtn;
	@FindBy(xpath = "//*[@id=\"student_view\"]/div[3]/div[1]/div[3]/div/div[1]")
	public static  WebElement ClickEditBtn;
	@FindBy(id = "names27")
	public static WebElement ClickRollNo;
	@FindBy(id = "names26")
	public static WebElement ClickAdmissionNo;
	@FindBy(id = "step1_continue")
	public static WebElement ClickSaveOption;
	@FindBy(xpath = "/html/body/div[5]/div/div[4]/div/button")
	public static WebElement ClickSuccessBtn;
}
