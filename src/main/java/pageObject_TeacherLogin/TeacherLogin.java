package pageObject_TeacherLogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//visitor login entry
public class TeacherLogin {
	@FindBy(xpath = "//*[@id=\"mobile_code\"]")
  public static WebElement MobileNo;
	@FindBy(xpath = "//*[@id=\"loginSection\"]/div/button")
	public static WebElement SendOtp;
	
}
