package testCases_SchoolOperations_ManageSchool;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFunction;
import pageObject_SchoolOperation_ManageSchool.ClickManageClassObject;

public class TestManageSchool extends CommonFunction {
	@Test(priority=(0))
     public void ClickManageSchool() throws InterruptedException {
		Thread.sleep(3000);
    	 PageFactory.initElements(driver, ClickManageClassObject.class);
    	 ClickManageClassObject.ClickManageClass.click();
    	 Thread.sleep(2000);
         ClickManageClassObject.CreateClass.click();    	 
     }
}
