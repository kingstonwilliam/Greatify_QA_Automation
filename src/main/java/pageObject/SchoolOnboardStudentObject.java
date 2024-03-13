package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SchoolOnboardStudentObject {
	@FindBy(xpath = "/html/body/section/div/div[2]/div[2]/div[5]/div[4]/a")
public static WebElement downLoadFile;
	@FindBy(xpath = "/html/body/section/div/div[2]/div[2]/div[5]/div[6]/div[2]/div[2]/label")
	public static WebElement reUploadFile;
	@FindBy(xpath = "/html/body/div[8]/div/div[4]/div/button")
  public static WebElement clickSuccessfulMsg;
	@FindBy(xpath = "/html/body/section/div/div[2]/div[2]/div[5]/div[7]/button")
	public static WebElement continueBtn;
	
}
