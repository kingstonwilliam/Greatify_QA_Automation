package testCases_SchoolOperations_CreateClass;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFunction;
import pageObject_SchoolOperation_CreateClass.ClickClass;

public class TestClickClass extends CommonFunction{
	@Test (priority=(0))
public void clickClass() throws InterruptedException {
		Thread.sleep(3000);
	PageFactory.initElements(driver, ClickClass.class);
	ClickClass.ClickClass.click();
	
     }
}
