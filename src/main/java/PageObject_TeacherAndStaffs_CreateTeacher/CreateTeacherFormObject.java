package PageObject_TeacherAndStaffs_CreateTeacher;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateTeacherFormObject {
	@FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div[5]/div[3]/div/div/div[1]/label/input")
	public static WebElement Name;
	@FindBy(xpath = "//*[@id=\"date_pickers\"]")
	public static WebElement DateOfBirth;
	@FindBy(xpath = "//*[@id=\"teacher_view\"]/div[3]/div/div/div[3]/select/option[2]")
	public static WebElement GenderOption;
	@FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div[5]/div[3]/div/div/div[4]/label/input")
	public static WebElement TeacherId;
	@FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div[5]/div[3]/div/div/div[5]/label/input")
	public static WebElement EmailAddress;
	@FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div[5]/div[3]/div/div/div[6]/label/div/input")
	public static WebElement MobileNo;
	@FindBy(xpath = "//*[@id=\"teacher_view\"]/div[3]/div/div/div[7]/div/label/select/option[8]")
	public static WebElement ChooseBloodGroup;
	@FindBy(xpath = "//*[@id=\"name1\"]/option[2]")
	public static WebElement SelectSubject1;
	@FindBy(xpath = "//*[@id=\"name1\"]/option[3]")
	public static WebElement SelectSubject2;
	@FindBy(xpath = "//*[@id=\"name1\"]/option[4]")
	public static WebElement SelectSubject3;
	@FindBy(xpath = "//*[@id=\"name1\"]/option[5]")
	public static WebElement SelectSubject4;
	@FindBy(xpath = "//*[@id=\"name1\"]/option[6]")
	public static WebElement SelectSubject5;
	@FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div[5]/div[3]/div/div/div[9]/label/input")
	public static WebElement EnterFatherName;
	@FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div[5]/div[3]/div/div/div[10]/label/input")
	public static WebElement EnterFatherOccupation;
	@FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div[5]/div[3]/div/div/div[11]/label/input")
	public static WebElement MotherName;
	@FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div[5]/div[3]/div/div/div[12]/label/input")
	public static WebElement EnterMotherOccupation;
	@FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div[5]/div[3]/div/div/div[13]/label/input")
	public static WebElement EnterNationality;
	@FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div[5]/div[3]/div/div/div[14]/label/input")
	public static WebElement EnterReligion;
	@FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div[5]/div[3]/div/div/div[15]/select")
	public static WebElement ChooseCasteCategory;
	@FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div[5]/div[3]/div/div/div[16]/label/input")
	public static WebElement EnterLanguageSpoken;
	@FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div[5]/div[3]/div/div/div[17]/label/input")
	public static WebElement EnterLanguageWritten;
	@FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div[5]/div[3]/div/div/div[18]/label/input")
	public static WebElement ContactAddress;
	@FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div[5]/div[3]/div/div/div[19]/label/input")
	public static WebElement OfficailAddress;
	@FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div[5]/div[3]/div/div/div[20]/label/div/input")
	public static WebElement EnterMobileNo2;
	@FindBy(xpath = "//*[@id=\"teacher_view\"]/div[3]/div/div/div[21]/select/option[2]")
	public static WebElement ClassCategory;
	    //EDUCATIONAL INFO
	@FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div[5]/div[3]/div/div/div[22]/div/div/div/div[1]/div[1]/label/input")
	public static WebElement Qualification;
	@FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div[5]/div[3]/div/div/div[22]/div/div/div/div[1]/div[2]/label/input")
	public static WebElement EnterPassingHere;
	@FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div[5]/div[3]/div/div/div[22]/div/div/div/div[2]/div[1]/label/input")
	public static WebElement EnterMarksHere;
	@FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div[5]/div[3]/div/div/div[22]/div/div/div/div[2]/div[2]/label/input")
	public static WebElement EnterUniversityHere;
	@FindBy(id = "ctc")
	public static WebElement EnterCtc;
	@FindBy(xpath = "//*[@id=\"teacher_view\"]/div[3]/div/div/div[24]/button")
	public static WebElement ClickContinueBtn;
	
	@FindBy(xpath = "//*[@id=\"pills-home\"]/div[1]/div[2]/div[6]/button")
	public static WebElement ClickAddTeachers;
	@FindBy(xpath = "/html/body/div[7]/div/div[2]/div/button")
	public static WebElement ClickOkBtn;
}
