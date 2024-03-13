package PageObject_Non_Teaching_Staffs_Create_Non_Teaching_Staff;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NonTeachingEmployeeForm {
	@FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/div[1]/div[2]/div[6]/button")
	public static WebElement AddEmployeeBtn;
	@FindBy(xpath = "//*[@id=\"name1\"]")
    public static WebElement ClickEnterName;
	@FindBy(xpath = "//*[@id=\"academic_end_year\"]")
	public static WebElement ClickDate;
	@FindBy(xpath = "//*[@id=\"add_student_view\"]/div[3]/div[1]/div[2]/div[1]/select/option[2]")
	public static WebElement ChooseGender;
	@FindBy(xpath = "/html/body/div[1]/main/div[2]/div[6]/div[3]/div[1]/div[2]/div[2]/label/input")
	public static WebElement EmployeeId;
	@FindBy(xpath = "/html/body/div[1]/main/div[2]/div[6]/div[3]/div[1]/div[2]/div[3]/label/input")
	public static WebElement EmailAddress;
	@FindBy(xpath = "//*[@id=\"name6\"]")
	public static WebElement MobileNo;
	@FindBy(xpath = "//*[@id=\"add_student_view\"]/div[3]/div[1]/div[2]/div[5]/select/option[8]")
	public static WebElement BloodGroup;
	@FindBy(xpath = "//*[@id=\"name8\"]")
	public static WebElement DrivingLicense;
	@FindBy(xpath = "//*[@id=\"add_student_view\"]/div[3]/div[1]/div[3]/div[1]/label/input")
	public static WebElement DrivingLicenseExpiryDate;
	@FindBy(xpath = "/html/body/div[1]/main/div[2]/div[6]/div[3]/div[1]/div[3]/div[2]/label/input")
	public static WebElement EnterFatherName;
	@FindBy(xpath = "//*[@id=\"name9\"]")
	public static WebElement EnterFatherOccupation;
	@FindBy(xpath = "//*[@id=\"name10\"]")
	public static WebElement MotherName;
	@FindBy(xpath = "//*[@id=\"name11\"]")
	public static WebElement MotherOccupation;
	@FindBy(xpath = "/html/body/div[1]/main/div[2]/div[6]/div[3]/div[1]/div[4]/div[3]/label/input")
	public static WebElement NationalityName;
	@FindBy(xpath = "/html/body/div[1]/main/div[2]/div[6]/div[3]/div[1]/div[5]/div[1]/label/input")
	public static WebElement ReligionName;
	@FindBy(xpath = "//*[@id=\"add_student_view\"]/div[3]/div[1]/div[5]/div[2]/select/option[3]")
	public static WebElement ChooseCategory;
	@FindBy(xpath = "//*[@id=\"name14\"]")
	public static WebElement EnterLanguageWritten;
	@FindBy(xpath = "//*[@id=\"name15\"]")
	public static WebElement EnterLanguageSpoken;
	@FindBy(xpath = "//*[@id=\"name16\"]")
	public static WebElement EnterAddress1;
	@FindBy(xpath = "//*[@id=\"name17\"]")
	public static WebElement EnterAddress2;
	@FindBy(xpath = "//*[@id=\"name18\"]")
	public static WebElement EnterMobileNo2;
	@FindBy(xpath = "//*[@id=\"name19\"]")
	public static WebElement Qualification;
	@FindBy(xpath = "//*[@id=\"name20\"]")
	public static WebElement EnterPassingHere;
	@FindBy(xpath = "//*[@id=\"name21\"]")
	public static WebElement EnterCgpa;
	@FindBy(xpath = "//*[@id=\"name22\"]")
	public static WebElement EnterUniversity;
	@FindBy(xpath = "//*[@id=\"ctc\"]")
	public static WebElement EnterCtc;
	@FindBy(xpath = "/html/body/div[1]/main/div[2]/div[6]/div[3]/div[2]/button")
	public static WebElement ContinueBtn;
	@FindBy(css = "#successfully > div > div > div.modal-body > div > button")
	public static WebElement SuccessMsg;
	@FindBy(xpath = "/html/body/div[6]/div/div[3]/div/button")
	public static WebElement OkBtn;
}