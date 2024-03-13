package pageObject_SchoolOperation_CreateClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickClass {
	@FindBy(xpath = "//*[@id=\"pills-profile-tab\"]")
	public static WebElement ClickClass;
	@FindBy(xpath = "//*[@id=\"nav-class\"]/div[1]/div[2]/div[4]/button[2]")
	public static WebElement AddClass;
	@FindBy(id = "ns-name1")
	public static WebElement EnterStandardName1;
	@FindBy(id = "ns-name2")
	public static WebElement EnterSectiondName1;
	@FindBy(xpath = "//*[@id=\"add_class\"]/div/div/div[2]/div[2]/p")
	public static WebElement ClickAddSection;
	@FindBy(id = "ns-name3")
	public static WebElement EnterStandardName2;
	@FindBy(id = "ns-name4")
	public static WebElement EnterSectiondName2;
	@FindBy(xpath = "//*[@id=\"add_class\"]/div/div/div[3]/button[2]")
	public static WebElement ClickCreateBtn;
	@FindBy(xpath = "/html/body/div[40]/div/div[4]/div/button")
	public static WebElement SuccessMsg;
	//edit
	@FindBy(css = "#DataTables_Table_6 > tbody > tr:nth-child(1) > td:nth-child(5) > div.edit_text.edit_class > svg")
	public static WebElement EditClass;
	@FindBy(id = "ns-name6")
	public static WebElement EditStandardName;
	@FindBy(xpath = "//*[@id=\"slot_1\"]/div[2]/label/input")
	public static WebElement EditSection;
	@FindBy(xpath = "//*[@id=\"edits_class\"]/div/div/div[3]/button[2]")
	public static WebElement ClickUpdateBtn;
	@FindBy(xpath = "/html/body/div[40]/div/div[4]/div/button")
	public static WebElement EditOkBtn;
	//delete
	@FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/div/div/div[2]/div[1]/nav/div/button[1]")
	public static WebElement  clickClass;
	@FindBy(xpath = "//*[@id=\"DataTables_Table_6\"]/tbody/tr[1]/td[1]/input")
	public static WebElement ClickChkBox1;
	@FindBy(xpath = "//*[@id=\"DataTables_Table_6\"]/tbody/tr[2]/td[1]/input")
	public static WebElement ClickChkBox2;
	@FindBy(xpath = "//*[@id=\"nav-class\"]/div[1]/div[2]/div[4]/button[1]")
	public static WebElement DleteBtn;
	@FindBy(xpath = "/html/body/div[40]/div/div[3]/div[2]/button")
	public static WebElement Confirmation;
	@FindBy(xpath = "/html/body/div[40]/div/div[4]/div/button")
	public static WebElement Success;


	

	
	
	
	@FindBy(css = "#DataTables_Table_6 > tbody > tr:nth-child(1) > td:nth-child(5) > div.delete_text.delete_class > svg")
	public static WebElement DeleteBtn;
	@FindBy(xpath = "//*[@id=\"delete_class\"]/div/div/div[3]/button[2]")
	public static WebElement DeleteConfirmationBtn;
	@FindBy(xpath = "/html/body/div[40]/div/div[4]/div/button")
	public static WebElement DeleteSuccessMsg;
	
	
	
	
	
	//Subject crud
	@FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/div/div/div[2]/div[1]/nav/div/button[3]")
	public static WebElement ClickSubjectBtn;
	@FindBy(xpath = "//*[@id=\"nav-subject\"]/div[1]/div[2]/div[4]/button[2]")
	public static WebElement ClickAddSubject;
	@FindBy(id = "ne-name2")
	public static WebElement EnterSubjectId;
	@FindBy(id = "ne-name1")
	public static WebElement EnterSubjectName;

	@FindBy(xpath="//*[@id=\"add_subject\"]/div/div/div[3]/button[2]")
	public static WebElement CreatenewSubBtn;
	@FindBy(xpath="/html/body/div[40]/div/div[4]/div/button")
	public static WebElement SuccessBtn;
	//Edit Subject
	@FindBy(css = "#DataTables_Table_8 > tbody > tr:nth-child(1) > td:nth-child(4) > div.edit_text.edit_sub > svg")
	public static WebElement ClickSubEditLogo;
	@FindBy(xpath = "//*[@id=\"ne-name5\"]")
	public static WebElement ClickSubEditInputId;
	@FindBy(xpath = "//*[@id=\"ne-name4\"]")
	public static WebElement ClickSubEditInputSubjectName;
	@FindBy(xpath = "//*[@id=\"edite_subject\"]/div/div/div[3]/button[2]")
	public static WebElement ClickSubEditUpdateBtn;
	@FindBy(xpath = "/html/body/div[40]/div/div[4]/div/button")
	public static WebElement ClickSubEditUpdateSuccessBtn;
	//delete subject
	@FindBy(xpath = "//*[@id=\"DataTables_Table_8\"]/tbody/tr[1]/td[4]/div[2]")
	public static WebElement ClickDeleteSubLogo;
	@FindBy(xpath = "//*[@id=\"delete_sub\"]/div/div/div[3]/button[2]")
	public static  WebElement ClickDeleteConfirmationBtn;
	@FindBy(xpath = "/html/body/div[40]/div/div[4]/div/button")
	public static WebElement ClickDeleteSuccessBtn;
	
	//Subject mapping
	@FindBy(xpath="/html/body/div[1]/main/div[2]/div[1]/div/div/div[2]/div[1]/nav/div/button[4]")
	public static WebElement ClickSubjectMapping;
	@FindBy(xpath = "//*[@id=\"nav-subject-mapping\"]/div[1]/div[2]/div[4]/button[2]")
	public static WebElement ClickMapSubject;
	@FindBy(xpath = "//*[@id=\"subject_map_standard_drop\"]")
	public static WebElement SelectStandard;
	@FindBy(id = "subject_map1")
	public static WebElement subject_map1;
	@FindBy(id = "hours1")
	public static WebElement hours1;
	@FindBy(id = "minutes1")
	public static WebElement minutes1;
	@FindBy(xpath = "//*[@id=\"standard_subject\"]/div/div/div[3]/button[2]")
	public static WebElement CreateBtn;
	@FindBy(xpath = "/html/body/div[40]/div/div[4]/div/button")
	public static WebElement MapSuccessMsg;
	//subject mapping edit
	@FindBy(css = "#DataTables_Table_9 > tbody > tr.odd > td:nth-child(6) > div.edit_text.edit_std_sub > svg")
	public static WebElement ClickEditSubjectMapping;
	@FindBy(xpath = "//*[@id=\"edit_subject_Mapping\"]/div/div/div[2]/div/div[3]/p")
	public static WebElement ClickEditAddAnotherSubject;
	@FindBy(css = "#edit_subject_map2")
	public static WebElement ClickSubjectDropDown;
	@FindBy(css = "#edit_hours2")
	public static WebElement ClickSubjectHours;
	@FindBy(css = "#edit_minutes2")
	public static WebElement ClickMinutes;
	@FindBy(xpath = "//*[@id=\"edit_subject_Mapping\"]/div/div/div[3]/button[2]")
	public static WebElement ClickEditUpdateBtn;
	@FindBy(xpath = "/html/body/div[40]/div/div[4]/div/button")
	public static WebElement ClickEditSuccessBtn;
	
	//subject mapping delete//#DataTables_Table_9 > tbody > tr > td:nth-child(6) > div.delete_text.delete_std_sub > svg
	@FindBy(css = "#DataTables_Table_9 > tbody > tr > td:nth-child(6) > div.delete_text.delete_std_sub > svg")
	public static WebElement ClickDeleteBtn;
	@FindBy(xpath = "//*[@id=\"delete_std_sub\"]/div/div/div[3]/button[2]")
	public static WebElement ConfirmationMsg;
	@FindBy(xpath = "/html/body/div[40]/div/div[4]/div/button")
	public  static WebElement SubMappingSuccessMsg;
}
