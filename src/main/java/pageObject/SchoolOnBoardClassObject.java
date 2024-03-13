package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SchoolOnBoardClassObject {
@FindBy(xpath = "/html/body/section/div/div[2]/div[2]/div[4]/div[4]/a")
public static WebElement DownloadFile;

@FindBy(xpath = "/html/body/section/div/div[2]/div[2]/div[4]/div[6]/div[2]/div[2]/label")///html/body/section/div/div[2]/div[2]/div[4]/div[6]/div[2]/div[2]/label
public static WebElement reUploadFiles;

@FindBy(xpath = "/html/body/div[8]/div/div[4]/div/button")
public static WebElement SuccessMsg;

@FindBy(xpath = "/html/body/section/div/div[2]/div[2]/div[4]/div[7]/button")
public static WebElement continueBtn;


}
