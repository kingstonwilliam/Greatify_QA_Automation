package PageObject_TeacherAndStaffs_CreateTeacher;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditCreatedTeacherObject {
       
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[6]/td[1]/a")
	public static WebElement ClickId;
	
	@FindBy(css = "#student_views > div.card-views > div.left-profile > div:nth-child(2) > div > div.edits-content.edit_teacher > img")
	public static WebElement ClickEdit;
	
	@FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div[8]/div[3]/div[1]/div[1]/div[1]/label/input")
	public static WebElement ClickName;
	
	@FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div[8]/div[3]/div[1]/div[1]/div[5]/label/input")
	public static WebElement ClickEmail;
	
	@FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div[8]/div[3]/div[2]/button")
	public static WebElement ClickContinue;
	
	@FindBy(xpath="/html/body/div[2]/main/div/div[2]/div[9]/div[3]/div/div[2]/div[2]/button")
	public static WebElement ClickSubmitBtn;
	
	@FindBy(xpath = "/html/body/div[7]/div/div[4]/div/button")
	public static WebElement ClickSuccessBtn;
	
}
