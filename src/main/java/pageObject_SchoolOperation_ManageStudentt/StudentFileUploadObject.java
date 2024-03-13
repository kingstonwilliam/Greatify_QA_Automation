package pageObject_SchoolOperation_ManageStudentt;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentFileUploadObject {
	@FindBy(xpath = "//*[@id=\"student_con\"]/div[3]/div/div[1]/label[1]/img")
	public static WebElement ClickUpload1;
	@FindBy(xpath = "//*[@id=\"student_con\"]/div[3]/div/div[1]/label[2]/img")
	public static WebElement ClickUpload2;
	@FindBy(xpath = "//*[@id=\"student_con\"]/div[3]/div/div[1]/label[3]/img")
	public static WebElement ClickUpload3;
	@FindBy(xpath = "//*[@id=\"student_con\"]/div[3]/div/div[1]/label[4]/img")
	public static WebElement ClickUpload4;
	@FindBy(xpath = "//*[@id=\"student_con\"]/div[3]/div/div[1]/label[5]/img")
	public static WebElement ClickUpload5;
	@FindBy(xpath = "//*[@id=\"student_con\"]/div[3]/div/div[1]/label[6]/img")
	public static WebElement ClickUpload6;
	@FindBy(xpath="//*[@id=\"student_con\"]/div[3]/div/div[2]/div/button")
	public static WebElement submtBtn;
	@FindBy(xpath = "/html/body/div[5]/div/div[4]/div/button")
	public static WebElement ClickSuccessBtn;

}
