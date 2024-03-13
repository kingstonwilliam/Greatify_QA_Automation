package PageObject_TeacherAndStaffs_CreateTeacher;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeacherUploadDocumentObject {
	@FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div[6]/div[3]/div/div[1]/div[1]/label[1]/img")
	public static WebElement ClickUpload1;

	@FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div[6]/div[3]/div/div[1]/div[2]/label[1]/img")
	public static WebElement ClickUpload2;

	@FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div[6]/div[3]/div/div[1]/div[3]/label[1]/img")
	public static WebElement ClickUpload3;

	@FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div[6]/div[3]/div/div[1]/div[4]/label[1]/img")
	public static WebElement ClickUpload4;
	
	@FindBy(xpath = "//*[@id=\"continue_step3\"]/div[3]/div/div[1]/div[5]/label[1]/img")
	public static WebElement ClickUpload5;
	
	@FindBy(xpath = "//*[@id=\"continue_step3\"]/div[3]/div/div[2]/div[1]/div[2]/label/p")
	public static WebElement ClickUpload6;
	@FindBy(xpath = "//*[@id=\"continue_step3\"]/div[3]/div/div[2]/div[2]/button")
	public static WebElement SubmtBtn;
	
	@FindBy(css="#Successfully > div > div > div.modal-body > div > button")
	public static WebElement SuccessBtn;
	@FindBy(xpath = "//*[@id=\"sideTeacher\"]/a/span")
	public static WebElement ClickTeacherNavBar;

}
