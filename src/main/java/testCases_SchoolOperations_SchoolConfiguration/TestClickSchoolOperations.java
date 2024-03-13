package testCases_SchoolOperations_SchoolConfiguration;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFunction;
import pageObject.EmailSearchFiterObject;
import pageObject_SchoolOperation_SchoolConfiguration.ClickSchoolOperationObject;

public class TestClickSchoolOperations extends CommonFunction{
	@Test(priority=0)
	public void clickSchoolOperation() throws InterruptedException {
		PageFactory.initElements(driver,ClickSchoolOperationObject.class);
		Thread.sleep(8000);
		ClickSchoolOperationObject.clickSchoolOperationBtn.click();
		Thread.sleep(2000);
		ClickSchoolOperationObject.clickSchoolConfiguration.click();
	}
}
