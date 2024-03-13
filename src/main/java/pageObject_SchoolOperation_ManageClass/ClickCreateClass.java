package pageObject_SchoolOperation_ManageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickCreateClass {
	@FindBy(xpath = "/html/body/div[1]/main/div/div[2]/div[1]/div[1]/div[2]/div[4]/button")
public static WebElement ClickCreateClassBtn;
	
	@FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div[1]/div[3]/div[1]/select/option[2]")
	public static WebElement SelectStandard;
	
	@FindBy(xpath = "//*[@id=\"exampleModal\"]/div/div/div[2]/div[1]/div[3]/div[2]/label/input")
	public static WebElement EnterClassId;
	
	@FindBy(id = "namew3")
	public static WebElement EnterSeatingCap;
	
	@FindBy(xpath = "//*[@id=\"namew4\"]/option[2]")
	public static WebElement ChooseClassTeacher;
	
	@FindBy(id = "academic_start_date")
	public static WebElement ChooseStartDate;
	
	@FindBy(id = "academic_end_date")
	public static WebElement ChooseEndDate;
	
	@FindBy(xpath = "//div[2]/div[1]/div[4]/button[2]")
	public static WebElement ClickContinue;
	@FindBy(xpath = "//*[@id=\"exampleModal\"]/div/div/div[2]/div[1]/div[4]/button[1]")
	public static WebElement CancelBtn;
	@FindBy(xpath = "/html/body/div[8]/div/div[3]/div[2]/button")
	public static WebElement ClickCancelConfirmBtn;
	//
	@FindBy(xpath = "/html/body/div[8]/div/div[2]/div/button")
	public static WebElement OkBtn;
	//step2
	@FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/select/option")
	public static WebElement ClickSubjectTeacher1;
	
	@FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div/select/option")
	public static WebElement ClickSubjectTeacher2;
	
	@FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div[2]/div[2]/div[3]/div[2]/div/select/option")
	public static WebElement ClickSubjectTeacher3;
	
	@FindBy(xpath = "//*[@id=\"exampleModal\"]/div/div/div[2]/div[2]/div[3]/button[2]")
	public static WebElement  ClickContinueBtn;
	
	@FindBy(xpath = "//*[@id=\"exampleModal\"]/div/div/div[2]/div[3]/div[3]/a")
	public static WebElement ClickDownloadCsvBtn;
	
	@FindBy(xpath = "//*[@id=\"csv_file_add_name\"]")
	public static WebElement ClickUploadFile;
	@FindBy(xpath="//*[@id=\"exampleModal\"]/div/div/div[2]/div[3]/div[4]/button[2]")
	public static WebElement ClickSubmitBtn;
	@FindBy(xpath = "/html/body/div[8]/div/div[4]/div/button")
	public static WebElement ClickSuccessMsg;
	@FindBy(xpath = "/html/body/div[8]/div/div[2]/div/button")
	public static WebElement ClickOkBtn;
	@FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div[3]/div[4]/button[1]")
	public static WebElement ClickCancelBtn;
	@FindBy(xpath = "/html/body/div[8]/div/div[3]/div[2]/button")
	public static WebElement CancelConfirmationBtn;
	
	
}
