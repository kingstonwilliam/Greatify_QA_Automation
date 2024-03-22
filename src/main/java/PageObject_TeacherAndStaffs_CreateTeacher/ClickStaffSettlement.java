package PageObject_TeacherAndStaffs_CreateTeacher;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickStaffSettlement {
	//CREATE TEACHING STAFF
	@FindBy(xpath = "//*[@id=\"sideEmployeSettlement\"]/a/span")
    public static WebElement ClickStaffSettlement;
	@FindBy(xpath = "//*[@id=\"pills-home\"]/div[1]/div[2]/div[2]/button")
	public static WebElement ClickGenerateSettlement;
	@FindBy(xpath = "//*[@id=\"teacher-emp-dropdwn\"]/option[2]")
	public static WebElement ChooseTeacher;
	@FindBy(xpath = "//*[@id=\"create_teacher_pf_amt\"]")
	public static WebElement PfAmount;
	@FindBy(xpath = "//*[@id=\"create_teacher_settle_amt\"]")
	public static WebElement SettlementAmount;
	@FindBy(xpath = "//*[@id=\"generate_settlements\"]/div/div/div[2]/div/div[3]/div/div[2]/label/p")
	public static WebElement UploadDocument;
	@FindBy(xpath = "//*[@id=\"generate_settlements\"]/div/div/div[3]/button[2]")
	public static WebElement GenerateSettlement;
	@FindBy(css = "body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div > button")
	public static WebElement SuccessMsg;
	//EDIT TEACHING SETTLEMENT
	@FindBy(css = "#teaching_employee_table > tbody > tr > td:nth-child(6) > div.edit_text.teachingsettle-edit > svg")
	public static WebElement EditStaffSettlement;
	@FindBy(xpath = "//*[@id=\"edit_teacher_pf_amt\"]")
	public static WebElement EditPfAmount;
	@FindBy(xpath = "//*[@id=\"edit_teacher_settle_amt\"]")
	public static WebElement EditSettlementPfAmount;
	@FindBy(xpath = "//*[@id=\"editgenerate_settlements_0\"]/div/div/div[3]/button[2]")
	public static WebElement EditUpdate;
	@FindBy(xpath = "/html/body/div[8]/div/div[4]/div/button")
	public static WebElement EditSuccessMsg;
	//DELETE TEACHING SETTLEMENT
	@FindBy(css = "#teaching_employee_table > tbody > tr > td:nth-child(6) > div.delete_text.delete > svg")
	public static WebElement ClickDeleteLogo;
	@FindBy(xpath = "/html/body/div[8]/div/div[3]/div[2]/button")
	public static WebElement ConfirmationBtn;
	@FindBy(css = "body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div > button")
	public static WebElement DeleteSuccessMsg;
	//GENERATE NON TEACHING SETTLEMENT
	@FindBy(xpath = "//*[@id=\"pills-profile-tab\"]")
	public static WebElement ClickNonTeachingSettlement;
	@FindBy(xpath = "//*[@id=\"teacher_attendace\"]/div[1]/div[2]/div[2]/button")
	public static WebElement NonteachingGenerateSettlement;
	@FindBy(xpath = "//*[@id=\"non_teacher-emp-dropdwn\"]/option[2]")
	public static WebElement ChooseNonTeachingEmployee;
	@FindBy(xpath = "//*[@id=\"create_non_teacher_pf_amt\"]")
	public static WebElement NonTeachingPf;
	@FindBy(xpath = "//*[@id=\"create_non_teacher_settle_amt\"]")
	public static WebElement NonTeachingSettlementAmount;
	@FindBy(xpath = "//*[@id=\"generate_settlements_2\"]/div/div/div[2]/div/div[3]/div/div[2]/label/p")
	public static WebElement NonTeachingUploadDocument;
	@FindBy(xpath = "//*[@id=\"generate_settlements_2\"]/div/div/div[3]/button[2]")
	public static WebElement NonTeachingGenerateBtn;
	@FindBy(css = "body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div > button")
    public static WebElement NonTeachingSuccessMsg;
	//EDIT NON TEACHING SETTLEMENT
	@FindBy(css = "#non-teaching_employee_table > tbody > tr > td:nth-child(6) > div.edit_text.non_teachingsettle-edit > svg")
	public static WebElement EditNonTeachingSettlement;
	@FindBy(xpath = "//*[@id=\"edit_non_teacher_pf_amt\"]")
	public static WebElement EditNonTeachingPfAmount;
	@FindBy(xpath = "//*[@id=\"edit_non_teacher_settle_amt\"]")
	public static WebElement EditNonTeachingSettlementAmt;
	@FindBy(xpath = "//*[@id=\"editgenerate_settlements_1\"]/div/div/div[3]/button[2]")
	public static WebElement EditNonTeachingUpdateBtn;
	@FindBy(xpath = "/html/body/div[8]/div/div[4]/div/button")
	public static WebElement EditNonTeachingSuccessMsg;
	//DELETE NON TEACHING SETTLEMENT
	@FindBy(css="#non-teaching_employee_table > tbody > tr > td:nth-child(6) > div.delete_text.delete > svg")
	public static WebElement NonTeachingDeleteLogo;
	@FindBy(xpath="/html/body/div[8]/div/div[3]/div[2]/button")
	public static WebElement NonTeachingConfirmation;
	@FindBy(css="body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div > button")
	public static WebElement NonTeachingDeleteSuccessMsg;
	
	
	
	
   
}
