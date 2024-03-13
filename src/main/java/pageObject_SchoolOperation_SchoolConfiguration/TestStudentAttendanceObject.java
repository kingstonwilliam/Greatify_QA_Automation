package pageObject_SchoolOperation_SchoolConfiguration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestStudentAttendanceObject {
	@FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/div/div/div[1]/div/nav/div/button[4]")
public static WebElement ClickStudentAttendancePercentage;
	@FindBy(linkText = "Configure Now")
	public static WebElement ClickConfigureNow;
	@FindBy(xpath = "//*[@id=\"edit_configure_now\"]/div/div/div[2]/div[2]/div/input")
	public static WebElement PercetageInput;
	@FindBy(xpath="//*[@id=\"edit_configure_now\"]/div/div/div[3]/button[2]")
	public static WebElement configureNow;
	@FindBy(xpath = "/html/body/div[40]/div/div[4]/div/button")
	public static WebElement  SuccessfullMsg;
	@FindBy(xpath = "/html/body/div[40]/div/div[3]/div/button")
	public static WebElement ErrorOkMsg;
}
