package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SchoolOnBoardTeacherObject {

	@FindBy(xpath ="/html/body/section/div/div[2]/div[2]/div[3]/div[4]/a")
	public static WebElement downloadTeacherFile;
	
	@FindBy(xpath = "/html/body/section/div/div[2]/div[2]/div[3]/div[6]/div[2]/div[2]/label")
	public static WebElement reUploadFiles;
	
	@FindBy(xpath = "/html/body/div[8]/div/div[4]/div/button")
	public static WebElement SuccessfulMsg;
	
	@FindBy(xpath = "/html/body/section/div/div[2]/div[2]/div[3]/div[9]/button")
	public static WebElement continueBtn; 
}
