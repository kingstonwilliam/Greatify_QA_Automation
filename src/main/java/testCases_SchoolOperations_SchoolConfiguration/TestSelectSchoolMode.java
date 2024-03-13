package testCases_SchoolOperations_SchoolConfiguration;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFunction;
import pageObject_SchoolOperation_SchoolConfiguration.TestSchoolModeObject;

public class TestSelectSchoolMode extends CommonFunction{
 @Test(priority=(0))
    public void SelectSchoolMode() throws InterruptedException {
	try {
		PageFactory.initElements(driver, TestSchoolModeObject.class);
		Thread.sleep(2000);
		TestSchoolModeObject.clickSchoolMode.click();
		Thread.sleep(2000);
		TestSchoolModeObject.ToggleBtn.click();
		Thread.sleep(2000);
		TestSchoolModeObject.ConfirmationMsg.click();
		Thread.sleep(2000);
		TestSchoolModeObject.OkBtn.click();
	}catch (Exception e) {
           PageFactory.initElements(driver, TestSchoolModeObject.class);
           TestSchoolModeObject.errorMsg.click();     
           TestSchoolModeObject.TurnOffline.click();
           Thread.sleep(2000);
           TestSchoolModeObject.TurnOfflineSuccessMsg.click();
           
	}
	}
}
