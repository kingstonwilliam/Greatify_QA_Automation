package pageObject_SchoolOperation_ManageStudentt;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickAddStudentObject {
	@FindBy(xpath = "//*[@id=\"pills-home\"]/div[1]/div[2]/div[4]/button[2]")
	public static WebElement ClickAddStudent;
	
	@FindBy(xpath = "//*[@id=\"name1\"]")
	public static WebElement ClickStudentName;
	
	@FindBy(xpath = "//*[@id=\"add_date_pickers\"]")
	public static WebElement ClickChooseDate;	
	
	@FindBy(xpath = "//*[@id=\"add_student_view\"]/div[3]/div[1]/div[2]/div[1]/select")
	public static WebElement ClickChooseGender;	
	
	@FindBy(id = "name4")
	public static WebElement ClickStudentId;	
	
	@FindBy(id = "name5")
	public static WebElement ClickStudentRollNo;	
	
	@FindBy(id = "name6")
	public static WebElement ClickEnterAdmission;	
	
	@FindBy(id = "name7")
	public static WebElement ClickStudentPhoneNo;	
	
	@FindBy(id = "name9")
	public static WebElement ClickChooseClass;	
	
	@FindBy(xpath = "//*[@id=\"add_student_view\"]/div[3]/div[1]/div[3]/div[4]/select")
	public static WebElement ClickChooseBloodGroup;	
	
	@FindBy(id = "name11")
	public static WebElement ClickParentId;	
	
	@FindBy(id = "name12")
	public static WebElement ClickEnterAddress;	
	
	@FindBy(xpath = "//*[@id=\"add_student_view\"]/div[3]/div[1]/div[3]/div[7]/label/input")
	public static WebElement ClickEnterLocation;	
	
	@FindBy(id = "name13")
	public static WebElement ClickEnterFatherName;	
	
	@FindBy(id = "name14")
	public static WebElement ClickEnterFatherEmail;	
	
	@FindBy(id = "name15")
	public static WebElement ClickFatherMobileNumber1;	
	
	@FindBy(id = "name16")
	public static WebElement ClickFatherMobileNumber2;	
	@FindBy(id = "name17")
	public static WebElement ClickMotherName;	
	
	@FindBy(id = "name18")
	public static WebElement ClickEnterMotherEmail;	
	
	@FindBy(id = "name19")
	public static WebElement ClickMotherMobileNo1;	
	
	@FindBy(id = "name20")
	public static WebElement ClickMotherMobileNo2;	
	
	@FindBy(id = "name21")
	public static WebElement ClickEnterFatherOccupation;	
	
	@FindBy(id = "name22")
	public static WebElement ClickMotherOccupation;	
	
	@FindBy(id = "name23")
	public static WebElement ClickEnterFatherAnnualIncome;
	
	@FindBy(id = "name24")
	public static WebElement ClickEnterMotherAnnualIncome;
	
	@FindBy(id = "name25")
	public static WebElement ClickEnterHouseMobileNo;	
	
	@FindBy(xpath = "//*[@id=\"add_student_view\"]/div[3]/div[4]/button")
	public static WebElement ClickContinueBtn;
	
	//previous Academic Detail
	@FindBy(xpath = "/html/body/div[1]/main/div/div[2]/div[5]/div[4]/div[1]/div[3]/div[3]/div[1]/div[1]/label/input")
	public static WebElement EnterSchoolName;
	
	@FindBy(xpath = "//*[@id=\"add_student_view\"]/div[3]/div[3]/div[1]/div[2]/select")
	public static WebElement ChoosePreviousBoard;
	
	@FindBy(xpath = "/html/body/div[1]/main/div/div[2]/div[5]/div[4]/div[1]/div[3]/div[3]/div[2]/div[1]/label/input")
	public static WebElement EnterMarkObtained;
	
	@FindBy(xpath = "/html/body/div[1]/main/div/div[2]/div[5]/div[4]/div[1]/div[3]/div[3]/div[2]/div[2]/label/input")
	public static WebElement EnterClassHere;
	@FindBy(id = "name28")
	public static WebElement EnterPercentage;
	@FindBy(id = "name29")
	public static WebElement EnterRepresentative;
}
